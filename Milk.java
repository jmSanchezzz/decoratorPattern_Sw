public class Milk implements CoffeeDecorator{
    private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return coffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return coffee.getCost() + 25.00;
    }
}