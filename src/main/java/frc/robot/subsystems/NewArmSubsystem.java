// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class NewArmSubsystem extends SubsystemBase {
  CANSparkMax ArmMotor1 = new CANSparkMax(Constants.armMotor1ID, MotorType.kBrushless); //assigns the motors and stuff
  CANSparkMax ArmMotor2 = new CANSparkMax(Constants.armMotor2ID, MotorType.kBrushless);

  
  /** Creates a new ExampleSubsystem. */
  public NewArmSubsystem() {
    //IntakeMotor2.follow(IntakeMotor1); //use follow instead (controller groups are deprecated)
    ArmMotor1.restoreFactoryDefaults();
    ArmMotor2.restoreFactoryDefaults();


    

  }

  public Command exampleMethodCommand() {

    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  public boolean exampleCondition() {
    return false;
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }

  public void runArmSpeed(double speed)
  {
    ArmMotor1.set(speed); //sets the leader motor to the designated speed
    ArmMotor2.set(-speed);

  }
}
