public class Task1 {
    public static void main(String[] args){
        int[] array = {2, 1, 2, 3, 4};

        int result = countEvens(array);
        System.out.println(result);

    }

    public static int countEvens(int[] array){
        int count = 0;
        for (int i = 0; i < array.length -1; i++){
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        return count;


    }
}
