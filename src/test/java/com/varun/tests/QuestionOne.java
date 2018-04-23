package test.java.com.varun.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QuestionOne {

  /*
    Create a method called doesFileExist(String path) which takes the path of the file and
    tells the user if the file exists at that path or not. Assume all paths are relative to your
    project structure. If the file does not exist, catch the requisite exception.
   */
  @Test(enabled = true, groups = {"One"})
  @Parameters({"path"})
  public void testQuestionOne(String pathToFile) {
    try {
      Reporter.log(">>>>>"+ System.getProperty("user.dir") + "/src/test/java/com/varun/tests/"+ pathToFile);
      BufferedReader br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+"/src/test/java/com/varun/tests/"+pathToFile)));

      String st;
      while ((st = br.readLine()) != null) {

        String replace = st;
        replace = replace.replaceAll("[^\\p{ASCII}]", " - ");

        String[]tokenizer = replace.split("-|\\,");
        for (String tok: tokenizer) {
          Reporter.log(tok);
        }

      }
      br.close();
    } catch (FileNotFoundException e) {
      Reporter.log("File not exists or insufficient rights");
      e.printStackTrace();
    } catch (IOException e) {
      Reporter.log("An exception occured while reading the file");
      e.printStackTrace();
    }

  }
}
