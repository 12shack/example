import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String EXIT = "exit";

        while(true){

            System.out.println("------Calculator------");
                System.out.println("------Addition--------");
                System.out.println("------Subtraction-----");
                System.out.println("------Multiplication--");
                System.out.println("------Division--------");
                System.out.println("------Modulus---------");
                System.out.println("------EXIT------------");

                System.out.println("Please choose from the following");

                String input = scanner.next();



                    switch (input) {
                        case ("addition"):
                            int add1 = setValue("first");
                            int add2 = setValue("Second");
                            int addTotal = addition(add1, add2);
                            System.out.println("Total: " + addTotal);

                            break;

                        case ("subtraction"):
                            int sub1 = setValue("first");
                            int sub2 = setValue("Second");
                            int subTotal = subtraction(sub1, sub2);
                            System.out.println("Total: " + subTotal);


                            break;

                        case ("multiplication"):
                            int multi1 = setValue("first");
                            int multi2 = setValue("Second");
                            int multiTotal = multiplication(multi1, multi2);
                            System.out.println("Total: " + multiTotal);


                            break;

                        case ("division"):
                            int div1 = setValue("first");
                            int div2 = setValue("Second");
                            int divTotal = division(div1, div2);
                            System.out.println("Total: " + divTotal);

                            break;
                        case ("modulus"):
                            int mod1 = setValue("first");
                            int mod2 = setValue("Second");
                            int modTotal = modulus(mod1, mod2);
                            System.out.println(modTotal);

                            break;
                        case ("exit"):
                            System.out.println("You have Exited");
                            break;
                        default:
                            System.out.println("invalid input please choose from the following");

                    }

        }

    }

    public static int addition(int num1, int num2) {
        int value = num1 + num2;
        return value;
    }

    public static int setValue(String prompt) {
        System.out.println("Enter " + prompt + " Value:");
        int value = scanner.nextInt();

        return value;
    }

    public static int subtraction(int num1, int num2) {
        int value = num1 - num2;
        return value;
    }
    public static int multiplication(int num1, int num2) {
        int value = num1 * num2;
        return value;
    }
    public static int division(int num1, int num2) {
        int value = num1 / num2;
        return value;
    }
    public static int modulus(int num1, int num2) {
        int value = num1 % num2;
        return value;
    }

}

