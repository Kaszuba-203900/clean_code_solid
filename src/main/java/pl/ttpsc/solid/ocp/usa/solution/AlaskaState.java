package pl.ttpsc.solid.ocp.usa.solution;

public class AlaskaState implements SpeedLimit {

    private final static int SPEED_LIMIT = 50;

    @Override
    public void getSpeedPenalty(int currentSpeed) {
        if(currentSpeed > SPEED_LIMIT) {
            System.out.println("Sir, you have to pay " + calculateSpeedFine(currentSpeed) + "$");
        }
    }

    @Override
    public int calculateSpeedFine(int currentSpeed) {
        return (currentSpeed - SPEED_LIMIT) * 50;
    }
}
