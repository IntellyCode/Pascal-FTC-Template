package org.firstinspires.ftc.teamcode.Common.Components;
/*
This class is used to initialised the camera. Here all of the camera input is transfered to the Pipeline,
where they can be modified or manipulated. Don't forget to call the start() method to start steaming.
*/

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.Autonomous.Camera.Pipeline;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvWebcam;


public class CameraComponent {
    public OpenCvWebcam webcam;

    public Pipeline pipeline;

    public CameraComponent(HardwareMap hardwareMap){
        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        this.webcam = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, "Webcam 1"), cameraMonitorViewId);

        this.pipeline = new Pipeline(this.webcam);

        webcam.setPipeline(this.pipeline);
  
        webcam.setMillisecondsPermissionTimeout(5000); // Timeout for obtaining permission is configurable. Set before opening.

    }
    public void start(){
        webcam.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener() {
            @Override
            public void onOpened() {
                webcam.startStreaming(width,height, OpenCvCameraRotation.UPRIGHT);

            }
            @Override
            public void onError(int errorCode) {

            }
        });

    }

}
