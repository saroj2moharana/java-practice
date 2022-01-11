db.getCollection('ChannelShippingMethodRules').find().forEach(
    function(myDoc)
    {
       print( "\nId: "+myDoc._id );
       print( "Channel: "+myDoc.channelShippingMethodList[0].channel );

       if(myDoc.channelShippingMethodList[0].channel == "SA"){
           print("SA...");
       }
       if(myDoc.channelShippingMethodList[1] != undefined && myDoc.channelShippingMethodList[1].channel == "GLOBAL"){
            print("GLOBAL...");
       }
    }
);