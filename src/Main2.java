public class Main2 {
    public static void main(String[] args) {
        int[] nums = {453,634,234,45,234,453,234,532};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i] && nums[i]%2 !=0){
                max = nums[i];
                System.out.println(max);
            }
        }

    }
}
