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
        grf
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
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число ");
        double one = Double.parseDouble(reader.readLine());
        System.out.print("Введите второе число ");
        double two = Double.parseDouble(reader.readLine());
        System.out.print("Введите знак сложения, вычитания, произведения или деления  ");
        String operation = reader.readLine();
        Calculator calculator = new Calculator(one , two , operation);

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
