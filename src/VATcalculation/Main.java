package VATcalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOran = 0, kdvTutar, kdvLiTutar;

        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextInt();

        if (tutar > 0 && tutar <= 1000) {
            kdvOran = 0.18;
        } else if (tutar > 1000) {
            kdvOran = 0.08;
        } else
            System.out.println("Geçerli bir tutar giriniz!!");

        kdvTutar = tutar * kdvOran;
        kdvLiTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li Fiyat: " + kdvLiTutar);
    }
}