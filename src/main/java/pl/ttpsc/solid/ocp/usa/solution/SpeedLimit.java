package pl.ttpsc.solid.ocp.usa.solution;

public interface SpeedLimit {

    void getSpeedPenalty(int currentSpeed);
    int calculateSpeedFine(int currentSpeed);
}
