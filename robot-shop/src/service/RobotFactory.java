package service;

import model.Robot;
import model.RobotType;

public interface RobotFactory {

  Robot createRobot(String name, RobotType type);
}
