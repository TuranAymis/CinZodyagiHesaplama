import java.util.Scanner;

public class Main {
    /*
    
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 | Maymun
    Doğum Tarihi %12 = 1 | Horoz
    Doğum Tarihi %12 = 2 | Köpek
    Doğum Tarihi %12 = 3 | Domuz
    Doğum Tarihi %12 = 4 | Fare
    Doğum Tarihi %12 = 5 | Öküz
    Doğum Tarihi %12 = 6 | Kaplan
    Doğum Tarihi %12 = 7 | Tavşan
    Doğum Tarihi %12 = 8 | Ejderha
    Doğum Tarihi %12 = 9 | Yılan
    Doğum Tarihi %12 = 10 | At
    Doğum Tarihi %12 = 11 | Koyun

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int age = input.nextInt();
        int result = age % 12;
        String animal = "";
        String text = "Çin Zodyağı Burcunuz: ";

        animal = switch (result) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> animal;
        };
        System.out.println(text + animal);
    }
}