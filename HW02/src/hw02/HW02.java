
package hw02;
import java.util.Scanner;
/**
 *
 * @author STAPHEN
 */
public class HW02 {

  
    public static void main(String[] args) {
       int zteve;
       boolean isPrime =true;
       Scanner b=new Scanner (System.in);
       System.out.print ("Enter number:");
       int jag=b.nextInt();
       for (int a=2;a<=jag/2;a++)
       {
    zteve=jag%a;
    if (zteve==0){
       isPrime=false;
       break;
    }
}
if (isPrime)
System.out.println (jag+ " is a prime number");
else
System.out.println (jag+ " is not a prime number");
       
      
    }
    
}
