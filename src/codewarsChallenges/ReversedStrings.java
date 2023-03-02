package codewarsChallenges;

public class ReversedStrings {

    public static String solution(String str) {

        // Your code here...
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
