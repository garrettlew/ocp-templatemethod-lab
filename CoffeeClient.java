package lab.assignment.beforerefactoring.clientcode;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new MochaCoffee();
        System.out.println("Preparing Mocha Coffee");
        coffeeType.prepareCoffee();

        System.out.println("********************");

        coffeeType = new CapuccinoCoffee();
        System.out.println("Preparing Capuccino Coffee");
        coffeeType.prepareCoffee();

        System.out.println("********************");

        coffeeType = new AmericanoCoffee();
        System.out.println("Preparing Americano Coffee");
        coffeeType.prepareCoffee();

    }

}
