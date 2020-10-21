import java.util.Scanner;
public class Primes {
    public static void main (String args[]){
        for (int j = 0; j < args.length; j++) {
            String n = args[j];
            for (int i = 2; i <= Integer.parseInt(args[j]); i++)
            {
                if (isPrime(i))
                    System.out.println(i);
            }
        }
        //System.out.print("Введите число n: ");
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
    }

    public static boolean isPrime(int n){
        for (int j = 2; j < n; j++)
        {
            if ((n % j) == 0)
                return false;
        }
        return true;
    }
}
