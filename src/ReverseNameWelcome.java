
import java.util.Scanner;

public class ReverseNameWelcome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String names[] = new String[5];


        System.out.println("Podaj 1 imie");
        names[0] = input.nextLine();

        System.out.println("Podaj 2 imie");
        names[1] = input.nextLine();

        System.out.println("Podaj 3 imie");
        names[2] = input.nextLine();

        System.out.println("Podaj 4 imie");
        names[3] = input.nextLine();

        System.out.println("Podaj 5 imie");
        names[4] = input.nextLine();


        for (int i = names.length-1; i>=0; i--) {

            System.out.println("Czesc " + names[i] + "." );
        }

        Scanner input2 = new Scanner(System.in);

        String names2[] = new String[5];

        int i = 0;

        while (i < names2.length) {

            names2[i] = String.valueOf(input2.nextInt());
            i++;
        }
    }
}











