package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvPipeline;

@TeleOp
public class ImageDetectorNewTest extends UsefulFunctions {

    @Override
    public void runOpMode() {
        InitialiseVision();

        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("pos", pipeline.getPosition());
            telemetry.addData("one", pipeline.getFirstT());
            telemetry.addData("two", pipeline.getSecondT());
            telemetry.addData("three", pipeline.getThirdT());
            telemetry.update();
            sleep(100);
        }
    }

}
