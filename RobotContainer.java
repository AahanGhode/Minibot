// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController; 
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.simulation.SimDriveTrain;
import frc.robot.simulation.SimSparkMax;
//import frc.robot.TurnToTarget;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //private final OI oi = new OI(); 

  

  private final Drivetrain dt = new Drivetrain(); 

  private final MinibotDriveFwds drive = new MinibotDriveFwds(dt);


  //private final TurnToTarget align = new TurnToTarget(dt); 

  //private final ParallelRaceGroup procedure = new ParallelRaceGroup(driveFwd, raise); 

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    setDefaultCommands();
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
    return drive;
    //return align; 
  }

  public Command getTeleopCommand() { 
    //return procedure; 
    return null; 
  }

  public void setDefaultCommands() {
    //dt.setDefaultCommand(teleopDrive);
    //piston.setDefaultCommand(raise);
  }

  /* 
  public TeleopDrive getTeleopDrive() { 
    return teleopDrive; 
  }
  */

  public void reset() { 
  }


}
