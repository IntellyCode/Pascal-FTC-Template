package org.firstinspires.ftc.teamcode.Manual;
/*
Here is the tempalate for the OP mode used in the TeleOP part of the game
*/
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Common.RobotTeamColor;
import org.firstinspires.ftc.teamcode.Common.RotationDirection;
import org.firstinspires.ftc.teamcode.Common.Actions.VibrateAction;
import org.firstinspires.ftc.teamcode.Common.RobotModel;
import org.firstinspires.ftc.teamcode.Common.Components.ArmPosition;

@TeleOp
public class ManualOpMode extends LinearOpMode {
 
    @Override
    public void runOpMode() throws InterruptedException {
        initialize();
        while(opModeIsActive()) {
            driveControl();
            armControl();
  
        }
    }
    void initialize() {
        
    }
    void driveControl() {
        
    }
    void armControl() {
        
    }
}
