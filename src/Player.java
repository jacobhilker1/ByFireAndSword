import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class Player {
  ArrayList<String> answers; 
  Scanner input;
  Random d6;
  Random d20;
  int roll;
  int[] options;
  public Player() {
    answers = new ArrayList<String>(); 
    answers.add("No, and...");
    answers.add("No.");
    answers.add("No, but...");
    answers.add("Yes, but...");
    answers.add("Yes.");
    answers.add("Yes, and...");
    input = new Scanner(System.in);
    options = new int[3];
    d6 = new Random();
    d20 = new Random();    
}

 
  String getAnswer(int i) {
    roll = d6.nextInt(6);
    return answers.get(roll);
    }
 
  int roll() {
    System.out.println("Press 1 for a d6 or 2 for a d20.");
      int i = input.nextInt();
      while (i <= 0 || i > 2) {
        System.out.println("A d6 or a d20?");
          i = input.nextInt();
         }

      if (i == 1) {
        roll = d6.nextInt(6);
  } else {
        roll = d20.nextInt(20);
    }
  return roll;
}
} 
