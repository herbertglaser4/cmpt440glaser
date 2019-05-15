/**
   * file: driverDFA.java
   * author: Herbert Glaser
   * course: CMPT 440
   * assignment: Homework 1
   * due date: March 13, 2019
   * 
   * This file contains the driverDFA code
   * which allows the user to test PunchOutDFA.java
   * 
   */
import java.io.*;
public class driverDFA {
  public static void main(String[] args)
  throws IOException {
	  System.out.println("***PunchOut!***");
	  System.out.println("Type the letters of the commands you want to do");
	  System.out.println(" j = jab, c = cross, b = block, d = dodge ");
    PunchOutDFA m = new PunchOutDFA(); // The DFA
    BufferedReader in = // Standard input
    new BufferedReader(new InputStreamReader(System.in));
    // Read and echo lines until EOF
    String s = in.readLine();
    while (s!=null) {
      m.reset();
      m.process(s);
      if (m.accepted()) System.out.println("Knock OUT You have defeated Mike Tyson!!!");
      else System.out.println("Ouch better luck next time");
      s = in.readLine();
    }
  }
}
