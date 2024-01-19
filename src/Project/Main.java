package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NewException {
        Check check = new Check();
        Scanner scanner = new Scanner(System.in);
        String nume = scanner.nextLine();
        String[] array = new String[3];
        array = nume.split(" ");
        if (array.length != 3) {
            throw new NewException("Введите строку правильно");
        } else if (!check.checkOperators(array[1])){
         throw new NewException("Ведите правильный арифметический знак");
        }
            try {
                isRoman(array[0], array[2], array[1]);
            } catch (ArithmeticException e) {
                System.out.println("Делить на ноль нельзя");
            }
    }

    public static int arab(String s1, String s2, String o) throws NewException {
        int i1, i2;
        int result = 0;
        Check c = new Check();
        return (c.checkArabian(s1) && c.checkArabian(s2) && c.checkOperators(o)) ?
                (Calculation.calculation(Integer.parseInt(s1), Integer.parseInt(s2), o)) :
                (0);
    }

    public static String roman(String s1, String s2, String o) throws NewException {
        int i1, i2, result;
        Check c = new Check();
        if (c.checkRoman(s1) && c.checkRoman(s2) && c.checkOperators(o)) {
            i1 = Convert.RomanToArabic(s1);
            i2 = Convert.RomanToArabic(s2);
            result = Calculation.calculation(i1, i2, o);
            if (result < 0) {
                throw new NewException("Отрицательное число");
            }
            return Convert.ArabicToRoman(result);
        } else {
            throw new NewException("Введено не правильное число");
        }
    }

    public static void isRoman(String s1, String s2, String o) throws NewException {
        Check check = new Check();
        if (check.checkRoman(s1) && check.checkRoman(s2)) {
            System.out.println(Main.roman(s1, s2, o));
        } else {
            System.out.println(Main.arab(s1, s2, o));
        }
    }
}
