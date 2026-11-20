package frc.robot.subsystems;

import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkFlexConfig;

import frc.robot.util.constants.ManipulatorConstants.ElevatorConstants;
import frc.robot.util.constants.ManipulatorConstants.ElevatorConstants.ElevatorkP;


public class Elevator {
    
    private final SparkFlex m_LeftMotor = new SparkFlex(
        ElevatorConstants.LeftMotor.CAN_ID, 
        MotorType.kBrushless
    );

    private final SparkFlex m_RightMotor = new SparkFlex(
        ElevatorConstants.RightMotor.CAN_ID,
        MotorType.kBrushless
    );

    // private final double test = ElevatorkP.CAN_ID;

    // SparkFlexConfig LeftConfig = new SparkFlexConfig();
    // LeftConfig
    //     .closedLoop
    //         .pid(ElevatorConstants.kP)
    private final SparkClosedLoopController elevatorController;

    public Elevator(){
        elevatorController = m_Motor.getClosedLoopController();
    }
}
