public class Task8 {
    public static void main(String[]args){
        int [] array = {2,3,4,5,6,2};
        int n = 2;
        boolean result = sameEnds(array, n);
        System.out.println(result);

    }

    public static boolean sameEnds(int []array, int n){
        for ( int i =0; i<array.length-1; i++){
            if (array[i] == n && array[array.length-1] == n){
                return true;
            }
        }
        return false;
    }
}
