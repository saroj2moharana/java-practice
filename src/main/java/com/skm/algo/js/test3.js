db.getCollection('ChannelShippingMethodRules').find().forEach(
    function(myDoc)
    {
       print( "\nId: "+myDoc._id );
       print( "Channel: "+myDoc.channelShippingMethodList[0].channel );

       if(myDoc.channelShippingMethodList[0].channel == "SA"){
            //sa-collection-delivery...
                print("collection & delivery");
                db.ChannelShippingMethodRules.update( { _id: myDoc._id },
                                {$set: {"channelShippingMethodList.0":
                                            {"channel": "SA","orderValueRules": [  {"currency": "ZAR","minOrderValue": 150,"maxOrderValue": 5000  }],"shippingMethodSupport": [  "collection",  "delivery"],"shippingMethodRules": [{"shippingMethod": "collection","customerGroupId": [  NumberInt(3),  NumberInt(5),  NumberInt(6),  NumberInt(7)]  },  {"shippingMethod": "delivery","customerGroupId": [  NumberInt(5),  NumberInt(6),  NumberInt(7)]  }  ],"shippingChargesRules": [  {"shippingMethod": "collection","charges": [  {"currency": "ZAR","type": "FIXED","collectionCharges": 0,"_class": "za.co.hellogroup.locationService.model.CollectionShippingCharges"  }]  },  {"shippingMethod": "delivery","charges": [  {"minOrderValueForFreeDelivery": 1500,"minOrderValueForDelivery": 500,"currency": "ZAR","type": "FIXED","deliveryCharges": 0,"areaLevelCharges": [  {"areaName": "Area1","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area2","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area3","chargeType": "FIXED","chargeValue": 0  }],"_class": "za.co.hellogroup.locationService.model.DeliveryShippingCharges"  }]  }]}
                                    }});

       }
       if(myDoc.channelShippingMethodList[1] != undefined && myDoc.channelShippingMethodList[1].channel == "GLOBAL"){
                   //sa-collection-delivery...
                       print("collection & delivery");
                       db.ChannelShippingMethodRules.update( { _id: myDoc._id },
                           {$set: {"channelShippingMethodList.1":
                                   {"channel": "GLOBAL","orderValueRules": [  {"currency": "USD","minOrderValue": 10,"maxOrderValue": 900  },  {"currency": "GBP","minOrderValue": 8,"maxOrderValue": 750  }],"shippingMethodSupport": [  "collection",  "delivery"],"shippingMethodRules": [  {"shippingMethod": "collection","customerGroupId": [  NumberInt(3),  NumberInt(5),  NumberInt(6),  NumberInt(7)]  },
                                   {"shippingMethod": "delivery","customerGroupId": [  NumberInt(5),  NumberInt(6),  NumberInt(7)]  }  ],"shippingChargesRules": [
                                   {"shippingMethod": "collection","charges": [  {"currency": "USD","type": "FIXED","collectionCharges": 0,"_class": "za.co.hellogroup.locationService.model.CollectionShippingCharges"  },  {"currency": "GBP","type": "FIXED","collectionCharges": 0,"_class": "za.co.hellogroup.locationService.model.CollectionShippingCharges"  }]  },  {"shippingMethod": "delivery","charges": [  {"minOrderValueForFreeDelivery": 300,"minOrderValueForDelivery": 30,"currency": "USD","type": "FIXED","deliveryCharges": 0,"areaLevelCharges": [  {"areaName": "Area1","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area2","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area3","chargeType": "FIXED","chargeValue": 0  }],"_class": "za.co.hellogroup.locationService.model.DeliveryShippingCharges"  },  {"minOrderValueForFreeDelivery": 240,"minOrderValueForDelivery": 24,"currency": "GBP","type": "FIXED","deliveryCharges": 0,"areaLevelCharges": [  {"areaName": "Area1","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area2","chargeType": "FIXED","chargeValue": 0  },  {"areaName": "Area3","chargeType": "FIXED","chargeValue": 0  }],"_class": "za.co.hellogroup.locationService.model.DeliveryShippingCharges"  }]  }]}
                           }});

              }
}

)