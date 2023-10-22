public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 5, 4, 3, 4, 4, 5, 5, 5};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        System.out.println(result / nums.length);

    }
}