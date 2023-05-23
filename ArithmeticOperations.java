import java.util.Scanner;








// Main class
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = Add.add(num1, num2);
                break;
            case '-':
                result = Sub.sub(num1, num2);
                break;
            case '*':
                result = Mul.mul(num1, num2);
                break;
            case '/':
                result = Div.div(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
