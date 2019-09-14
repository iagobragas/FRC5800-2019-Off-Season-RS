/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.RobotMap.*;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class SubsystemCaixaDeReducao extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  protected VictorSP motorReductionBox1 = new VictorSP (MOTOR_REDUCTIONBOX_1_ID);
  protected VictorSP motorReductionBox2 = new VictorSP (MOTOR_REDUCTIONBOX_2_ID);  

  protected SpeedControllerGroup reductionBox = new SpeedControllerGroup(motorReductionBox1, motorReductionBox2);

  public SubsystemCaixaDeReducao(){
    super();
  } 

  public void reductionBoxClockWise( ){
    
    reductionBox.set(0.4);

  }

  public void reductionBoxAntiClockWise( ){
    
    reductionBox.set(-0.4);

  }

  public void reductionBoxOFF( ){
    
    reductionBox.set(0);

  }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


}
