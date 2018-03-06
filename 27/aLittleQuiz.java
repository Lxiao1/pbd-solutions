import java.util.Scanner;
public class aLittleQuiz{
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  System.out.println("Are you ready to get reeeekt? (Y/N)");
  String yN = sc.next();
  if (yN.equals ("Y")){
    System.out.println("Okay here it comes!");
  }
     else if(yN.equals ("N")) {
      System.out.println("Too bad heres a quiz anyways!");
    }
  System.out.println("Q1) What is the capital of Alaska?");
  System.out.println("1) England");
  System.out.println("2) Mexico");
  System.out.println("3) Juneau");
  int qOne = sc.nextInt();
  if(qOne == 3){
    System.out.println("CORRECT!");
  }
    else {
      System.out.println("NOPE!");
    }
  System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
  System.out.println("1) Yes");
  System.out.println("2) No");
  int qTwo = sc.nextInt();
  if(qTwo == 1){
    System.out.println("Nope, \"cat\" can only be stored in a string value, not an int.");
  }
    else if(qTwo == 2){
      System.out.println("Yep, \"cat\" cannot be an integer.");
    }
  System.out.println("Q3) What is 9+3/15?");
  System.out.println("1) 15/3");
  System.out.println("2) 11");
  System.out.println("3) 3.14159265358");
  int qThree = sc.nextInt();
  if(qThree == 2){
    System.out.println("Good job");
  }
    else{
      System.out.println("Incorrect!");
    }
  if(qOne + qTwo + qThree == 7){
  System.out.println("You got 3/3 correct");
  }
    else{
      System.out.println("You didn't get perfect");
    }
  }
}
