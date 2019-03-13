/**
   * file: driverDFA.java
   * author: Herbert Glaser
   * course: CMPT 440
   * assignment: Homework 1
   * due date: March 13, 2019
   * 
   * This file contains the driverDFA code
   * which allows the user to test ManWolf.java
   * 
   */
import java.io.*;
public class driverDFA {
  public static void main(String[] args)
  throws IOException {
    ManWolf m = new ManWolf(); // The DFA
    BufferedReader in = // Standard input
    new BufferedReader(new InputStreamReader(System.in));
    // Read and echo lines until EOF
    String s = in.readLine();
    while (s!=null) {
      m.reset();
      m.process(s);
      if (m.accepted()) System.out.println("That is a solution.");
      else System.out.println("That is not a solution.");
      s = in.readLine();
    }
  }
}
