package org.javarush.FM.transport;

import org.javarush.FM.parcel.Parcel;

public class Ship implements Transport
{
    @Override
    public void deliver(Parcel parcel) {
        System.out.println("Ship deliver");
    }
}
