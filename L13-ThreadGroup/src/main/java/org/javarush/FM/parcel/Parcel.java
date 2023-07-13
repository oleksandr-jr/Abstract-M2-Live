package org.javarush.FM.parcel;

import org.javarush.FM.transport.DeliveryType;

public interface Parcel {

    int getSize();

    DeliveryType getDeliveryType();

}
