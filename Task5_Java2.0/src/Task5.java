import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    static class Calculator {
        double one;
        double two;
        String operation;

        Calculator(double one , double two , String operation){
            this.one = one;
            this.two = two;
            this.operation = operation;
        }
        double plus(){
            return one + two;
        }
        double minus(){
            return one - two;
        }
        double proizv(){
            return one * two;
        }
        double delenie(){
            return one / two;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число ");
        double one = 0;
        try {
            one = Double.parseDouble(reader.readLine());
        }
        catch (NumberFormatException  e) {
            System.out.println("Не правильный формат числа");
        }
        System.out.print("Введите второе число ");
        double two = 0;
        try {
            two = Double.parseDouble(reader.readLine());
        }
        catch (NumberFormatException  e) {
            System.out.println("Не правильный формат числа");
        }
        System.out.print("Введите знак сложения, вычитания, произведения или деления");
        String operation = reader.readLine();
        if (operation != "+|-|*|/") {
            try {
                throw new IOException();
            }
            catch (IOException e) {
                System.out.println("Вы можете ввести только знак сложения, вычитания, произведения или деления");
            }
        }
        Calculator calculator = new Calculator(one, two, operation);

        switch (operation){
            case ("+"):
                System.out.printf("Сумма чисел  = %.2f", calculator.plus());
                break;
            case ("-"):System.out.printf("Вычитание чисел  = %.2f", calculator.minus());
                break;
            case ("/"):System.out.printf("Деление чисел  = %.2f", calculator.delenie());
                break;
            case ("*"):System.out.printf("Произведение чисел  = %.2f", calculator.proizv());
                break;
        }
    }
}
