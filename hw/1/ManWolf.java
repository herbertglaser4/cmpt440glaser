/**
   * file: ManWolf.java
   * author: Herbert Glaser
   * course: CMPT 440
   * assignment: Homework 1
   * due date: March 13, 2019
   * 
   * 
   * This file contains code for the ManWolf.java
   * which creates a Table-Driven DFA
   */
public class ManWolf {
  private static final int q0 = 0;
  private static final int q1 = 1;
  private static final int q2 = 2;
  private static final int q3 = 3;
  private static final int q4 = 4;
  private static final int q5 = 5;
  private static final int q6 = 6;
  private static final int q7 = 7;
  private static final int q8 = 8;
  private static final int q9 = 9;
  private static final int q10 = 10;
	
  private int state;
		
  static private int[][] delta =
    {{q10,q1,q10,q10},
    {q10,q0,q10,q2},
    {q5,q10,q3,q1},
    {q10,q4,q2,q10},
    {q7,q3,q10,q10},
    {q2,q6,q10,q10},
    {q10,q5,q7,q10},
    {q4,q10,q6,q8},
    {q10, q9,q10,q7},
    {q10,q8,q10,q10},
    {q10,q10,q10,q10}};
  
  public void reset() {
    state = q0;
  }
  
  public void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      try {
        if(c == 'c'){
          state = delta[state][0];
        }
        else if(c == 'g'){
          state = delta[state][1];
        }
        else if(c == 'w'){
          state = delta[state][2];
        }
        else if(c == 'n'){
          state = delta[state][3];
        }
      }
      catch (ArrayIndexOutOfBoundsException ex) {
        state = q10;
      }
    }
  }
  
  public boolean accepted() {
    return state==q9;
  }	   
}

