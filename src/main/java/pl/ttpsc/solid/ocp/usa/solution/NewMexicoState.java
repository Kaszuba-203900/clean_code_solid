package pl.ttpsc.solid.ocp.usa.solution;

public class NewMexicoState implements SpeedLimit {

    private final static int SPEED_LIMIT = 55;

    @Override
    public void getSpeedPenalty(int currentSpeed) {
        if(currentSpeed > SPEED_LIMIT) {
            System.out.println("Amigo! You were driving too fast! Pay " + calculateSpeedFine(currentSpeed) + "$");
        }
    }

    @Override
    public int calculateSpeedFine(int currentSpeed) {
        return (currentSpeed - SPEED_LIMIT) * 100;
    }
}
