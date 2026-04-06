package org.firstinspires.ftc.teamcode.pedroPathing;
/*
import static Constants.followerConstants;
import static Constants.pathConstraints;
import static Constants.pathConstraints;
import static Constants.swerveConstants;

import com.pedropathing.control.PIDFCoefficients;
import com.pedropathing.follower.Follower;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.ftc.FollowerBuilder;
import com.pedropathing.ftc.drivetrains.CoaxialPod;
import com.pedropathing.ftc.drivetrains.MecanumConstants;
import com.pedropathing.ftc.drivetrains.SwerveConstants;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathConstraints;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Disabled
/*public class Constants {
    public static FollowerConstants followerConstants = new FollowerConstants()
            .mass(5);
    public static PathConstraints pathConstraints = new PathConstraints(0.99, 100, 1, 1);

    public static MecanumConstants driveConstants = new MecanumConstants()
            .maxPower(1)

            .rightFrontMotorName("rightfront")
            .rightRearMotorName("rr")
            .leftRearMotorName("lr")
            .leftFrontMotorName("leftFront")

            .leftFrontMotorDirection(DcMotorSimple.Direction.REVERSE)
            .leftRearMotorDirection(DcMotorSimple.Direction.REVERSE)
            .rightFrontMotorDirection(DcMotorSimple.Direction.FORWARD)
            .rightRearMotorDirection(DcMotorSimple.Direction.FORWARD);

    public static Follower createFollower(HardwareMap hardwareMap) {
        return new FollowerBuilder(followerConstants, hardwareMap)
                .pathConstraints(pathConstraints)
                .mecanumDrivetrain(driveConstants)
                .build();
    }

    public static SwerveConstants swerveConstants = new SwerveConstants()
            .maxPower(1); //determines the max power of the drivetrain
//      .zeroPowerBehavior(SwerveConstants.ZeroPowerBehavior.IGNORE_ANGLE_CHANGES)
    //the above disables x locking for swerve, which can be useful for tuning pod offsets
}
private static CoaxialPod leftFront(HardwareMap hardwareMap) {
    CoaxialPod pod = new CoaxialPod(
            hardwareMap,
            "leftFrontMotor", //the name of your motor in your config
            "leftFrontServo", //the name of your servo in your config
            "leftFrontEncoder", // the name of your analog encoder in your config
            new PIDFCoefficients(0.3, 0, 0.005, 0.01), //pod PIDF coefficients
            DcMotorSimple.Direction.FORWARD, //the direction of your motor
            DcMotorSimple.Direction.FORWARD, //the direction of your servo
            Math.toRadians(353.1), //your pod's angle offset, in radians
            new Pose(dtLength, dtWidth), //your pods x and y offsets,
            // in pedro coordinates (like with deadwheels)
            0 //analog min voltage
            3.3, //analog max voltage
                                      false); //encoder inverted
//  uncomment the below lines to change caching thresholds (by default 0.01)
//  pod.setMotorCachingThreshold(0.05);
//  pod.setServoCachingThreshold(0.05);
    return pod;
}
private static CoaxialPod leftBack(HardwareMap hardwareMap) {
    CoaxialPod pod = new CoaxialPod(
            hardwareMap,
            "leftFrontMotor", //the name of your motor in your config
            "leftFrontServo", //the name of your servo in your config
            "leftFrontEncoder", // the name of your analog encoder in your config
            new PIDFCoefficients(0.3, 0, 0.005, 0.01), //pod PIDF coefficients
            DcMotorSimple.Direction.FORWARD, //the direction of your motor
            DcMotorSimple.Direction.FORWARD, //the direction of your servo
            Math.toRadians(353.1), //your pod's angle offset, in radians
            new Pose(dtLength, dtWidth), //your pods x and y offsets,
            // in pedro coordinates (like with deadwheels)
            0 //analog min voltage
    3.3, //analog max voltage
            false); //encoder inverted
//  uncomment the below lines to change caching thresholds (by default 0.01)
//  pod.setMotorCachingThreshold(0.05);
//  pod.setServoCachingThreshold(0.05);
    return pod;
}
private static CoaxialPod rightBack(HardwareMap hardwareMap) {
    CoaxialPod pod = new CoaxialPod(
            hardwareMap,
            "leftFrontMotor", //the name of your motor in your config
            "leftFrontServo", //the name of your servo in your config
            "leftFrontEncoder", // the name of your analog encoder in your config
            new PIDFCoefficients(0.3, 0, 0.005, 0.01), //pod PIDF coefficients
            DcMotorSimple.Direction.FORWARD, //the direction of your motor
            DcMotorSimple.Direction.FORWARD, //the direction of your servo
            Math.toRadians(353.1), //your pod's angle offset, in radians
            new Pose(dtLength, dtWidth), //your pods x and y offsets,
            // in pedro coordinates (like with deadwheels)
            0 //analog min voltage
    3.3, //analog max voltage
            false); //encoder inverted
//  uncomment the below lines to change caching thresholds (by default 0.01)
//  pod.setMotorCachingThreshold(0.05);
//  pod.setServoCachingThreshold(0.05);
    return pod;
}
private static CoaxialPod rightFront(HardwareMap hardwareMap) {
    CoaxialPod pod = new CoaxialPod(
            hardwareMap,
            "leftFrontMotor", //the name of your motor in your config
            "leftFrontServo", //the name of your servo in your config
            "leftFrontEncoder", // the name of your analog encoder in your config
            new PIDFCoefficients(0.3, 0, 0.005, 0.01), //pod PIDF coefficients
            DcMotorSimple.Direction.FORWARD, //the direction of your motor
            DcMotorSimple.Direction.FORWARD, //the direction of your servo
            Math.toRadians(353.1), //your pod's angle offset, in radians
            new Pose(dtLength, dtWidth), //your pods x and y offsets,
            // in pedro coordinates (like with deadwheels)
            0 //analog min voltage
    3.3, //analog max voltage
            false); //encoder inverted
//  uncomment the below lines to change caching thresholds (by default 0.01)
//  pod.setMotorCachingThreshold(0.05);
//  pod.setServoCachingThreshold(0.05);
    return pod;
}
public static Follower createFollower(HardwareMap hardwareMap) {
    return new FollowerBuilder(followerConstants, hardwareMap)
            .pathConstraints(Constants.pathConstraints)
            .swerveDrivetrain(Constants.swerveConstants,
                    leftFront(hardwareMap),
                    rightFront(hardwareMap),
                    leftBack(hardwareMap),
                    rightBack(hardwareMap))
            .build();
}
*/