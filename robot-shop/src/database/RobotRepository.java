package database;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import model.Robot;

public interface RobotRepository extends CrudRepository<Robot, Long> {

  List<Robot> findByName(String name);

  Robot findBySerialNumber(Long serialNumber);

}
