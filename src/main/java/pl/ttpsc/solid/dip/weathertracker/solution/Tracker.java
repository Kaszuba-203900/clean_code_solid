package pl.ttpsc.solid.dip.weathertracker.solution;

import java.util.ArrayList;
import java.util.List;

public class Tracker {

    private String weatherCondition;
    private List<Device> devices = new ArrayList<>();

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public void addNewDeviceToTracker(Device device) {
        devices.add(device);
    }

    public void notifyAllDevicesAboutWeather() {
        for (Device device: devices) {
            device.printWeatherNotification(this.weatherCondition);
        }
    }
}
