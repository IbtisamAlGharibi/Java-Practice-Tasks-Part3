public class Task6 {
    public static void main(String[] args){
        int[] nums1={1,2,3,4,4,};
        int[] nums2={5,6,7,3,9,};

        int result = matchUp(nums1,nums2);
        System.out.println(result);

    }

    public static int matchUp(int[] nums1, int [] nums2){
        int count=0;
         for ( int i =0; i< nums1.length-1;i++){
             if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                 count++;
             }

         }

            return count;
    }
}
