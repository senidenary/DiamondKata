package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
    private final static char FIRST_CHAR = 'A';

    private final char middleLetter;

    public Diamond(char middleLetter) {
        this.middleLetter = middleLetter;
    }

    public List<List<Character>> getRows() {
        ArrayList<List<Character>> rows = new ArrayList<List<Character>>();
        ArrayList<Character> row = new ArrayList<Character>();
        row.add(FIRST_CHAR);
        rows.add(row);
        return rows;
    }

    public static String print(char middleLetter) {
        Diamond diamond = new Diamond(middleLetter);
        StringBuffer result = new StringBuffer();
        for (List<Character> chars : diamond.getRows()) {
            for (Character c : chars) {
                result.append(c);
            }
            //result.append("\n");
        }
        return result.toString();
    }



    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(Diamond.print(args[0].charAt(0)));
        } else {
            System.out.println("please supply one argument: the char of the diamond middle");
        }

    }

}

