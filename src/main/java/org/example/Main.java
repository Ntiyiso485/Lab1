package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails stu =new StudentDetails();
        stu.displayDetails();
        ShoppingTotal shop=new ShoppingTotal();
        shop.productDetails();
        shop.calTotalValues();
        shop.discount(shop.total);
        System.out.println("===========================================================================================================");
        TempConversion temp=new TempConversion();
        temp.CelsiustoFahrenheit();
    }
}
