package org.javarush.FM.creators;

import org.javarush.FM.parcel.Parcel;
import org.javarush.FM.transport.Transport;

public abstract class Logistic {

    public void deliver(Parcel parcel){
        createTransport().deliver(parcel);
    }

    public abstract Transport createTransport();
}
