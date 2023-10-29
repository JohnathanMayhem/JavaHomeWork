package edu.hw3;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {

    private final int zero = 0;
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;
    private final int ten = 10;

    private ArrayList<HashMap<Integer, String>> digits;

    public Task4() {
        digits = new ArrayList<>();
        HashMap<Integer, String> num = new HashMap<>();
        num.put(zero, "");
        num.put(one, "I");
        num.put(two, "II");
        num.put(three, "III");
        num.put(four, "VI");
        num.put(five, "V");
        num.put(six, "IV");
        num.put(seven, "IIV");
        num.put(eight, "IIIV");
        num.put(nine, "XI");
        this.digits.add(num);
        num = new HashMap<>();
        num.put(zero, "");
        num.put(one, "X");
        num.put(two, "XX");
        num.put(three, "XXX");
        num.put(four, "LX");
        num.put(five, "L");
        num.put(six, "XL");
        num.put(seven, "XXL");
        num.put(eight, "XXXL");
        num.put(nine, "CX");
        this.digits.add(num);
        num = new HashMap<>();
        num.put(zero, "");
        num.put(one, "C");
        num.put(two, "CC");
        num.put(three, "CCC");
        num.put(four, "DC");
        num.put(five, "D");
        num.put(six, "CD");
        num.put(seven, "CCD");
        num.put(eight, "CCCD");
        num.put(nine, "MC");
        this.digits.add(num);
        num = new HashMap<>();
        num.put(zero, "");
        num.put(one, "M");
        num.put(two, "MM");
        num.put(three, "MMM");
        num.put(four, "VM");
        this.digits.add(num);
    }

    public String convertToRoman(int num) {
        int numCopy = num;
        int ind = zero;
        StringBuilder stringBuilder = new StringBuilder();
        while (numCopy != 0) {
            if (numCopy % ten != 0) {
                stringBuilder.append(digits.get(ind).get(numCopy % ten));
            }
            ++ind;
            numCopy /= ten;
        }
        return stringBuilder.reverse().toString();
    }
}
