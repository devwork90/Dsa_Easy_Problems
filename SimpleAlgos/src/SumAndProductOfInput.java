public class SumAndProductOfInput {

    public static void main(String[] args) {
        int a = 234;
        int product = 1;
        int sum = 0;
        int answer = 0;

        String num = Integer.toString(a);
        char[] num_car = num.toCharArray();
        int[] numArr = new int[num_car.length];
        for (int i=0; i<numArr.length; i++) {
            numArr[i] = num.charAt(i) - '0';

        }
        for (int i : numArr) {
            sum += i;
            product *= i;
            answer = product - sum;
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println(answer);
    }

}
