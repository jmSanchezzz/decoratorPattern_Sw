# ☕ Customizing Coffee Orders (Decorator Pattern)

A popular coffee shop, "Brewtiful," wants a flexible way to calculate the cost and list the ingredients of customized coffee orders. Customers can choose a basic coffee type, and then add various toppings or flavor shots. The system must allow for any combination of additions.

# 📌 Key Requirements

Core Component: A basic coffee (e.g., Espresso, Black Coffee) with a base cost.

Dynamic Enhancements: Additions like Milk, Sugar, Caramel Syrup, or Whipped Cream must be applied on top of the basic coffee.

Combinability: Customers should be able to combine multiple additions (e.g., an Espresso with Milk and Caramel).

Interface Consistency: All components (basic coffee and additions) should share a common interface so that additions can wrap other additions or the base coffee.

# 🏗 Implementation Structure (Coffee Shop)
1. The Component Interface

This defines the common operations for both the basic item and the decorators.
Interface: Coffee
Operation:

getDescription() (returns the ingredients)

getCost() (returns the price)

2. The Concrete Component

This is the original, basic object that will be decorated.
Class: BlackCoffee
Implementation:

getDescription() → returns "Black Coffee"

getCost() → returns ₱ 100.00

3. The Decorator Abstraction

This ensures the decorator classes implement the Coffee interface and have a way to hold a reference to the Coffee object they are wrapping.

Abstract Class/Interface: CoffeeDecorator (implements Coffee)
Implementation:

Holds a private Coffee object

Has a constructor/setter to wrap it

Methods typically call the wrapped object's method first before adding custom enhancement

4. The Concrete Decorators

These classes add specific features (cost and description) to the wrapped Coffee object.

☕ Class: Milk (implements CoffeeDecorator)

Implementation:

getDescription() → wrappedCoffee.getDescription() + ", Milk"

getCost() → wrappedCoffee.getCost() + ₱ 25.00

☕ Class: CaramelSyrup (implements CoffeeDecorator)

Implementation:

getDescription() → wrappedCoffee.getDescription() + ", Caramel Syrup"

getCost() → wrappedCoffee.getCost() + ₱ 40.00
