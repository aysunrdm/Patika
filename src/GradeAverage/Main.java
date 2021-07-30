package GradeAverage;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notu: ");

        int mat = input.nextInt();

        System.out.println("Fizik notu: ");

        int fizik = input.nextInt();

        System.out.println("Kimya notu: ");

        int kimya = input.nextInt();

        System.out.println("Türkçe notu: ");

        int turkce = input.nextInt();

        System.out.println("Tarih notu: ");

        int tarih = input.nextInt();

        System.out.println("Müzik notu: ");

        int muzik = input.nextInt();

        input.close();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalaması: " + ort);

        while (ort > 60) {
            System.out.println("Sınıfı Geçti");
            break;
        }

        while (ort < 60) {
            System.out.println("Sınıfta Kaldı");
            break;
        }

    }
}