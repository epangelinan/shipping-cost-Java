import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the weight of the package:");
    String stringWeight = myConsole.readLine();
    Integer weight = Integer.parseInt(stringWeight);

    System.out.println("Enter the distance the package will be shipped to:");
    String stringDistance = myConsole.readLine();
    Integer distance = Integer.parseInt(stringDistance);

    Double taxRate = 1.101;

    calculateShippingCost(weight, distance, taxRate);

  }
  public static void calculateShippingCost(Integer packageWeight, Integer packageDistance, Double tax) {
    Double shippingCost = (packageWeight/10) + (packageDistance/5) * tax;
    String stringShippingCost = Double.toString(shippingCost);
    System.out.println("The shipping cost is " + stringShippingCost);
  }
}
