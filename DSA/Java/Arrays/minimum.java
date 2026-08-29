public class minimum {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 25, 8, 15};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println(min);

    }
}
