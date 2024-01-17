package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NewException {
        Scanner scanner = new Scanner(System.in);
        String nume = scanner.nextLine();
        String[] array = new String[3];
        array = nume.split(" ");
        if (array.length != 3) {
            throw new NewException("Введите строку правильно");
        }
        String num1 = array[0];
        String operator = array[1];
        String num2 = array[2];

        try {
            System.out.println(arab(num1, num2, operator));
            System.out.println(roman(num1, num2, operator));
        }catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя");
        }
    }

//   public static String calc (String input) throws NewException {
//        String [] array = new String[3];
//        array = input.split("");
//        if(array.length!=3){
//            throw new NewException("Введите строку правильно");
//        }
//        String num1 = array[0];
//        String operator = array[1];
//        String num2 = array[2];
//   }

    public static int arab(String s1, String s2, String o) throws NewException {
        int i1, i2;
        int result = 0;

        Check c = new Check();
        if (c.checkArabian(s1) && c.checkArabian(s2) && c.checkOperators(o)) {
            i1 = Integer.parseInt(s1);
            i2 = Integer.parseInt(s2);
            result = Calculation.calculation(i1, i2, o);
           return result;
        }

        return result;
    }
    public static String roman(String s1, String s2, String o) throws NewException {
        int i1, i2, result;
     //   String resultRoman = "";
        Check c = new Check();
        if (c.checkRoman(s1) && c.checkRoman(s2) && c.checkOperators(o)) {
            i1 = Convert.RomanToArabic(s1);
            i2 = Convert.RomanToArabic(s2);
            result = Calculation.calculation(i1, i2, o);
            if (result < 0){
                throw new NewException("Отрицательное число");
            }
           String resultRoman = Convert.ArabicToRoman(result);
            return resultRoman;
        } else {
            throw new NewException("Введено не правильное число");
        }
   //     return result
    }
}





//            if (arab(num1) && arab(num2) && c.checkOperators(operator)){
//                returnFirst = Integer.parseInt(num1);
//                returnSecond = Integer.parseInt(num2);
//                int arabianResult = Calculation.calculation(returnFirst, returnSecond, operator);
//                System.out.println(arabianResult);

//            } else if (c.checkRoman(num1) && c.checkRoman(num2) && c.checkRoman(operator)) {
//                returnFirst = Convert.RomanToArabic(num1);
//                returnSecond = Convert.RomanToArabic(num2);
//                int arabianResult = Calculation.calculation(returnFirst, returnSecond, operator);
//                if (arabianResult < 0) {
//                    throw new NewException("Отрицательное число");
//                }
//                String romanResult = Convert.ArabicToRoman(arabianResult);
//                System.out.println(romanResult);
//            } else throw new NewException("Введено не правильное число");
//        } catch (ArithmeticException e) {
//            System.out.println("Делить на ноль нельзя");
//        }