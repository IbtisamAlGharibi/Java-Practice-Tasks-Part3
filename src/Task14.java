public class Task14 {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5};
        int result = sum67(array);
        System.out.println(result);

    }

    public static int sum67(int[] array){
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                continue;
            }else{
                sum += array[i];
            }
        }
        return sum;

        }
}
