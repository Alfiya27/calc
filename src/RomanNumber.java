import java.util.ArrayList;
import java.util.TreeMap;

public class RomanNumber {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }



    private static final ArrayList<String> letter = new ArrayList<>();

    static  {
        letter.add("");
        letter.add("I");
        letter.add("II");
        letter.add("III");
        letter.add("IV");
        letter.add("V");
        letter.add("VI");
        letter.add("VII");
        letter.add("VIII");
        letter.add("IX");
        letter.add("X");
    }

    public static String toRoman(int number) {
        int a = map.floorKey(number);//
        if (number == a) {
            return map.get(number);//
        }
        return map.get(a) + toRoman(number-a);//рекурсия
    }

     public static int toNumber(String number) {
        return letter.indexOf(number);
     }
}
