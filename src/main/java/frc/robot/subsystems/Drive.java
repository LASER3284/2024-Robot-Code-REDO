package frc.robot.subsystems;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.Joystick;

public class Drive {
    
    public void tick() {
        if (Joystick.GetStartButton()) {
            reset_odometry();
        }

        final double fast_mode_mul = Joystick.GetLeftTriggerAxis() > 0.60 ? Joystick.GetLeftTriggerAxis() : 0.60);
    }

    public void swerve_tick() {
    
    }

    public void update_nt() {

    }

    public void run_sysid(int tbd) {

    }

    public void update_odometry() {

    }

    public void reset_pose_to_vision() {

    }

    public Pose2d get_pose() {
        
    }

    void set_pose(final Pose2d) {

    }
}
