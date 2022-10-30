package Day6LogicalPrograms;
import java.util.Scanner;
public class Coupon_Randonm_Count {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of coupon numbers you will enter");
        int N = scanner.nextInt();
        int[] A = new int[N];

        System.out.println("Enter the Distinct Numbers");

        for(int i = 0; i < N; i++){
            System.out.println("enter" +i +"th number");
            A[i] = scanner.nextInt();
        }

        int range = A[0];
        for(int i =1; i < N; i++){
            if(A[i] > range)
                range = A[i];
        }

        int rand = 0;
        int count = 0;
        int rand_counter = 0;
        int[] B = new int[N];

        while(count < N){
            rand =(int)Math.floor(Math.random()*range+1);
            for(int i = 0; i<N; i++){
                if (rand == A[i] && B[i] == 0){
                    count++;
                    B[i]++;
                }
            }
            rand_counter++;
        }
        System.out.println("The number of distint Random numbers are " +rand_counter);
    }
}
