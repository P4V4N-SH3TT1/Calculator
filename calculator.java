import java.util.Scanner;

public class calculator
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float num1 = 67;//scanner.nextFloat();

        System.out.println("Enter second number: ");
        float num2 = 89;//scanner.nextFloat();

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("Select Operation: ");
        int choice = 1;//scanner.nextInt();

        float result = 0;

        switch(choice) 
        {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static float add(float x, float y) 
    {
        return x + y;
    }

    public static float subtract(float x, float y) 
    {
        return x - y;
    }

    public static float multiply(float x, float y) 
    {
        return x * y;
    }

    public static float divide(float x, float y) 
    {
        if (y != 0) 
        {
            return x / y;   
        } 
        else 
        {
            System.out.println("Cannot divide by zero");
            return Float.NaN;
        }
    }
}
