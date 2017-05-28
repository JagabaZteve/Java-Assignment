
package hw.pkg01;
import java.util.Scanner;

/**
 *
 * @author STAPHEN
 */
public class HW01 {

   
    public static void main(String[] args) {
      Scanner j= new Scanner (System.in);
      System.out.print ("Enter number:");
      int jag=j.nextInt ();
      if (jag==0){System.out.println ("Error");}
      else if (jag%2==0){System.out.println(jag+" is an even number");}
      else System.out.println (jag+" is an odd number");
    }
    
}
