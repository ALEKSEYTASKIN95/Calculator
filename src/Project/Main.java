package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.nextLine();
            System.out.println(calc(expression));
        }

    }

    public static String calc(String input) throws Exception {

        Check check = new Check();
        Convert convert = new Convert();
        Calculation calculation = new Calculation();

        String[] array = new String[2];
        String[] action = {"+", "-", "/", "*"};
        String[] regexAction = {"\\+", "-", "/", "\\*"};
        int num1;
        int num2;
        String result = "";


        int actionIndex = -1;
        for (int i = 0; i < action.length; i++) {
            if (input.contains(action[i])) {
                actionIndex = i;
                break;
            }
        }
        if (actionIndex == -1) {
            throw new Exception("Некорректное выражение");
        }
        array = input.split(regexAction[actionIndex]);
        if (array.length != 2) throw new Exception("Должно быть два операнда");
        try {
            if (check.isRoman(array[0]) && check.isRoman(array[1])) {
                num1 = convert.RomanToArabic(array[0]);
                num2 = convert.RomanToArabic(array[1]);
                int value = calculation.calc(num1, num2, action[actionIndex]);
                if (value < 0) {
                    throw new Exception("Римское число не может быть отрицатенльным");
                }
                result = convert.ArabicToRoman(value);
                return result;
            } else if (!check.isRoman(array[0]) && !check.isRoman(array[1])) {
                num1 = Integer.parseInt(array[0]);
                num2 = Integer.parseInt(array[1]);
                int value = calculation.calc(num1, num2, action[actionIndex]);
                result = Integer.toString(value);
                return result;
            } else throw new Exception("Числа должны быть в одном формате");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return result;
    }
}



