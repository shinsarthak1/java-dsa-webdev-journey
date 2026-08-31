public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 28, 20, 10, 5, 677 };
        System.out.println(findNums(nums));
        System.out.println(digits2(-34789));
        System.out.println(digits(6798969));
    }

    public static int findNums(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }
    public static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    public static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; 
        }

        return count;
    }

}
