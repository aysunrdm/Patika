package TriangleAreaCalculation;
import java.lang.Math;
import java.util.Scanner;

public class TriangleAreaCal{
    public static void main(String[] args){
        
        double kenar1, kenar2, kenar3, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenar uzunluklarını sırasıyla giriniz: ");
        kenar1=input.nextDouble();
        kenar2=input.nextDouble();
        kenar3=input.nextDouble();

        input.close();

        double 𝑢 = (kenar1+kenar2+kenar3) / 2;
        
        alan = Math.sqrt(𝑢 * (𝑢 - kenar1) * (𝑢 - kenar2) * (𝑢 - kenar3));
        System.out.println("Alan: " + alan);
        
    }

}