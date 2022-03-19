package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String s) {
        int digits = 0;
        for (Character character: s.toCharArray()) {
            if (Character.isDigit(character)) {
                digits++;
            }
        }
        return digits > s.length() / 2;
    }
}
