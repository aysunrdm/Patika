package Taximeter;

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args){

    double perKm = 2.20, total, startPrice = 10;
    int km;

    Scanner input=new Scanner(System.in);
    System.out.print("Mesafeyi KM cinsinden giriniz: ");
    km = input.nextInt();

    input.close();
    
    total = (km + perKm);
    total += startPrice;

    total = (total<20) ? 20 : total;
    System.out.println("Toplam Tutar : " + total);
    
    }
}
