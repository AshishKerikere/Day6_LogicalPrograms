package Day6LogicalPrograms;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int PN = scanner.nextInt();
        int Sum = 0;
        for (int i = 1; i <= PN / 2; i++) {
            if (PN % i == 0)
                Sum += i;
        }
        if (PN == Sum)
            System.out.println(PN + "is a Perfect Number");
        else
            System.out.println(PN + "it is not a Perfect Number");
    }
}
