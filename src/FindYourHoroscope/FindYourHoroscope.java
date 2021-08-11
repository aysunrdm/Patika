package FindYourHoroscope;

import java.util.Scanner;
import java.lang.String;

public class FindYourHoroscope {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month, day;
        String horoscope = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ay : ");
        month = sc.nextInt();

        if (1 <= month && month <= 12) {

            System.out.print("Doğduğunuz gün : ");
            day = sc.nextInt();
            sc.close();

            if (month == 1) {

                if (day >= 1 && day <= 31) {

                    if (day < 22) {

                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {

                if (day >= 1 && day <= 28) {

                    if (day < 20) {

                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {

                if (day >= 1 && day <= 31) {

                    if (day < 21) {

                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {

                if (day >= 1 && day <= 30) {

                    if (day < 21) {

                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {

                if (day >= 1 && day <= 31) {

                    if (day < 22) {

                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {

                if (day >= 1 && day <= 30) {

                    if (day < 23) {

                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {

                if (day >= 1 && day <= 31) {

                    if (day < 23) {

                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {

                if (day >= 1 && day <= 31) {

                    if (day < 23) {

                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {

                if (day >= 1 && day <= 30) {

                    if (day < 23) {

                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {

                if (day >= 1 && day <= 31) {

                    if (day < 23) {

                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {

                if (day >= 1 && day <= 30) {

                    if (day < 22) {

                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 12) {

                if (day >= 1 && day <= 31) {

                    if (day < 22) {

                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }

            if (isError) {
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
            } else {
                System.out.println("Burcunuz : " + horoscope);
            }

        } else {
            System.out.println("Lütfen 1 ile 12 arasında bir değer giriniz !");
        }
    }
}