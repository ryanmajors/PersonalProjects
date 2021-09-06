import java.util.Scanner;

public class DiscSelector2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner in = new Scanner(System.in);

    int selection, throwing, distance, shape, again, confirm, last;
    String disc1, disc2, disc3, disc4, disc5, disc6, disc7, disc8, disc9, disc10, disc11, disc12, disc13, enter;

    disc1 = "Deputy";
    disc2 = "Judge";
    disc3 = "Suspect";
    disc4 = "Origin";
    disc5 = "Truth";
    disc6 = "Verdict";
    disc7 = "Maverick";
    disc8 = "Essence";
    disc9 = "Felon";
    disc10 = "Renegade";
    disc11 = "Tresspass";
    disc12 = "Ballista Pro";
    disc13 = "Invalid Entries";

    String discChoice = disc13;

    while(true) {

      //Print's starting menu and prompts user to select 1
      menu1();
      enter = in.nextLine();

      //Print's bh/fh menu and prompts user to select 1 or 2
      menu2();
      throwing = scan.nextInt();
      if(throwing >=3) {
        System.out.println("Incorrect selection.");
        continue;
      }

      //Print's distance menu and prompts user to select 1, 2, 3, or 4
      menu3();
      distance = scan.nextInt();
      if(distance >= 5) {
        System.out.println("Incorrect selection.");
        continue;
      }

      //Print's shot shape menu and prompts user to select 1, 2, or 3
      menu4();
      shape = scan.nextInt();
      if(shape >= 4) {
        System.out.println("Incorrect selection.");
        continue;
      }

      //Print's finalize menu and prompts user to select 1
      System.out.println("You have selected " + throwing + ", " + distance + ", and " + shape);
      System.out.println("Is this correct?");
      System.out.println("1. Yes ");
      System.out.println("2. No ");
      confirm = scan.nextInt();
      if(confirm != 1) {
        continue;
      }

      //code for choosing which discChoice
      if(throwing == 1 && distance == 1 && shape == 1) {
        discChoice = disc1;
      }
      else if(throwing == 1 && distance == 1 && shape == 2) {
        discChoice = disc2;
      }
      else if(throwing == 1 && distance == 1 && shape == 3) {
        discChoice = disc3;
      }
      else if(throwing == 1 && distance == 2 && shape == 1) {
        discChoice = disc4;
      }
      else if(throwing == 1 && distance == 2 && shape == 2) {
        discChoice = disc5;
      }
      else if(throwing == 1 && distance == 2 && shape == 3) {
        discChoice = disc6;
      }
      else if(throwing == 1 && distance == 3 && shape == 1) {
        discChoice = disc7;
      }
      else if(throwing == 1 && distance == 3 && shape == 2) {
        discChoice = disc8;
      }
      else if(throwing == 1 && distance == 3 && shape == 3) {
        discChoice = disc9;
      }
      else if(throwing == 1 && distance == 4 && shape == 1) {
        discChoice = disc10;
      }
      else if(throwing == 1 && distance == 4 && shape == 2) {
        discChoice = disc11;
      }
      else if(throwing == 1 && distance == 4 && shape == 3) {
        discChoice = disc12;
      }
      else if(throwing == 2 && distance == 1 && shape == 1) {
        discChoice = disc3;
      }
      else if(throwing == 2 && distance == 1 && shape == 2) {
        discChoice = disc2;
      }
      else if(throwing == 2 && distance == 1 && shape == 3) {
        discChoice = disc1;
      }
      else if(throwing == 2 && distance == 2 && shape == 1) {
        discChoice = disc6;
      }
      else if(throwing == 2 && distance == 2 && shape == 2) {
        discChoice = disc5;
      }
      else if(throwing == 2 && distance == 2 && shape == 3) {
        discChoice = disc4;
      }
      else if(throwing == 2 && distance == 3 && shape == 1) {
        discChoice = disc9;
      }
      else if(throwing == 2 && distance == 3 && shape == 2) {
        discChoice = disc8;
      }
      else if(throwing == 2 && distance == 3 && shape == 3) {
        discChoice = disc7;
      }
      else if(throwing == 2 && distance == 4 && shape == 1) {
        discChoice = disc12;
      }
      else if(throwing == 2 && distance == 4 && shape == 2) {
        discChoice = disc11;
      }
      else if(throwing == 2 && distance == 4 && shape == 3) {
        discChoice = disc10;
      }
      else {
        continue;
      }
      //Print's discChoice menu and prompts user to select 1 or 2

      System.out.println("You should throw a " + discChoice +  "!");
      System.out.println("");
      System.out.println("Select again   ");
      System.out.println(" 1. Yes ");
      System.out.println(" 2. Quit ");
      again = scan.nextInt();
      if (again == 1) {
        continue;
      }
      else {
        System.out.println("Thank you for using Disc Selector");
        break;
      }
    }

  }
  public static void menu1() {
    System.out.println("--------------------");
    System.out.println("|     Welcome      |");
    System.out.println("|   to the disc    |");
    System.out.println("|    selector!     |");
    System.out.println("|                  |");
    System.out.println("|   Press Enter    |");
    System.out.println("|    to begin!     |");
    System.out.println("--------------------");
  }
  public static void menu2() {
    System.out.println("Are you throwing backhand or forehand?");
    System.out.println(" 1. Backhand ");
    System.out.println(" 2. Forehand ");
  }
  public static void menu3() {
    System.out.println("Select your distance.");
    System.out.println(" 1. 0ft - 200ft ");
    System.out.println(" 2. 201ft - 300ft ");
    System.out.println(" 3. 301ft - 400ft ");
    System.out.println(" 4. 400+ feet! ");
  }
  public static void menu4() {
    System.out.println("What is the shot shape?");
    System.out.println(" 1. Left to Right ");
    System.out.println(" 2. Straight ");
    System.out.println(" 3. Right to Left ");
  }
  public static void menu5() {
    System.out.println("You have selected ");
    System.out.println("Is this correct?");
    System.out.println("1. Yes ");
    System.out.println("2. No ");
  }

}
