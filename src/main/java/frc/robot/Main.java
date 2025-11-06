// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */

 //my name is Stelio
public final class Main {
  private Main() {}
  //This is the hello World
  public static void HelloWorld(String[] args) {
    System.out.println("Hello World!");
  }


  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
// make a privite function that is not static and returuns the number 20 at end of function as integer and name it Stelio_Project. Make function instide main class
// learn for loops