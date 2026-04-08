public class Task10 {
    public static void main(String[] args) {
        int[] array = {1,4,3,4,5,6};

        int[] result = post4(array);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] post4(int[] array) {
        int lastIndex = -1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                lastIndex = i;
            }
        }

        int newSize = array.length - lastIndex - 1;
        int[] result = new int[newSize];

        int index = 0;
        for (int i = lastIndex + 1; i < array.length; i++) {
            result[index] = array[i];
            index++;
        }

        return result;
    }
}