import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String scan = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("Введи числа");
        scan = in.nextLine();
        in.close();
        System.out.println(calc(scan));

    }

    public static String calc(String input) throws Exception {
        String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};
        String[] split = input.split("\\s+");
        if (split.length < 3)
            throw new Exception();
        if (split.length > 3)
            throw new Exception();
        int a = 0, b = 0;
        for (int i = 0; i < romanArray.length; i++) {
            if (romanArray[i].equals(split[0])) {
                a = 1;
                split[0] = String.valueOf(i);
            }
            if (romanArray[i].equals(split[2])) {
                b = 1;
                split[2] = String.valueOf(i);
            }
        }
        if ((a + b) == 1) throw new Exception();
        if (Integer.parseInt(split[0]) > 10 || Integer.parseInt(split[2]) > 10)
            throw new Exception();

        int result = 0;
        switch (split[1]) {
            case "+":
                result = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
                break;
            case "-":
                result = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
                break;
            case "*":
                result = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
                break;
            case "/":
                result = Integer.parseInt(split[0]) / Integer.parseInt(split[2]);
                break;
        }
        if (a==0&&b==0){
            return String.valueOf(result);
        } else {
            if (result<=0)
                throw new Exception();
            return romanArray[result];
        }



    }
}









