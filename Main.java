import java.util.Scanner;
/** This program will make a square to the dimesnsions that the user puts in
 *
 * @author Isaac
 */
public class Main {
// make an integer that prints based off how many
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter a number from 1-10");
    int num1 = input.nextInt();
    
  for  (int count = 0; count < num1 ; count++){
    int star = count;
    for (int count2 = 0; count2 <= num1 - 1 ; count2++){
      int uyo = count2*num1;
    System.out.print("*");
    }
    System.out.println();
    
    
    
    
    }
  }
}
