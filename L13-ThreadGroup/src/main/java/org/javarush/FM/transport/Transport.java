package org.javarush.FM.transport;

import org.javarush.FM.parcel.Parcel;

public interface Transport {
    void deliver(Parcel parcel);
}
