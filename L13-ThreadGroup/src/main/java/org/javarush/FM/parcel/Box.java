package org.javarush.FM.parcel;

import org.javarush.FM.transport.DeliveryType;

public class Box implements Parcel{
    private int size;
    private final DeliveryType deliveryType;

    public Box(int size, DeliveryType deliveryType) {
        this.size = size;
        this.deliveryType = deliveryType;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public DeliveryType getDeliveryType() {
        return deliveryType;
    }
}
