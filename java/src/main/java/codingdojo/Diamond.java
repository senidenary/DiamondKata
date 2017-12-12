package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
    private final static char FIRST_CHAR = 'A';

    private final char middleLetter;
    private final int halfSize;

    public Diamond(char middleLetter) {
        this.middleLetter = middleLetter;
        this.halfSize = middleLetter - FIRST_CHAR;
    }

    public List<List<Character>> getRows() {
        ArrayList<List<Character>> rows = new ArrayList<List<Character>>();
        ArrayList<Character> row = new ArrayList<Character>();
        row.add(FIRST_CHAR);
        rows.add(row);
        return rows;
    }

    public List<Character> getLetterSequence() {
        List<Character> letterSequence = new ArrayList<Character>();

        for (int i = 0; i <= halfSize; ++i) {
            letterSequence.add((char)(FIRST_CHAR + i));
        }
        for (int i = halfSize - 1; i >= 0; --i) {
            letterSequence.add((char)(FIRST_CHAR + i));
        }

        return letterSequence;
    }

    public List<Integer> getIndentationSequence() {
        List<Integer> indentationSequence = new ArrayList<Integer>();

        for (int i = halfSize; i > 0; --i) {
            indentationSequence.add(i);
        }
        for (int i = 0; i <= halfSize; ++i) {
            indentationSequence.add(i);
        }

        return indentationSequence;
    }

    public List<Integer> getBetweenSequence() {
        List<Integer> betweenSequence = new ArrayList<Integer>();

        for (int i = 0; i <= halfSize; ++i) {
            betweenSequence.add(Math.max(i * 2 - 1, 0));
        }
        for (int i = halfSize - 1; i >= 0; --i) {
            betweenSequence.add(Math.max(i * 2 - 1, 0));
        }

        return betweenSequence;
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

