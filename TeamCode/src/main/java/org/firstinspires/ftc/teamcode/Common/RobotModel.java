package org.firstinspires.ftc.teamcode.Common;
    /* 
    This is the class that describes the robot it self.
    Add any component initialisation should be called from here,
    but the initialisation code should be written in each component separately.
    Pairs well with the Coordinates class in the common folder. 
    */
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.robot.Robot;

public class RobotModel {
   
    //Robot components
    CameraComponent cameraComponent;
    public CameraComponent getCameraComponent() {
        return cameraComponent;
    }
    DriveComponent driveComponent;
    public DriveComponent getDriveComponent() {
        return driveComponent;
    }

    ArmComponent armComponent;
    public ArmComponent getArmComponent() {
        return armComponent;
    }

    SensorComponent sensorComponent;
    public SensorComponent getSensorComponent(){
        return sensorComponent;
    }
    public Coordinates coordinates;
    //angle to the x axis
    public double absAngle;

    public RobotModel(HardwareMap hardwareMap Coordinates initialCoordinates) {
        this.driveComponent = new DriveComponent(hardwareMap);
        this.armComponent = new ArmComponent(hardwareMap);
        this.sensorComponent = new SensorComponent(hardwareMap);
        this.cameraComponent = new CameraComponent(hardwareMap, robotTeamColor,640,480);
        this.armPosition = 0;
        this.robotTeamColor = robotTeamColor;
        this.coordinates = initialCoordinates;
        this.absAngle = 90;
    }
}
