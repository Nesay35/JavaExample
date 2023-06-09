package java_github_practice;

import java.util.Scanner;

public class ForLoop_RakamlariTopla {

/*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scanner.nextLine();

        System.out.println(rakamlariTopla(str));

    }
        public static double rakamlariTopla (String str){

            int toplam = 0;
            for (int i = 0; i < str.length(); i++) {

                if (Character.isDigit(str.charAt(i))) {

                    toplam += Integer.parseInt("" + str.charAt(i));

                }
            }

            return toplam;
        }
    }

