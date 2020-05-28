import java.util.Scanner; 

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int factors = 0;
    int factor = 2;
    
    while (factor*factor <= x){
      if (x % factor == 0){
        x = x / factor;
        factors++;
      }
      else{
        factor++;
      }
    }
    
    System.out.println(factors + 1);
    
  }
}