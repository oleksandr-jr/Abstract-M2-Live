package org.javarush.FM.creators;

import org.javarush.FM.transport.Transport;
import org.javarush.FM.transport.Truck;

public class RoadLogistic extends Logistic{

    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
