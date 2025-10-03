import java.util.Scanner;

/**
 * ReceiptFinal.java  
 *
 * @author – Devin 
 * @author – Ap Computer Science A Period 1
 */ 
public class ReceiptFinal
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter High School Name: ");
      String highSchoolName = scan.nextLine(); 
      // Extract only capital letters from the high school name;
      StringBuilder capitals = new StringBuilder();
      for (int i = 0; i < highSchoolName.length(); i++) {
         char letter = highSchoolName.charAt(i);
         if (Character.isUpperCase(letter)) {
            capitals.append(letter);
         }
      }

      String drink = "Pepsi";
      String drinkCost = "$1.00";
      String dessert = "McFlurry";
      String dessertCost = "$2.99";
      String burger = "Quarter Pounder";
      String burgerCost = "$12.49";
      String BigMac = "Big Mac";
      String BigMacCost = "$8.00";
      String SpicyChicken = "Spicy Chicken";
      String SpicyChickenCost = "$11.00";
      String McDouble = "McDouble";
      String McDoubleCost = "$3.50";
      String HappyMeal = "Happy Meal";
      String HappyMealCost = "$5.50";
      int randomOrderNumber = (int)(Math.random() * 100) + 1;
      System.out.print("Enter drink quantity: ");
      int DrinkQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter dessert quantity: ");
      int dessertQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter burger quantity: ");
      int burgerQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter Big Mac quantity: ");
      int BigMacQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter SpicyChicken quantity: ");
      int SpicyChickenQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter McDouble quantity: ");
      int McDoubleQuantity = Integer.parseInt(scan.nextLine());
      System.out.print("Enter Happy Meal quantity: ");
      int HappyMealQuantity = Integer.parseInt(scan.nextLine());
      scan.close();
      Double DrinkTotal = DrinkQuantity * 1.00;
      Double dessertTotal = dessertQuantity * 2.99;
      Double burgerTotal = burgerQuantity * 12.49;
      Double BigMacTotal = BigMacQuantity * 8.00;
      Double SpicyChickenTotal = SpicyChickenQuantity * 11.00;
      Double McDoubleTotal = McDoubleQuantity * 3.50;
      Double HappyMealTotal = HappyMealQuantity * 5.50;
      Double Subtotal = DrinkTotal + dessertTotal + burgerTotal + BigMacTotal;
      Double Tax = Subtotal * 8.6/100;
      Double TaxRounded = Math.round(Tax * 100.0) / 100.0;
      Tax = TaxRounded;
      Double Total = Subtotal + Tax;
      System.out.println("_____________________________________");
      System.out.println("|                                    |");
      System.out.println("|    " + capitals.toString() + " Snack Bar                  |");
      System.out.println("|                                    |");
   if (DrinkQuantity > 0) System.out.println("|\t" + drink + "\t" + drinkCost + "\t             |");
   if (dessertQuantity > 0) System.out.println("|\t" + dessert + "\t" + dessertCost + "\t     |");
   if (burgerQuantity > 0) System.out.println("|\t" + burger + "\t" + burgerCost + "\t     |");
   if (BigMacQuantity > 0) System.out.println("|\t" + BigMac + "\t" + BigMacCost + "\t             |");
   if (SpicyChickenQuantity > 0) System.out.println("|\t" + SpicyChicken + "\t" + SpicyChickenCost + "\t     |");
   if (McDoubleQuantity > 0) System.out.println("|\t" + McDouble + "\t" + McDoubleCost + "\t     |");
   if (HappyMealQuantity > 0) System.out.println("|\t" + HappyMeal + "\t" + HappyMealCost + "\t     |");
      System.out.println("|                                    |");    
      System.out.println("_____________________________________");
      System.out.println("|   Order Number: " + randomOrderNumber + "                 |");
      System.out.println("|                                    |");
      System.out.println("| QTY       ITEM          TOTAL      |");
      System.out.println("_____________________________________");
   if (DrinkQuantity > 0) System.out.println("|\t" + DrinkQuantity + "\t" + drink + "\t" + DrinkTotal + "\t|");
   if (dessertQuantity > 0) System.out.println("|\t" + dessertQuantity + "\t" + dessert + "\t" + dessertTotal + "\t|");
   if (burgerQuantity > 0) System.out.println("|\t" + burgerQuantity + "\t" + burger + "\t" + burgerTotal + "\t|");
   if (BigMacQuantity > 0) System.out.println("|\t" + BigMacQuantity + "\t" + BigMac + "\t" + BigMacTotal + "\t|");
   if (SpicyChickenQuantity > 0) System.out.println("|\t" + SpicyChickenQuantity + "\t" + SpicyChicken + "\t" + SpicyChickenTotal + "\t|");
   if (McDoubleQuantity > 0) System.out.println("|\t" + McDoubleQuantity + "\t" + McDouble + "\t" + McDoubleTotal + "\t|");
   if (HappyMealQuantity > 0) System.out.println("|\t" + HappyMealQuantity + "\t" + HappyMeal + "\t" + HappyMealTotal + "\t|");
      System.out.println("_____________________________________");
      System.out.println("|         Subtotal:      "+Subtotal+"        |");
      System.out.println("|         Tax:           "+Tax+"        |");
      System.out.println("|         Total:         "+Total+"       |");
      System.out.println("_____________________________________");
      System.out.println("|     Thank you for your business!   |");
      System.out.println("|       Please come again soon!      |");
      System.out.println("_____________________________________"); 
   }
}