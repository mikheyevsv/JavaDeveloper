package ru.serg.abstrctFactory;

/**
 * Created by Serg on 14.04.2016.
 */
public interface DeviceFactory {
    Tractor getTractor();
    Ship getShip();
    Airplane getAirplane();
}
