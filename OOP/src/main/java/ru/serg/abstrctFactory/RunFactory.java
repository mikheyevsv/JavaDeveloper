package ru.serg.abstrctFactory;

/**
 * Created by Serg on 14.04.2016.
 */
public class RunFactory {
    public static void main(String[] args) {
        DeviceFactory factory = getDeviceFactory("RU");
        Tractor tractor = factory.getTractor();
        Ship ship = factory.getShip();
        Airplane air = factory.getAirplane();

        tractor.plow();
        ship.shwim();
        air.fly();

    }
    private static DeviceFactory getDeviceFactory(String lang){
        DeviceFactory deviceFactory = null;

        if("RU".equals(lang)){
            deviceFactory = new RuDeviceFactory();
        }else if ("EN".equals(lang)){
            deviceFactory = new EnDeviceFactory();
        }
        return deviceFactory;
    }
}
