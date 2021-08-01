package UserLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userName, password, select, newPassword;

        System.out.println("Kullanıcı Adınız : ");
        userName = sc.nextLine();

        if (userName.equals("patika")) {

            System.out.println("Şifreniz : ");
            password = sc.nextLine();

            if (password.equals("java123")) {

                System.out.println("Giriş yaptınız !");

            }

            else {

                System.out.println("Yanlış şifre girdiniz... Şifrenizi sıfırlamak ister misiniz ?");
                select = sc.nextLine();

                switch (select) {
                    case "evet":
                        System.out.println("Yeni şifreyi oluşturunuz : ");
                        newPassword = sc.nextLine();

                        if (newPassword.equals(password) || newPassword.equals("java123")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                        } else {
                            System.out.println("Şifre oluşturuldu");
                        }

                    default:
                        System.out.println("Sistemden çıkılıyor...");
                        break;
                }

            }
        }

        else {
            System.out.println("Kullanıcı adı bulunamadı !");

        }

        sc.close();

    }
}