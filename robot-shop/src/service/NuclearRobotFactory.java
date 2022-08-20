package service;

import model.NuclearPizzaBot;
import model.NuclearRobotType;
import model.NuclearSpaceBot;
import model.NuclearSpyBot;
import model.Robot;
import model.RobotType;

public class NuclearRobotFactory implements RobotFactory {

  @Override
  public Robot createRobot(String name, RobotType type) {

    if (type == NuclearRobotType.PIZZA_BOT) {
      return new NuclearPizzaBot(name);
    }

    if (type == NuclearRobotType.SPACE_BOT) {
      return new NuclearSpaceBot(name);
    }

    if (type == NuclearRobotType.SPY_BOT) {
      return new NuclearSpyBot(name);
    }

    return null;
  }

}
