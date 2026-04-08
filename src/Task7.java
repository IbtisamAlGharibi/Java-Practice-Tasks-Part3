public class Task7 {
    public static void main(String[] args){
        int [] array ={1,2,3,4,5};

        boolean result = modThree(array);
        System.out.println(result);

    }

    public static boolean modThree(int[] array){

        for (int i =0; i< array.length-1; i++){
            if ( (array[i] % 2 == 0 && array[i+1] % 2 == 0 && array[i+2] % 2 == 0) ||
                 array[i] % 2 != 0 && array[i+1] % 2 != 0 && array[i+2] % 2 != 0) {
                return true;

            }


        }
        return false;

    }
}
