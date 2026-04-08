public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 5, 4, 10};
        int[] result = withoutTen(array);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] withoutTen(int[] array) {
        int[] array2 = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 10) {
                array2[index] = array[i];
                index++;
            }
        }

        return array2;
    }
}