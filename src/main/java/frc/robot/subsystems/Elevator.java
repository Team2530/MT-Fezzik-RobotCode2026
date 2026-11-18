package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.robot.util.constants.ManipulatorConstants.ElevatorConstants;


public class Elevator {
    
    private final SparkFlex m_Motor = new SparkFlex(
        ElevatorConstants.Motor.CAN_ID, 
        MotorType.kBrushless
    );

    public Elevator(){
        
    }
}
