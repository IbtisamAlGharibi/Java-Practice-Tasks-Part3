public class Task9 {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 3};

        int[] result = shiftLeft(array);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] shiftLeft(int[] array) {
        if (array.length == 0) {
            return array;
        }

        int first = array[0];


        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = first;

        return array;
    }
}