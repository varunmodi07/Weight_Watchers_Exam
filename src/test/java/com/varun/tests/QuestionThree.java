package test.java.com.varun.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import org.testng.Reporter;
import org.testng.annotations.Test;


/* TEST CASE CAN BE EXECUTED WITH TESTNG DIRECTLY
 *
 */
public class QuestionThree {


  @Test(enabled = true, groups = {"Three"})
  public void testPrintSmallestRandomNumber() {

    Reporter.log("Generate 500 random numbers and print the nth smallest number");

    TreeSet<Integer> numbers = new TreeSet<>();
    Random randomNumber = new Random();
    int number;

    for (int x=0;x<=500;x++){
      number = randomNumber.nextInt(5000);
     // Reporter.log(x + " .- " +number + "<br>);
      numbers.add(number);
    }
    numbers.descendingIterator();

    Reporter.log("<br>This is the smallest number of the random generated numbers: <br>" + numbers.first());

  }


}
