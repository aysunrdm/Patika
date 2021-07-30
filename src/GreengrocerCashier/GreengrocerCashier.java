package GreengrocerCashier;
import java.util.Scanner;

public class GreengrocerCashier {
    
    public static void main(String[] args){
     
    Scanner sc= new Scanner(System.in);
         
    int pearKilo=0, appleKilo=0, tomatoKilo=0, bananaKilo=0, aubergineKilo=0;
    double totalAmount=0, pearPrice= 2.14, applePrice= 3.67, tomatoPrice= 1.11, bananaPrice= 0.95, auberginePrice= 5.00;

    System.out.print("Armut Kaç Kilo ? :");
    pearKilo = sc.nextInt();

    System.out.print("Elma Kaç Kilo ? :");
    appleKilo = sc.nextInt();

    System.out.print("Domates Kaç Kilo ? :");
    tomatoKilo = sc.nextInt();

    System.out.print("Muz Kaç Kilo ? :");
    bananaKilo = sc.nextInt();

    System.out.print("Patlıcan Kaç Kilo ? :");
    aubergineKilo = sc.nextInt();

    sc.close();

    totalAmount = (pearKilo*pearPrice) + (appleKilo*applePrice) 

    + (tomatoKilo*tomatoPrice) + (bananaKilo*bananaPrice) 

    + (aubergineKilo*auberginePrice); 
    
    System.out.print("Toplam Tutar : " + totalAmount + " TL");

    }
}