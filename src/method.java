import java.util.Scanner;

public class method {
    public static void question1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any number of your choice: ");
        int a = sc.nextInt();
        if (a>0) System.out.println("It is a positive integer.");
        else System.out.println("It is a negative integer");
    }
}
