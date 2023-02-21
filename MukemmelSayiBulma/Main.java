package MukemmelSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                toplam += i;
            }
        }
        if (toplam == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

    }
}
