public class Task13 {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5};

        int result = bigDiff(array);
        System.out.println(result);
    }

    public static int  bigDiff(int[] array) {
            int max = array[0];
            int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }


        }
            return max - min;

    }
}
