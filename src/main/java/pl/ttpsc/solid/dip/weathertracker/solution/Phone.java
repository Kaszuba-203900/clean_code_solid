package pl.ttpsc.solid.dip.weathertracker.solution;

public class Phone implements Device {

    @Override
    public void printWeatherNotification(String weatherInformation) {
        System.out.println("Today is " + weatherInformation);
    }
}
