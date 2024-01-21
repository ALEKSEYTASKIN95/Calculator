package Project;

import java.util.HashMap;
import java.util.TreeMap;

public class Check {

    static String[] romanArray = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public boolean isRoman(String str) {
        for (int i = 0; i < romanArray.length; i++) {
            if (str.equals(romanArray[i])) {
                return true;
            }
        }
        return false;
    }
}

