public class findPalidrome {

    public static void main(String[] args) {
        int n = -121;
        boolean isPali;
        isPali = isPalidrome(n);
        System.out.println(isPali);
    }

    public static boolean isPalidrome(int num) {
        try {
            String newString = swapNumber(num);
            int newInt = Integer.parseInt(newString);
            while (newInt == num) {

                return true;
            }
            if (!(newString.equals(num))) {
                addNewStringWithOldString(swapNumber(num));
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return Boolean.parseBoolean(null);
    }

    private static int addNewStringWithOldString(String swapNumber) {
        int StringToInt = Integer.parseInt(swapNumber);
        StringToInt += StringToInt;
        return StringToInt;
    }

    public static String swapNumber(int num) {
        String newNum = Integer.toString(num);
        char[] c = newNum.toCharArray();
        for (int i = 1; i < 2; i++) {
            //swap
            char temp = c[0];
            c[0] = newNum.charAt(c.length - 1);
            c[c.length - 1] = temp;
        }
        return String.valueOf(c);
    }
}
