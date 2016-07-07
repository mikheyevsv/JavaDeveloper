package ru.serg.abstrctFactory;

/**
 * Created by Serg on 14.04.2016.
 */
public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Tractor getTractor() {
        return new RuTractor();

    }

    @Override
    public Ship getShip() {
        return new RuShip();
    }

    @Override
    public Airplane getAirplane() {
        return new RuAirplane();
    }
}
