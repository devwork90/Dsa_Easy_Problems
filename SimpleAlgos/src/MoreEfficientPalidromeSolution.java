public class MoreEfficientPalidromeSolution {

    public static void main(String args[]) {

        int num = 125978;
        boolean isPalidrome;
        isPalidrome = isPalindrome(num);
        System.out.println(isPalidrome);
    }

    private static boolean isPalindrome(int num) {
        /**
         * Store the given number in temp variable
         */
        int temp = num;
        int reversedNum = 0;
        while (temp > 0) {
            //Get the last digit of the given number using mod operator "%" with 10
            int lastDigit = temp % 10;

            //Get last digit from step2 in correct reversed position
            reversedNum = reversedNum * 10 + lastDigit;

            //Discard the processed last digit from temp variable
            temp = temp/10;
        }

        return num == reversedNum;
    }
}
