import java.util.Scanner;



/**

* This program allows the user to select the length of maple logs and,

* outputs how much weight and the amount of logs the truck can carry.

* 

*

* @author  Christian Briglio 

* @version 1.0

* @since   2020-02-18

*/



public class LogTruck {

  /**

  * This program allows the user to select the length of maple logs and,

  * outputs how much weight and the amount of logs the truck can carry.

  * 

  *

  * @author Christian Briglio 

  * @version 1.0

  * @since   2020-02-18

  */

  public static void main(String[] args) {

    // User question

    String question = ("Enter the log length in meters");

    System.out.println(question);

    // User input

    Scanner input = new Scanner(System.in);

    System.out.println("Possile log length choices are 0.25m, 0.50m, and 1m:  ");

    double number = input.nextDouble();

    // Calculation

    double max = 1100 / (20 * number);

    // Output

    System.out.println("The truck can carry " + max + " meters long " + number
        + " meters in length.");

  }

}




