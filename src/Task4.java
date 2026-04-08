public class Task4 {
    public static void main(String[] args) {
        int n = 4;

        int[] result = fizzArray(n);

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    // FIX: change return type from int → int[]
    public static int[] fizzArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        return array;
    }
}
