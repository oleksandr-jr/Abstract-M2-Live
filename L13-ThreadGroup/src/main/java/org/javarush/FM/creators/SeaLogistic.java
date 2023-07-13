package org.javarush.FM.creators;

import org.javarush.FM.transport.Ship;
import org.javarush.FM.transport.Transport;

public class SeaLogistic extends Logistic{

    @Override
    public Ship createTransport() {
        return new Ship();
    }
}
