package ba.unsa.rpr.tutorijal1;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;

        while(n != 0){
           suma += n%10;
           n /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {

        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();


        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0){
                System.out.printf("%d ", i);
            }
        }

    }
}
