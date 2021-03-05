package Project1;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people are ordering the food? ");
        int people = input.nextInt();

        if (people < 10)
        {
            System.out.println("Invalid entry. You need at least 10 people for group order.");
            System.exit(-1);
        }


        //Main Menu
        displayMainMenu();
        System.out.println();
        System.out.println("Choose what type of food you would like to order(1 for Italian; 2 for Chinese AND 3 for American):");
        int mealType = input.nextInt();

        //Checking for type of meal to display
        switch (mealType)
        {
            case 1:
                displayItalianFoodMenu();
                break;
            case 2:
                displayChineseFoodMenu();
                break;
            case 3:
                displayAmericanFoodMenu();
                break;
            default:
                System.out.println("Invalid Entry. (Enter 1 for Italian/2 for Chinese/3 for American");
                System.exit(-1);
        }
        System.out.println();
        System.out.println("Enter you Choice (1/2/3): ");
        int choice = input.nextInt();
        System.out.println();
        //to determine feeds for Trays
        int feeds = 0;
        double price = 0;
        if (mealType == 1)
        {
            if (choice == 1)
            {
                feeds = 5; price = 17.99;
            }
            else if (choice == 2)
            {
                feeds = 7; price = 15.99;
            }
            else if (choice == 3)
            {
                feeds = 4; price = 12.99;
            }
        }
        else if (mealType == 2)
        {
            if (choice == 1 || choice == 2)
            {
                feeds = 7; price = 18.99;
            }
            else if (choice == 3)
            {
                feeds = 5; price = 10.99;
            }
        }
        else if (mealType == 3)
        {
            if (choice == 1)
            {
                feeds = 8; price = 21.99;
            }
            else if (choice == 2)
            {
                feeds = 5; price = 22.99;
            }
            else if (choice == 3)
            {
                feeds = 10; price = 26.99;
            }
        }
        //Calling to calculate number of trays needed
        int trays = determineTrays(people, feeds);

        //Calculate price before tax
        double subtotal = getSubtotal(price, trays);
        System.out.println("Price for "+people+" people ("+trays+" trays): $"+subtotal);

        //Calculate tax
        double taxRate = 0.07;
        double tax = getTax(subtotal, taxRate);

        //Calculate tips
        double tipRate = 0.15;
        double tip = getTip(subtotal, tipRate);

        //Calculate Grand Total
        double grandTotal = getGrandTotal(subtotal, tax, tip);

        //Calculate Per person price
        getPricePerPerson(grandTotal, people);

        //Leftover
        determineLeftOvers(feeds, trays, people);

    }

    public static void displayMainMenu(){
        System.out.println("CHOOSE TYPE OF MEAL");
        System.out.println("__________________      ");
        System.out.println("1. Italian\n2. Chinese\n3. American");
    }

    public static void displayItalianFoodMenu(){
        System.out.println("CHOOSE ONE");
        System.out.println("---------");
        System.out.println("1. Lasagna Tray - Feeds 5 - $17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - $15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - $12.99");

    }

    public static void displayChineseFoodMenu(){
        System.out.println("CHOOSE ONE");
        System.out.println("---------");
        System.out.println("1. Chicken an Broccoli Tray (Includes 7 wonton soups, 7 egg rolls)- Feeds 7 - $18.99");
        System.out.println("2. Sweet and Sour Pork Tray (Includes 7 hot and sour soups, 7 egg rolls)- Feeds 7 - $18.99");
        System.out.println("3. Shrimp Fried Rice Tray (Includes 10 egg rolls) - Feeds 5 - $10.99");
    }

    public static void displayAmericanFoodMenu(){
        System.out.println("CHOOSE ONE");
        System.out.println("---------");
        System.out.println("1. Hamburger and Hot Dog Tray - Includes buns and condiments - Feeds 8 - $21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - Includes dipping sauces - Feeds 5 - $22.99");
        System.out.println("3. Barbeque Tray - Includes buns and peach cobbler - Feeds 10 - $26.99");
    }

    public static int determineTrays(int people, int feeds){
        int trays = people / feeds;
        if (people % feeds != 0)
        {
            trays = trays + 1;
        }

        System.out.println("You need "+trays+" trays");
        System.out.println("Feeds: "+feeds);
        return trays;
    }
    public static double getSubtotal(double price, int trays){
        double subtotal = trays * price;
        //System.out.println("Price for "+people+" ("+trays+"): "+subtotal);
        return subtotal;
    }

    public static double getTax(double subtotal, double taxRate){
        double tax = subtotal * taxRate;
        String for_tax = String.format("%.2f", tax);
        System.out.println("Tax: $"+for_tax);
        return tax;
    }

    public static double getTip(double subtotal, double tipRate){
        double tip = subtotal * tipRate;
        String tip1 = String.format("%.2f", tip);
        System.out.println("Tip: $"+tip1);
        return tip;
    }

    public static double getGrandTotal(double subtotal, double tax, double tip){
        double grandTotal = subtotal + tax + tip;
        String total = String.format("%.2f", grandTotal);
        System.out.println("Total (food, tax, tip): $"+total);
        return grandTotal;
    }

    public static double getPricePerPerson(double grandTotal, int people){
        double perPerson = grandTotal / people;
        String perPerS = String.format("%.2f", perPerson);
        System.out.println("Price per person: $"+perPerS);
        return perPerson;
    }

    public static int determineLeftOvers(int feeds, int trays, int people){
        int leftOvers = (trays * feeds) - people;
        System.out.println("Leftover servings for the delivery person: "+leftOvers);
        return leftOvers;
    }

}
