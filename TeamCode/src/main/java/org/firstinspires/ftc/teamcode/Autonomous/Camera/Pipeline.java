package org.firstinspires.ftc.teamcode.Autonomous.Camera;
/*
This is the class where image processing takes place. Add any image processing 
function or algorithm in the processFrame function. It is a good idea
to keep everything "static" both in the Pipiline and the Utility classes for object detection.
Those are stored in the ./Util directory. 

Although an OOP aproach could be used for image processing using plain functions instead of objects is 
often simpler and easier to use for a single camera.

In the ./Util class you will find templates for detecting yellow objects (which are often used in FTC), \
as well as relatively reliable code on scanning QR codes from the sleeve, used in 2023. 
 */
import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.openftc.easyopencv.OpenCvPipeline;
import org.openftc.easyopencv.OpenCvWebcam;

public class Pipeline extends OpenCvPipeline {
    OpenCvWebcam webcam;

    public Pipeline(OpenCvWebcam webcam){
        this.webcam = webcam;

    }
    @Override
    public Mat processFrame(Mat input) {
        
        return input;
    }


    @Override
    public void onViewportTapped() {
        this.webcam.pauseViewport();
    }
}