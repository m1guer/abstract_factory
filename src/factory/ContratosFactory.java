package factory;

/**
 * ContratosFactory
 */
public class ContratosFactory extends Factory {

  @Override
  Car retrieveCar(String requestedGrade) {
    if ("A".equals(requestedGrade)) {
      return new CorolaCar(100, "cheio", "marrom");
    }
    return null;
  }

}
