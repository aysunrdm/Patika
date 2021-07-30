package CircleSliceArea;
import java.util.Scanner;

public class CircleSliceArea {
    
public static void main(String[] args){

Scanner input = new Scanner(System.in);

    int r, 𝛼;
    double pi=3.14, sliceArea;

    System.out.println("Yarıçapı ve merkez açısının ölçüsünü giriniz: ");
    
    r= input.nextInt();
    𝛼= input.nextInt();

    input.close();

    sliceArea = (pi * (r*r) * 𝛼) / 360;

    System.out.println("Daire diliminin alanı: " + sliceArea);

    
}
}
