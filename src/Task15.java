public class Task15 {
    public static void main(String[] args){
        int [] array ={1,2,3,4};
       int result = sum28(array);
        System.out.println(result);

    }

    public static int sum28(int [] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                sum += array[i];

            }
            return sum;

            if (sum == 8) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    }


