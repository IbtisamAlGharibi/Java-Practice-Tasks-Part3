public class Task5 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4};

        boolean result = no14(array);
        System.out.println(result);
    }

    public static boolean no14(int[] array) {
        boolean has1 = false;
        boolean has4 = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                has1 = true;
            }
            if (array[i] == 4) {
                has4 = true;
            }
        }


        return !(has1 && has4);
    }
}