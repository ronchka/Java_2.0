import java.util.Scanner;
/**
 * @author Natalya Ronchka
 */
public class Task1_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 или 2 (где 1 - калькулятор,  2 - поиск максимального слова в массиве)");
        int zadacha = in.nextInt();
        if (zadacha == 1) {
        System.out.println("Введите x: "); // вводим первое число
        float x = in.nextFloat();
        System.out.println("Введите y: "); // вводим второе число
        float y = in.nextFloat();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: "); // указываем знак операции
        String s = in.next();
        float z = 0;
        switch (s) {
            case "+":
                z = x + y;
                break;
            case "-":
                z = x - y;
                break;
            case "*":
                z = x * y;
                break;
            case "/":
                z = x / y;
                break;
        }
        System.out.printf("%.4f", z);  // выводим на экран ответ
        }
        else if (zadacha == 2) {
            System.out.println("Введите размерность массива: ");
            int n = in.nextInt();
            String[] str = new String[n];
            String longest = "";
            System.out.println("Введите слова: ");
            for (int i = 0; i < n; i++) {
                str[i] = in.next();
                if (str[i].length() >= longest.length()) {
                    longest = str[i];
                }
            }
            System.out.println("Самое длинное слово:" + longest);
        }
    }
}

