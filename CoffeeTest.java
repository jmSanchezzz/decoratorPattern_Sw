public class CoffeeTest {
    public static void main(String[] args) {

        Coffee base = new BlackCoffee();

        Milk milk = new Milk();
        milk.setCoffee(base);

        CaramelSyrup caramel = new CaramelSyrup();
        caramel.setCoffee(milk);

        Sugar sugar = new Sugar();
        sugar.setCoffee(caramel);

        WhippedCream whippedCream = new WhippedCream();
        whippedCream.setCoffee(sugar);
        System.out.println("Order: " + whippedCream.getDescription());
        System.out.println("Total Cost: ₱ " + whippedCream.getCost());
    }
}