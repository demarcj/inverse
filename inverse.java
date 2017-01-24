package pack;

import java.util.Scanner;

public class InverseNumbers {
  public static void main(String[] args){
	  //I'm setting up my variables for the rest of the project
	  int inputNum;
	  int reverseNum = 0;
	  Scanner scan = new Scanner(System.in);
	  inputNum = scan.nextInt();
	  while(inputNum != 0){
		//This allow the last number to go up a digit so we can access the next number in order
		reverseNum = reverseNum * 10;
	    //When I use inputNum%10 I can get the last number 
		reverseNum = reverseNum + inputNum%10;
	    //When divided the number as an int it keep the number a whole and to get rid of the last number too.
		inputNum = inputNum/10;
	  }
	  System.out.println(reverseNum);
	  
  }
}
