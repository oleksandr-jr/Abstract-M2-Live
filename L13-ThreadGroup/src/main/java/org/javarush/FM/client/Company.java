package org.javarush.FM.client;

import org.javarush.FM.factory.TransportFactory;
import org.javarush.FM.parcel.Parcel;

public class Company {

    public void deliver(Parcel parcel){
        TransportFactory.createTransport(parcel.getDeliveryType()).deliver(parcel);
    }

}
