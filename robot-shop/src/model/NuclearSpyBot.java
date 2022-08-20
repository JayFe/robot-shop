package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NuclearSpyBot implements Robot {

  private static Double price = 22100.0;
  private static PowerSource powerSource = PowerSource.NUCLEAR;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long serialNumber;
  private String name;



  public NuclearSpyBot(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Long getSerialNumber() {
    return this.serialNumber;
  }

  @Override
  public PowerSource getPowerSource() {
    return powerSource;
  }

  @Override
  public double getPrice() {
    return price;
  }

}
