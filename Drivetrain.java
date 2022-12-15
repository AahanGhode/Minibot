package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.simulation.SimDriveTrain;
import frc.robot.simulation.SimSparkMax;

public class Drivetrain extends SubsystemBase {
    
    private final Spark leftMotor; 
    private final Spark rightMotor; 

    
    public Drivetrain() { 
 
        leftMotor = new Spark(0); 
        rightMotor = new Spark(1); 


    }

    double left, right; 
    public void arcadeDrive(double speed, double turn) {
        if (turn > 0.0){
          left = (speed) + turn;
          right = (speed) + -turn;
        }
        // turn is all ready a negative, so will go the other way 
        else if (turn < 0.0) {
          left = (speed) + turn;
          right = (speed) + -turn;
        } 
        else {
          left = speed;
          right = speed;
        }
    
        tankDrive(left, right);
    
      }
    
      public void tankDrive(double left, double right) {
    
        // set speed for motors in simulator
        
        leftMotor.set(left); 
        rightMotor.set(right);
        /*
        double offset = simDrive.getSimHeadingDeg(); 
        if (offset > 0.3) {  
        leftMotor.setSpeed(0.2);
        rightMotor.setSpeed(-0.2);
        }
        else if (offset < -0.3) { 
            leftMotor.setSpeed(-0.2);
            rightMotor.setSpeed(0.2);
        }
        */
        
    
        //SmartDashboard.putNumber("leftM", leftSimM.getSpeed()); 
        //SmartDashboard.putNumber("rightM", rightSimM.getSpeed()); 
        
      }




    public void driveForwards() {
        
      //if (simDrive.getLeftEncoder() < 5) {
        leftMotor.set(0.5);
        rightMotor.set(0.5);
      //}
      /*
      else { 
        leftMotor.setSpeed(0.0);
        rightMotor.setSpeed(0.0);
      }
*/
    }

    public void stop() { 
      leftMotor.set(0.0);
      rightMotor.set(0.0);
    }


}
