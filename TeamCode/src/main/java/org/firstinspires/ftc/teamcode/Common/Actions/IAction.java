package org.firstinspires.ftc.teamcode.Common.Actions;
//This is the interface for different robot actions
public interface IAction {
    void start();
    void update();
    boolean isFinished();
}
