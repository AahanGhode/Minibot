package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class MinibotDriveFwds extends CommandBase{
    private final Drivetrain drive;
    public MinibotDriveFwds(Drivetrain drive){
        this.drive=drive;

    }
    @Override
        public void execute(){
            drive.driveForwards(); 
        }
}
