import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aydın Gizemli Sayıyı Bulma oyununa hoş geldiniz.");

        Scanner klavye = new Scanner(System.in);
        Random rand = new Random();
        int gizemlisayi = rand.nextInt(0, 101), can;

        do {
            System.out.println("Gizemli Sayıyı bulmak için talep ettiğiniz can sayısını girin");
            can = klavye.nextInt();
        } while (can < 1);

        int[] dizi = new int[can];

        int sayac = 0;
        System.out.println("Gizemli Sayı 0 ile 100 arasında tam sayıdır bunları esas alarak tahminlerinizi yapınız");
        for (int i = 0; i != can; i++) {
            System.out.println(i + 1 + ". tahmininizi girin");
            int tahmin = klavye.nextInt();
            dizi[i] = tahmin;

            if (tahmin == gizemlisayi) {
                System.out.println("Bravo,tahmininiz doğru");
                System.out.println(i+1+". tahmininizde gizemli sayıya ulaştınız ");
                break;
            } else {
                int sonuc = tahmin - gizemlisayi;
                int kalan = can - i - 1;
                if (sonuc > 0) {
                    System.out.println("Yanlış cevap verdiniz ");
                    System.out.println("Tahmininiz gizemli sayıdan büyüktür");
                    System.out.println("Kalan hakkınız=" + kalan);
                } else {
                    System.out.println("Yanlış cevap verdiniz ");
                    System.out.println("Tahmininiz gizemli sayıdan küçüktür");
                    System.out.println("Kalan hakkınız=" + kalan);
                }
                if (i == can - 1) {
                    System.out.println("------------------------");
                    System.out.println("Oyunu kaybettiniz");
                    System.out.println("Gizemli Sayı = " + gizemlisayi);
                    for (int b : dizi) {
                        System.out.println("Sizin tahminleriniz = " + b);
                    }

                }
            }
        }
    }
}