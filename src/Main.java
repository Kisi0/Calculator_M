
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Calculator calculator= new Calculator();
        while (true){
            System.out.println("Advanced Calculator");
            System.out.println("1.Addition (+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division (/)");
            System.out.println("5.Square Root(√)");
            System.out.println("6.Power()");
            System.out.println("7.Memory Funcsions");
            System.out.println("8.Exit");
            System.out.println("Select an operation (1/2/3/4/5/6/7/8)");

            int choice=scanner.nextInt();
            if(choice==8){
                System.out.println("Exiting Calculator");
                break;
            }
            double result=0.0;
            double num1;
            double num2;

            switch (choice){
                case 1:
                    System.out.println("Enter first number :");
                    num1= scanner.nextDouble();
                    System.out.println("Enter second number :");
                    num2= scanner.nextDouble();
                    result=calculator.gjejshumen(num1,num2);
                    break;
                case 2:
                    System.out.println("Enter first number :");
                    num1= scanner.nextDouble();
                    System.out.println("Enter second number :");
                    num2= scanner.nextDouble();
                    result=calculator.gjejdiferencen(num1,num2);
                    break;
                case 3:
                    System.out.println("Enter first number :");
                    num1= scanner.nextDouble();
                    System.out.println("Enter second number :");
                    num2= scanner.nextDouble();
                    result=calculator.gjejshumezimin(num1,num2);
                    break;
                case 4:
                    System.out.println("Enter first number :");
                    num1= scanner.nextDouble();
                    System.out.println("Enter second number :");
                    num2= scanner.nextDouble();
                    result=calculator.gjejpjestimin(num1,num2);
                    break;
                case 5:
                    System.out.println("Enter number :");
                    num1= scanner.nextDouble();
                    result=calculator.gjejrrenjakatrore(num1);
                    break;

                case 6:
                    System.out.println("Enter the base :");
                    num1= scanner.nextDouble();
                    System.out.println("Enter the exponent :");
                    num2= scanner.nextDouble();
                    result=calculator.gjejfuqia(num1,num2);
                    break;
                case 7:
                    handleMemoryFunksions(scanner, calculator);
                    continue;
                default:
                    System.out.println("Invalid choice of menu :");
                    continue;


            }
            System.out.println("The result is : " + result);
            System.out.println(" ");


        }

    }
    private static void handleMemoryFunksions(Scanner scanner, Calculator calculator){


        System.out.println("Meomory Funksions");
        System.out.println("1.Add to Memory (M+)");
        System.out.println("2.Clear Memory (MC)");
        System.out.println("3.Recall Memory (MR)");
        System.out.println("Select a memory funksion (1/2/3)");
        int memoryChoice= scanner.nextInt();
        switch (memoryChoice){
            case 1:
                System.out.println("Enter value to add to memory: ");
                double valuetoAdd= scanner.nextDouble();
                calculator.addToMemory(valuetoAdd);
                System.out.println("Value added to memory");
                break;

            case 2:
                calculator.clearMemory();
                System.out.println("Memory cleared");
                break;
            case 3:
                double reCalledValue= calculator.recallMemory();
                System.out.println("Value recalled from memory " + reCalledValue);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }

}
