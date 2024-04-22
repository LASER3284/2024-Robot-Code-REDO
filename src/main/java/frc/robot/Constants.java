// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
//import com.ctre.phoenix6.signals.GravityTypeValue;
//import com.ctre.phoenix6.signals.InvertedValue;
//import com.ctre.phoenix6.signals.NeutralModeValue;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
//import com.pathplanner.lib.controllers.PPHolonomicDriveController;
//import com.pathplanner.lib.path.PathConstraints;
//import com.pathplanner.lib.util.HolonomicPathFollowerConfig;
//import com.pathplanner.lib.util.ReplanningConfig;

import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.Matrix;
import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.interpolation.InterpolatingDoubleTreeMap;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.numbers.N1;
import edu.wpi.first.math.numbers.N3;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final class SwerveConstants {

    public static final double DRIVE_RATIO = 6.12;
    public static final double WHEEL_DIAM = 3.824;
    public static final double WHEEL_CIRC = WHEEL_DIAM * Math.PI;
    public static final double MAX_WHEEL_SPEED = 18.0;
    public static final double MAX_ROBOT_ACCEL = 24.0;
    public static final int DRIVE_ENC_RES = 2048;
    public static final double TURN_RATIO = 12.8;
  }

  public static final class DriveConstants {
    public static final frc.Translation2d FRONT_LEFT_LOCATION {11.25, 11.25};
  }
}
