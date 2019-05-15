/**
   * file: PunchOutDFA.java
   * author: Herbert Glaser
   * course: CMPT 440
   * assignment: Homework 1
   * due date: March 13, 2019
   * 
   * 
   * This file contains code for the PunchOutDFA.java
   * which creates a Table-Driven DFA
   */


public class PunchOutDFA {
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
  private static final int q11 = 11;
  private static final int q12 = 12;
  private static final int q13 = 13;
  private static final int q14 = 14;
  private static final int q15 = 15;
  private static final int q16 = 16;
  private static final int q17 = 17;
  private static final int q18 = 18;
  private static final int q19 = 19;
  private static final int q20 = 20;
  private static final int q21 = 21;
  private static final int q22 = 22;
  
  private int state;
		
  static private int[][] delta =
    // b   d   j   c
	{{q21,q1,q21,q21}, //0
    {q21,q21,q2,q9}, //1
    {q3,q3,q21,q21}, //2
    {q21,q21,q4,q11}, //3
    {q21,q21,q21,q5}, //4
    {q21,q6,q21,q21}, //5
    {q21,q21,q7,q7},  //6
    {q8,q21,q21,q21}, //7
    {q21,q21,q22,q22}, //8
    {q21,q10,q21,q21}, //9
    {q21,q21,q13,q11}, //10
    {q21,q12,q21,q21}, //11
    {q21,q21,q16,q21}, //12
    {q14,q14,q21,q21}, //13
    {q21,q21,q15,q16}, //14
    {q21,q21,q21,q7},  //15
    {q17,q21,q21,q21}, //16
    {q21,q21,q18,q19}, //17
    {q20,q20,q21,q21}, //18
    {q21,q20,q21,q21}, //19
    {q21,q21,q22,q22}, //20
    {q21,q21,q21,q21}, //21
    {q22,q22,q22,q22}}; //22
  
  public void reset() {
    state = q0;
  }
  
  public void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      try {
        if(c == 'b'){
          state = delta[state][0];
        }
        else if(c == 'd'){
          state = delta[state][1];
        }
        else if(c == 'j'){
          state = delta[state][2];
        }
        else if(c == 'c'){
          state = delta[state][3];
        }
      }
      catch (ArrayIndexOutOfBoundsException ex) {
        state = q21;
      }
    }
  }
  
  public boolean accepted() {
    return state==q22;
  }	   
}

