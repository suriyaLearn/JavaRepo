import java.util.Scanner;

public class InputOutput {
    Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        InputOutput ob = new InputOutput();
//        ob.getUserInputString();
        ob.getUserInputDecimal();
    }

    public void  getUserInputString(){
        System.out.println("Enter your User Input as String");
        String userInput = input.nextLine();
        System.out.println("User has inputed the Text :"+userInput);
    }

    public void  getUserInputDecimal(){
        System.out.println("Enter your User Input as Decimal");
        float userInput = input.nextFloat();
        System.out.println("User has inputed the Decimal :"+userInput);
    }

}
