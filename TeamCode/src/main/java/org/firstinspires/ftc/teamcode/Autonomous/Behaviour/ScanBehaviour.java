package org.firstinspires.ftc.teamcode.Autonomous.Behaviour;
/*
This is a sample that uses the IBehaviour interface to pair multiple actions and scan a sleeve for
the necessary parking coordinates. 
Here:
    - IAction is the action interface
    - Pipeline is the place for image modification from the camera (EasyOpenCV)
    - RobotModel is the class that describes the robot and pairs every necessary component (like motors and sensors)
*/

import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Autonomous.Camera.Pipeline;
import org.firstinspires.ftc.teamcode.Autonomous.FieldModel;
import org.firstinspires.ftc.teamcode.Common.Actions.IAction;
import org.firstinspires.ftc.teamcode.Common.Actions.TickMotionAction;
import org.firstinspires.ftc.teamcode.Common.MotionDirection;
import org.firstinspires.ftc.teamcode.Common.RobotModel;

public class ScanBehaviour implements IBehaviour {
   /*RobotModel robotModel;

    FieldModel fieldModel;

    Telemetry telemetry;

    IAction powerMotion;
    public boolean finished = false;
    public ScanBehaviour(RobotModel robotModel, FieldModel fieldModel, Telemetry telemetry) {
        this.robotModel = robotModel;
        this.fieldModel = fieldModel;
        this.telemetry = telemetry;
    }
    @Override
    public void update() {
        if (Pipeline.parkingPosition !=null){
            switch (Pipeline.parkingPosition) {
                case "1":
                    this.robotModel.setParkingCoordinates(fieldModel.getFirstParkingPosition());
                    break;
                case "2":
                    this.robotModel.setParkingCoordinates(fieldModel.getSecondParkingPosition());
                    break;
                case "3":
                    this.robotModel.setParkingCoordinates(fieldModel.getThirdParkingPosition());
                    break;
            }
            finishTheBehaviour();
        }else{
            if (powerMotion == null){
                powerMotion = new TickMotionAction(robotModel,0.7,25,MotionDirection.vertical,telemetry);
                powerMotion.start();

            }
            AutonomousEntryPoint.elapsedTime = new ElapsedTime();
            powerMotion.update();
        }
    }

    void finishTheBehaviour() {
      if (this.robotModel.withCone){
         AutonomousEntryPoint.currentBehaviour = new DriveInitToPoleBehaviour(this.robotModel,this.fieldModel,telemetry);
         //AutonomousEntryPoint.currentBehaviour = new ToPoleBehaviour(this.robotModel,this.telemetry);

     } else {
          AutonomousEntryPoint.currentBehaviour = new DriveToConeBehaviour(this.robotModel,this.telemetry);
      }
        //AutonomousEntryPoint.currentBehaviour = new ParkingBehaviour(robotModel, telemetry);
    }
    */

}
