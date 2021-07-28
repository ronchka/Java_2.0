import java.util.Random;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        int maxNeg = 0;
        int minPos = Integer.MAX_VALUE;
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(11) - random.nextInt(11);
            if(array[i] < 0 && array[i] < maxNeg) {
                maxNeg = array[i];
            }
            else if(array[i] > 0 && array[i] < minPos) {
                minPos = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        int change = minPos;
        for (int i = 0; i < 20; i++) {
            if (array[i] == maxNeg) {
                array[i] = change;
            }
            else if (array[i] == minPos) {
                array[i] = maxNeg;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
