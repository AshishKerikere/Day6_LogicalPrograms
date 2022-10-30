package Day6LogicalPrograms;
import java.util.Scanner;
public class recorded_Time {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];

        System.out.println("Enter Initial Hours");
        A[0] = scanner.nextInt();
        System.out.println("Enter Initial Minutes");
        A[1] = scanner.nextInt();
        System.out.println("Enter Initial Seconds");
        A[2] = scanner.nextInt();

        System.out.println("Enter Final Hours");
        B[0] = scanner.nextInt();
        System.out.println("Enter Final Minutes");
        B[1] = scanner.nextInt();
        System.out.println("Enter Final Seconds");
        B[2] = scanner.nextInt();

        int initial_seconds = A[0]*3600 + A[1]*60 + A[2];
        int final_seconds = B[0]*3600 + B[1]*60 +B[2];
        int diff_seconds = final_seconds - initial_seconds;

        int[] C = new int[3];
        C[0] = diff_seconds/3600;

        int R1 = diff_seconds%3600;

        C[1] = R1/60;
        C[2] = R1%60;

        System.out.println("The Difference is " +C[0] +"Hours " +C[1] +"Minutes " +C[2] +"Seconds");

    }
}
