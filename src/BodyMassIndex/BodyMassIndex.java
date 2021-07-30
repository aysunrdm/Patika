package BodyMassIndex;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int weight;
    double bodyMassIndex, height;
    
    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
    height = input.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz :");
    weight = input.nextInt();
    
    input.close();

    bodyMassIndex = weight / (height * height);

    System.out.println("Vücut Kitle İndeksiniz :" + bodyMassIndex);

    }    
}