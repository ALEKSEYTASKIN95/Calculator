package Project;

public class Check {
    public final String[] arabian = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public final String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public final String[] sign = {"+", "-", "*", "/"};


    public boolean checkArabian(String number) {
        for (String s : arabian) {
            if (s.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkRoman(String number) {
        for (String s : roman) {
            if (s.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkOperators(String operator) {
        for (String s : sign) {
            if (s.equals(operator)) {
                return true;
            }
        }
        return false;
    }
}
