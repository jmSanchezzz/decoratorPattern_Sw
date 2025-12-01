public class Sugar implements CoffeeDecorator {
     private Coffee coffee;

    public void setCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return coffee.getDescription() + ", Sugar";
    }
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return coffee.getCost() + 10.00;
    }
}

