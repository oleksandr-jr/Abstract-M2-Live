package org.javarush.FM.creators;

import org.javarush.FM.transport.Plane;
import org.javarush.FM.transport.Transport;

public class AirLogistic extends Logistic{
    @Override
    public Plane createTransport() {
        return new Plane();
    }
}
