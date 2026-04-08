public class Task12 {
    public static void main(String[] args) {
        int start = 5;
        int end = 16;

        String[] output = fizzBuzz(start, end);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }


    public static String[] fizzBuzz(int start, int end) {
        int size = end - start;
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            int num = start + i;
            String result;


            if (num % 15 == 0) {
                result = "FizzBuzz";
            } else if (num % 3 == 0) {
                result = "Fizz";
            } else if (num % 5 == 0) {
                result = "Buzz";
            } else {
                result = Integer.toString(num);
            }

            array[i] = result;
        }

        return array;
    }
}