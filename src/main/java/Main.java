import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) throws ParseException {
        // int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] digits = {8, 9, 9, 9};
        System.out.println(Arrays.toString(Solution.plusOne(digits)));
    }

    public static class Solution {
        public static int[] plusOne(int[] digits) {
            if (digits[digits.length - 1] != 9) {
                digits[digits.length - 1]++;
            } else if (digits[digits.length - 1] == 9 && digits.length < 2) {
                return new int[]{1, 0};
            } else {
                if (digits[(digits.length - 1)] == 9) {
                    digits[(digits.length - 1)] = 0;
                    for (int i = 2; i < digits.length + 1; i++) {
                        if (digits[((digits.length) - i)] == 9 && i != (digits.length)) {
                            digits[(digits.length - i)] = 0;
                        } else if (digits[((digits.length) - i)] != 9 && i != (digits.length)) {
                            digits[(digits.length - i)]++;
                            return digits;
                        } else if (digits[((digits.length) - i)] != 9 && i == (digits.length)) {
                            digits[(digits.length - i)]++;
                            return digits;
                        } else if (digits[((digits.length) - i)] == 9 && i == (digits.length)) {
                            int[] out = new int[digits.length + 1];
                            out[0] = 1;
                            return out;
                        }
                    }
                } else {
                    digits[((digits.length) - 1)]++;
                }
            }
            return digits;
        }

//        public static int[] plusOne(int[] digits) {
//            StringBuilder sb = new StringBuilder();
//            for (int i : digits){
//                sb.append(i);
//            }
//            int d = Integer.parseInt(String.valueOf(sb)) + 1;
//            System.out.println(String.valueOf(dd));

//            char[] chars = ("" + d).toCharArray();
//            int[] out = new int[chars.length];
//            for (int i = 0; i < chars.length; i++){
//                out[i] = Integer.parseInt(String.valueOf(chars[i]));
//            }
//            return new int[]{0,0};
//        }
    }
}