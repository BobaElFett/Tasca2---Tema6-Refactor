import java.util.Scanner;

public class Main {

    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Un numero divisible entre 3");

        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        String numSol = "";

        for (int i = 1; i <= n; i++) {
            numSol += i;
        }

        System.out.println("El numero es: " + numSol);

        if (Divisible3.divisible(Long.parseLong(numSol))) {
            System.out.println("El numero es divisible entre 3");
        } else {
            System.out.println("El numero no es divisible entre 3");
        }

        sc.close();
    }
}