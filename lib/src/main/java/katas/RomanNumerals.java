package katas;

public class RomanNumerals {
    public String convert(int arabic) {
        return repeatI(arabic)
            .replace("IIIII", "V")
            .replace("IIII", "IV")
            .replace("VV", "X")
            .replace("VIV", "IX")
            .replace("XXXXX", "L")
            .replace("XXXX", "XL")
            .replace("LXL", "XC")
            .replace("LL", "C")
            .replace("CCCCC", "D")
            .replace("CCCC", "CD")
            .replace("DD", "M")
            .replace("DCD", "CM");
    }

    private String repeatI(int times) {
        StringBuilder builder = new StringBuilder();
        for(int counter = 0; counter < times; counter++)
            builder.append("I");
        return builder.toString();
    }
}
