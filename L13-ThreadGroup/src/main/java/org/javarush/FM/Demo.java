package org.javarush.FM;

import org.javarush.FM.client.Company;
import org.javarush.FM.creators.RoadLogistic;
import org.javarush.FM.creators.SeaLogistic;
import org.javarush.FM.factory.TransportFactory;
import org.javarush.FM.parcel.Box;
import org.javarush.FM.parcel.Parcel;
import org.javarush.FM.transport.DeliveryType;
import org.javarush.FM.transport.Ship;
import org.javarush.FM.transport.Transport;



public class Demo {
    public static void main(String[] args) {
        Company company = new Company();

        Parcel parcel = new Box(5, DeliveryType.AIR);

        company.deliver(parcel);

    }


}
