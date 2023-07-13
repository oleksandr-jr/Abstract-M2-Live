package org.javarush.FM.transport;

import org.javarush.FM.parcel.Parcel;

public class Plane implements Transport{
    @Override
    public void deliver(Parcel parcel) {
        System.out.println("Plane delivery");
    }
}
