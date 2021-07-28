import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import gift.Candy;
import gift.Gift;
import gift.Jellybean;

public class Base {

    public static void main(String[] args) throws IOException {
        ArrayList<Gift> sweets = new ArrayList<Gift>();
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - конфеты \"Миндаль в шоколаде\"");
        System.out.println("'2' - конфеты \"Коровка\"");
        System.out.println("'3' - желе \"Бобы\"");
        System.out.println("'4' - закончить выбор");
        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Candy candy1 = new Candy("Конфеты \"Миндаль в шоколаде\"", 200, 1000.3, 200);
                    sweets.add(candy1);
                    totalPrice += candy1.getPrice();
                    totalWeight += candy1.getWeight();
                    System.out.println("Конфеты \"Миндаль в шоколаде\" добавлены в подарок");
                    break;
                case "2":
                    Candy candy2 = new Candy("Конфеты \"Коровка\"", 119, 150.2, 300);
                    sweets.add(candy2);
                    totalPrice += candy2.getPrice();
                    totalWeight += candy2.getWeight();
                    System.out.println("Конфеты \"Коровка\" добавлены в подарок");
                    break;
                case "3":
                    Jellybean jellybean1 = new Jellybean("Желе \"Бобы\"", 59, 50.5, "Зеленый");
                    sweets.add(jellybean1);
                    totalPrice += jellybean1.getPrice();
                    totalWeight += jellybean1.getWeight();
                    System.out.println("Желе \"Бобы\" добавлен в подарок");
                    break;
                case "4":
                    formed = true;
                    break;
            }


        }
        int count = 0;
        System.out.println("\nПодарок состоит из:");
        for (Gift someSweet:sweets) {
            count++;
            System.out.println(count + ". " + someSweet.toString());
        }
        System.out.printf("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice);
    }
}
