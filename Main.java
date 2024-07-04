import java.util.Scanner;

public class Main {
    // 'public' means this can be accessed in any class.
    public static void main(String args[]){
    // 'static variables & functions don't need Objects 
        System.out.println("Hello World !");
    // String args[] -- Command Line arguements
        System.out.println(args[0]);
    // Taking Input
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        input.close();
        System.out.println(a);
    }
}
