import java.util.*;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextInt();
        System.out.print("Enter the second number: ");
        double b = sc.nextInt();
        System.out.print("Type 1 for addition 2 for subtraction 3 for multiplication and 4 for division: ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}

