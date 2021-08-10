package ActivitySuggestion;

import java.util.Scanner;

public class ActivitySuggestion {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz :");
        heat = input.nextInt();

        input.close();

        if (10 <= heat && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (5 < heat && heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (15 < heat && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}