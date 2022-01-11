select
ht.Id,ht.BeneficiaryId,ht.HpId,ht.LocalAmount,ht.ReportedLocalAmount,ht.MatchStatus,ht.PartnerStatus,ht.PartnerReference,ht.RefNumber,ht.TransactionDate,ht.OfferId,ht.LocalCurrency,ht.ForeignCurrency,

-- FlexiVoucher
(select sum(hpd1.Amount) From HelloPaisaDailyLedger hpd1 JOIN HelloPaisaDailyLedger hpd2
on hpd1.RefNumber=hpd2.RefNumber AND hpd1.HpId=hpd2.HpId
where hpd1.TransactionFor=71 AND hpd1.id!=hpd2.id AND hpd2.TransactionFor!=72 AND hpd1.Amount!=hpd2.Amount AND hpd1.HpId=ht.HpId
AND hpd1.TransactionDate>=(ht.TransactionDate - INTERVAL 3 HOUR)) as FlexiVoucherAmount,

-- ScratchCard
(select sum(hpd1.Amount) From HelloPaisaDailyLedger hpd1 JOIN HelloPaisaDailyLedger hpd2
on hpd1.RefNumber=hpd2.RefNumber AND hpd1.HpId=hpd2.HpId
where hpd1.TransactionFor=38 AND hpd1.id!=hpd2.id AND hpd2.TransactionFor!=39 AND hpd1.Amount!=hpd2.Amount AND hpd1.HpId=ht.HpId
AND hpd1.TransactionDate>=(ht.TransactionDate - INTERVAL 3 HOUR)) as ScratchCardAmount,

-- Voucher
(select sum(hpd1.Amount) From HelloPaisaDailyLedger hpd1 where hpd1.TransactionFor=34 AND hpd1.HpId=ht.HpId AND hpd1.TransactionDate>=(ht.TransactionDate - INTERVAL 3 HOUR)) as VoucherAmount,

-- FlexiRateIssued
(select sum(hpd1.Amount) From HelloPaisaDailyLedger hpd1 JOIN HelloPaisaDailyLedger hpd2
on hpd1.RefNumber=hpd2.RefNumber AND hpd1.HpId=hpd2.HpId
where hpd1.TransactionFor=75 AND hpd1.id!=hpd2.id AND hpd2.TransactionFor!=76 AND hpd1.Amount!=hpd2.Amount AND hpd1.HpId=ht.HpId
AND hpd1.TransactionDate>=(ht.TransactionDate - INTERVAL 3 HOUR)) as FlexiRateIssuedAmount,

-- FlexiRateTopUp
(select sum(hpd1.Amount) From HelloPaisaDailyLedger hpd1 where hpd1.TransactionFor=74 AND hpd1.HpId=ht.HpId AND hpd1.TransactionDate>=(ht.TransactionDate - INTERVAL 3 HOUR)) as FlexiRateTopUpAmount,

-- rateCount within last 24hr
(select count(*) from HelloPaisaOfferToken where GeneratedDate>=(ht.TransactionDate-INTERVAL 24 HOUR) AND HpId=ht.HpId) as GeneralRateSeenCount,

-- Same BeneficiaryCount within last 24hr
(select count(*) from HelloPaisaTransactions ht1 where ht1.HpId=ht.HpId AND ht1.BeneficiaryId=ht.BeneficiaryId AND ht1.id!=ht.id AND
ht1.TransactionDate>=(ht.TransactionDate-INTERVAL 24 HOUR)) as SameBeneficiaryCount,

-- Beneficiary Count
(select count(*) from HelloPaisaTransactions ht1 where ht1.HpId=ht.HpId AND ht1.id!=ht.id AND ht1.TransactionDate>=(ht.TransactionDate-INTERVAL 24 HOUR)) as BeneficiaryCount,

-- Get FlexiRate
IFNULL((select hpf.FlexiRate from HelloPaisaFXFLexiRate hpf where ht.MatchStatus=21 AND hpf.OfferId=ht.OfferId),0) as FlexiRate

from HelloPaisaTransactions ht;