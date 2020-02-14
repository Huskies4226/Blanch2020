// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4226.Competition2020/2.subsystems;


import org.usfirst.frc4226.Competition2020/2.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark fL_Drive;
    private Spark l_Drive;
    private Spark bL_Drive;
    private SpeedControllerGroup leftDrive;
    private Spark fR_Drive;
    private Spark r_Drive;
    private Spark bR_Drive;
    private SpeedControllerGroup rightDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        fL_Drive = new Spark(0);
        addChild("FL_Drive",fL_Drive);
        fL_Drive.setInverted(false);
        
        l_Drive = new Spark(1);
        addChild("L_Drive",l_Drive);
        l_Drive.setInverted(false);
        
        bL_Drive = new Spark(2);
        addChild("BL_Drive",bL_Drive);
        bL_Drive.setInverted(false);
        
        leftDrive = new SpeedControllerGroup(fL_Drive, l_Drive , bL_Drive );
        addChild("LeftDrive",leftDrive);
        
        
        fR_Drive = new Spark(3);
        addChild("FR_Drive",fR_Drive);
        fR_Drive.setInverted(false);
        
        r_Drive = new Spark(4);
        addChild("R_Drive",r_Drive);
        r_Drive.setInverted(false);
        
        bR_Drive = new Spark(5);
        addChild("BR_Drive",bR_Drive);
        bR_Drive.setInverted(false);
        
        rightDrive = new SpeedControllerGroup(fR_Drive, r_Drive , bR_Drive );
        addChild("RightDrive",rightDrive);
        
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

