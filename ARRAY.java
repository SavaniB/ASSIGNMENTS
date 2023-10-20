import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);

        for (int i : originalArray) {
            System.out.print(i + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
