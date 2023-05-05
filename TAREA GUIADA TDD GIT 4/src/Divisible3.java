public class Divisible3 {

   public static boolean divisible(int n){

       long num;

       String numSol = "";

       for (int i = 1; i <= n; i++) {
           numSol += i;
       }

        return Long.parseLong(numSol) % 3 == 0;
    }
}
