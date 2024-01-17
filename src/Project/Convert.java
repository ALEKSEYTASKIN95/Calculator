package Project;

public class Convert {
    public static String ArabicToRoman(int number) throws NewException {
        switch (number) {
            case 1 -> {
                return "I";
            }
            case 2 -> {
                return "II";
            }
            case 3 -> {
                return "III";
            }
            case 4 -> {
                return "IV";
            }
            case 5 -> {
                return "V";
            }
            case 6 -> {
                return "VI";
            }
            case 7 -> {
                return "VII";
            }
            case 8 -> {
                return "VIII";
            }
            case 9 -> {
                return "IX";
            }
            case 10 -> {
                return "X";
            }
            case 11 -> {
                return "XI";
            }
            case 12 -> {
                return "XII";
            }
            case 13 -> {
                return "XIII";
            }
            case 14 -> {
                return "XIV";
            }
            case 15 -> {
                return "XV";
            }
            case 16 -> {
                return "XVI";
            }
            case 17 -> {
                return "XVII";
            }
            case 18 -> {
                return "XVIII";
            }
            case 19 -> {
                return "XIX";
            }
            case 20 -> {
                return "XX";
            }
            default -> throw new NewException("Слишком большое число");
        }
    }

    public static int RomanToArabic(String number) throws NewException {
        switch (number) {
            case "I" -> {
                return 1;
            }
            case "II" -> {
                return 2;
            }
            case "III" -> {
                return 3;
            }
            case "IV" -> {
                return 4;
            }
            case "V" -> {
                return 5;
            }
            case "VI" -> {
                return 6;
            }
            case "VII" -> {
                return 7;
            }
            case "VIII" -> {
                return 8;
            }
            case "IX" -> {
                return 9;
            }
            case "X" -> {
                return 10;
            }
            default -> throw new NewException("Неверный формат данных");
        }
    }
}