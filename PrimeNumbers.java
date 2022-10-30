package Day6LogicalPrograms;
import java.util.Scanner;
class PrimeNumbers{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in)
    int A = scanner.nextInt();
    int factors = 0;
    
    for(int i = 1; i <= A; i++)
    {
      if(A%i == 0)
      {
        factors++;
      }
    }
    if (factors > 2)
    { System.out.println("it is not a Prime Number");}
    else
    { System.out.println("it is a Prime Number");}
  }
}
      
    
