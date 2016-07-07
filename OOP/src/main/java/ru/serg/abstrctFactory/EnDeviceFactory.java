package ru.serg.abstrctFactory;

/**
 * Created by Serg on 14.04.2016.
 */
public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Tractor getTractor() {
        return new EnTractor();
    }

    @Override
    public Ship getShip() {
        return new EnShip();
    }

    @Override
    public Airplane getAirplane() {
        return new EnAirplane();
    }
}
