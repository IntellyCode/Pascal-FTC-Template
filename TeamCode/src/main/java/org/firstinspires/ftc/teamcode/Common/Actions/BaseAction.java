package org.firstinspires.ftc.teamcode.Common.Actions;
/*
This is an abstract class that other actions can extend to implement more functionality
Credit here goes to Erik, my teamate in 2023, who came up with the idea of Actions and Behaviours
and used an OOP approach to implement them.
*/
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Common.RobotModel;
public abstract class BaseAction implements IAction {
    protected RobotModel robotModel;
    Telemetry telemetry;
    public BaseAction(RobotModel robotModel, Telemetry telemetry) {
        this.robotModel = robotModel;
        this.telemetry = telemetry;
    }
    protected boolean finished;
    @Override
    public boolean isFinished() {
        return finished;
    }
}
