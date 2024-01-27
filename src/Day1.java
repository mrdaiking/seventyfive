import jdk.jshell.EvalException;

public class Day1 {
    public String mergeAlternately1(String word1, String word2) {
//        String returnValue = "";
        StringBuilder returnValue = new StringBuilder(); // In Java, String objects in Java are immutable

        if (word1.length() >= 1 && word1.length() <= 100 && word2.length() >= 1 && word2.length() <= 100) { // Check input constraint
            int loopSize = Math.max(word1.length(), word2.length()); // Find the max length
            for (int i = 0; i <= loopSize; i++) {
                if (i < word1.length()) {
//                    returnValue.concat(String.valueOf(word1.charAt(i)));
                    returnValue.append(word1.charAt(i));
                }
                if (i < word2.length()) {
//                    returnValue.concat(String.valueOf(word2.charAt(i)));
                    returnValue.append(word2.charAt(i));
                }
            }
        }
//        return returnValue;
        return returnValue.toString();
    }

    public String mergeAlternately2(String word1, String word2) {
        if (word1.length() < 1 || word1.length() > 100 || word2.length() < 1 || word2.length() > 100) {
            throw new IllegalArgumentException("Input lengths must be between 1 and 100");
        }
        StringBuilder returnValue = new StringBuilder(); // In Java, String objects in Java are immutable
        int len1 = word1.length();
        int len2 = word2.length();
        int loopSize = Math.max(len1, len2); // Find the max length
        for (int i = 0; i <= loopSize; i++) {
            if (i < len1) {
                returnValue.append(word1.charAt(i));
            }
            if (i < len2) {
                returnValue.append(word2.charAt(i));
            }
        }
        return returnValue.toString();
    }
}
