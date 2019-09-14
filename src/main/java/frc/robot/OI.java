package frc.robot;

import frc.robot.Robot;
import frc.robot.subsystems.SubsystemJoystick;
import frc.robot.commands.*;

public class OI {
    public OI(){
        Robot.joystick.whenHeld(SubsystemJoystick.d_B, new CommandReductionBox());
        Robot.joystick.whenReleased(SubsystemJoystick.d_B, new CommandReductionBoxOFF());
        Robot.joystick.whenReleased(SubsystemJoystick.d_X, new CommandReductionBoxOFF());
        Robot.joystick.whenHeld(SubsystemJoystick.d_X, new CommandReductionBoxAntClockWise());
    
    ///Solenoid
    
        Robot.joystick.whenPressed(SubsystemJoystick.d_Y, new CommandSolenoidGopress());
        Robot.joystick.whenHeld(SubsystemJoystick.d_A, new CommandSolenoidGo(true));
        Robot.joystick.whenReleased(SubsystemJoystick.d_A, new CommandSolenoidGo(false));
    }
}
