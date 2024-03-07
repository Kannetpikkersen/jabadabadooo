import java.util.Scanner;

import java.util.Random;
        int guess;
        int result;
        int max;
        int min;
        int plat;
        int krone;
        int gæt;

public class App {

    public void setup(){
        plat = 1;
        krone = 2;
        max = 2;
        min = 1;
        guess = gæt;

    }

    public void main(String[] args) {

        System.out.println("Gæt på plat eller krone")

        Scanner gæt = new Scanner(System.in);

        result = (int) (Math.random() * (max - min + 1) + min);

        if (guess == result){
            System.out.println("Du gættede rigtigt");
        }
        else{
            System.out.println("Du gættede forkert");
        }

    }
}
