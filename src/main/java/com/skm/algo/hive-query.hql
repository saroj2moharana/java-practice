hive -e 'select ht.id,hc.FirstName as CustomerName,hc.HgId as CustomerId,hc.Gender,hc.IdType,ht.BeneficiaryId,b.FirstName as BeneficiaryName,
ht.RefNumber,ht.LocalAmount as TransactionAmount, ht.ReportedLocalAmount,ht.LocalCurrency,ht.ForeignCurrency,COALESCE(ht.FlexiVoucherAmount,0),
COALESCE(ht.ScratchCardAmount,0), COALESCE(ht.VoucherAmount,0), COALESCE(ht.FlexiRateIssuedAmount,0), COALESCE(ht.FlexiRateTopUpAmount,0),
ht.SameBeneficiaryCount, ht.BeneficiaryCount, ht.FlexiRate,ht.MatchStatus,ht.PartnerStatus,ht.TransactionDate,hc.Nationality as CustomerNationality,
ht.ForeignCurrency as BeneficiaryCurrency,hp.PartnerString as PayOutType
from
HelloPaisaTransactions ht,
HelloPaisaCustomer hpc,
HelloCustomer hc,
HelloPaisaBeneficiary b,
HelloPaisaBanks hb,
HelloPaisaPayOutTypes hp
where ht.HpId=hpc.HpId and hpc.HgId=hc.HgId and ht.BeneficiaryId=b.id and b.BankId=hb.id and hp.id=hb.type order by ht.id desc limit 10000' | sed 's/[\t]/,/g' > /home/saroj/HPTransactions.csv