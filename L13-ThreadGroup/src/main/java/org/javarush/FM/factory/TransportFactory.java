package org.javarush.FM.factory;

import org.javarush.FM.creators.AirLogistic;
import org.javarush.FM.creators.RoadLogistic;
import org.javarush.FM.creators.SeaLogistic;
import org.javarush.FM.transport.DeliveryType;
import org.javarush.FM.transport.Transport;

public class TransportFactory {
    public static Transport createTransport(DeliveryType type){
        return switch (type) {
            case ROAD -> new RoadLogistic().createTransport();
            case SEA -> new SeaLogistic().createTransport();
            case AIR -> new AirLogistic().createTransport();
        };
    }
}
