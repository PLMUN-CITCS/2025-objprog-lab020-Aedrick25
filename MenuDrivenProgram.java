import java.util.Scanner;

public class MenuDrivenProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        int choice = displayMenu(scanner);
        handleMenuChoice(choice);

        if(choice == 1){
            greetUser();
        }
        else if(choice == 2){
            checkEvenOrOdd(scanner);
        }
        else if(choice == 3){
            System.out.print("Exiting program. Goodbye!");
            break;
        }
        else{
            System.out.print("Invalid Input, Retry");
        }
    }

    }

    public static void greetUser(){
        System.out.println("Hello! Welcome!");
    }

    public static void handleMenuChoice(int choice){

    }
    
    public static int displayMenu(Scanner scanner){
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
        return scanner.nextInt();
    }

    public static void checkEvenOrOdd(Scanner scanner){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int choicee = scan.nextInt();
        if(choicee %2 ==0 ){
            System.out.println(choicee + " is an Even Number.");
        }
        else if(choicee%2 == 1){
            System.out.println(choicee + " is an Odd Number.");
        }

    }

}