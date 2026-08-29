public class FrequencyOfOneNum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 2, 4, 5, 2, 3 };
        int count = 0;

        for (int num : nums) {
            if (num == 2) {
                count++;
            }
        }
        System.out.println("Count: "+count);
    }
}
