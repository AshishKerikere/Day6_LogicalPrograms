package Day6LogicalPrograms;
import java.util.Scanner;
public class Fibonnaci_Series {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want in the Fibonacci Series");
        int N = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        System.out.print(a +"," +b +",");
        for (int i = 2; i<N; i++){
            c = a+b;
            System.out.print(c +",");
            a = b;
            b = c;
        }
    }
}
