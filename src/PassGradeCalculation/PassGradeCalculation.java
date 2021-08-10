package PassGradeCalculation;

import java.util.Scanner;

public class PassGradeCalculation {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int total=0, count=0, math, physics, turkish, chemistry, music;
       
        System.out.println("Matematik notunuz : ");
        math = input.nextInt();
            
        if(math>0 && math<100){
          
            total += math;
            count++;
        }
       
        System.out.println("Fizik notunuz : ");
        physics = input.nextInt();

        if(physics>0 && physics<100){
          
            total += physics;
            count++;
        }
        
        System.out.println("Türkçe notunuz : ");
        turkish = input.nextInt();

        if(turkish>0 && turkish<100){
          
            total += turkish;
            count++;
        }
        
        System.out.println("Kimya notunuz : ");
        chemistry = input.nextInt();

        if(chemistry>0 && chemistry<100){
          
            total += chemistry;
            count++;
        }
        
        System.out.println("Müzik notunuz : ");
        music = input.nextInt();

        if(music>0 && music<100){
          
            total+= music;
            count++;
        }

        input.close();
        
        double average = (double) total / count;

        if(average < 55){

            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }
        else{
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız :" + average);

    }
}
