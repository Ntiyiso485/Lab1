package org.example;

import java.util.Scanner;

public class ShoppingTotal {

    String name;
    double price;
    int quantity;
    double total=0;

   void productDetails() {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the name of the product: ");
       name = scan.next();

       System.out.print("Enter the Price of the product: ");
       price = scan.nextDouble();

       System.out.print("Enter the Quantity of the product: ");
       quantity = scan.nextInt();
   }
    void calTotalValues(){


        total=price*quantity;
        System.out.println("\nProduct Name: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: R" + total);

    }
    void discount(double total){
        double disc=0;
        double disc_per=0.10;

        disc=disc_per*total;
        double finalTotal = total - disc;

        System.out.println("Discount (10%): R" + disc);
        System.out.println("Total after discount: R" + finalTotal);



    }
}
