package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NuclearSpaceBot implements Robot {

  private static Double price = 1000.0;
  private static PowerSource powerSource = PowerSource.NUCLEAR;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long serialNumber;
  private String name;


  public NuclearSpaceBot(String name) {
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
