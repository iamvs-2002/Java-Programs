import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int number = sc.nextInt();
        
        int a = 0;
        int b = 1;

        for(int i=2; i<number; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
