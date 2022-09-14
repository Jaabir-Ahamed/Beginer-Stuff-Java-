import java.util.Scanner;

class helloWorld {
    public static void main(String[] args) {
    String name;
    int age;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter name: ");
    while (myObj.hasNextLine() == true){    
        if (myObj.nextLine() == "") {
            System.out.println("Enter name: ");
        } else {
            System.out.println("Enter age: ");
        }
    }
        
    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
     


    }
}