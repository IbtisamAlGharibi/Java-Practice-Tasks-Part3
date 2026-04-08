public class Task3 {
    public static void main(String [] args){
        int[] array = {2, 1, 2, 3, 4};

        for (int i =0; i<array.length-1; i++){
            if (array[i] !=1 && array[i] !=3){
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }

    }

}
