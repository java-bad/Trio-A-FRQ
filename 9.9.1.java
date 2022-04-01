import java.util.List;
import java.util.ArrayList;
import java.text.*;

interface MenuItem
{
   /** @return the name of the menu item */
   String getName();

   /** @return the price of the menu item */
   double getPrice();
}

class SimpleLunchItem implements MenuItem
{
   private String name;
   private double price;

   public SimpleLunchItem(String aName, double aPrice)
   {
      name = aName;
      price = aPrice;
   }

   public String getName() { return name; }
   public double getPrice() { return price; }

   public String toString ()
   {
      DecimalFormat money = new DecimalFormat("0.00");
      return getName() + " " + money.format(getPrice());
   }
}

class Drink extends SimpleLunchItem
{
   public Drink(String name, double price)
   { super(name, price); }
}

class Salad extends SimpleLunchItem
{
   public Salad(String name, double price)
   { super(name, price); }
}

class Sandwich extends SimpleLunchItem
{
   public Sandwich(String name, double price)
   { super(name, price); }
}

// Declare the Trio class.  It must implement the MenuItem interface.
public class Trio implements MenuItem
{
   // declare the instance variables that you need for a trio object

   // write a constructor that takes a Sandwich, Salad, and a Drink, in that order
public Trio (String sandwich, String salad, String drink) {
    sandwich = _swich;
    salad = _salad;
    drink= _drink;
    }
   // write the getName method it should return
   public String getName() {
   return name;
   }
   // sandwich name/salad name/drink name Trio

   // write the getPrice method
   public Double getPrice() {
   for (int i = 0; i<trio.length; i++) {
   
   
   // it should return the price of the two highest price items in the trio.

   public static void main(String[] args)
   {
      Sandwich burger = new Sandwich("Cheeseburger",2.75);
      Sandwich club = new Sandwich("Club Sandwich", 2.75);
      Salad spinachSalad = new Salad("Spinach Salad",1.25);
      Salad coleslaw = new Salad("Coleslaw", 1.25);
      Drink orange = new Drink("Orange Soda", 1.25);
      Drink cap = new Drink("Cappuccino", 3.50);
      Trio trio1 = new Trio(burger,spinachSalad, orange);
      System.out.println("It should print Cheeseburger/Spinach Salad/Orange Soda Trio and it prints: " + trio1.getName());
      System.out.println("It should print 4.0 and it prints: " + trio1.getPrice());
      Trio trio2 = new Trio(club,coleslaw,cap);
      System.out.println("It should print Club Sandwich/Coleslaw/Capuccino Trio and it prints: " + trio2.getName());
      System.out.println("It should print 6.25 and it prints: " + trio2.getPrice());
   }
}
