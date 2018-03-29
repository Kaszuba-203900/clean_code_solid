package pl.ttpsc.solid.ocp.usa.solution;

public class CaliforniaState implements SpeedLimit {

    private static final int SPEED_LIMIT = 80;

    @Override
    public void getSpeedPenalty(int currentSpeed) {
        if(currentSpeed > SPEED_LIMIT) {
            System.out.println("Hello! Don't worry, it won't be expensive. Pay " + calculateSpeedFine(currentSpeed) + "$");
        }
    }

    @Override
    public int calculateSpeedFine(int currentSpeed) {
        return (currentSpeed - SPEED_LIMIT) * 10;
    }
}
