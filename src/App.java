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

    public static void main(String[] args) {

        int result = 0;
        
        int max = 2;
        int min = 1;

        System.out.println("Gæt på plat eller krone");

        String resultString = result == 1 ? "plat" : "krone";

        Scanner guessScenner = new Scanner(System.in);

        String guess = guessScenner.nextLine();

        guessScenner.close();

        if (guess.equals(resultString)){
            System.out.println("Du gættede rigtigt");
        }
        else{
            System.out.println("Du gættede forkert");
        }

    }
}
