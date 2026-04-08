public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4, 5, 6};
            int result = sum13(array);
            System.out.println(result);

    }

    public static int sum13(int[] array){
        int count = 0;

        for (int i = 0; i < array.length -1; i++){
            if (array[i] == 13) {
                i++;
                continue;
            }
            count += array[i];

        }
        return count;



    }












}