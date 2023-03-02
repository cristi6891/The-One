package codewarsChallenges;

public class StringRepeat {

    public static void main(String[] args) {

        int n = 5;
        String s = "gu";
        String ss = "";

        for (int i = 0; i < n; i++) {
            ss +=s;
        }
        System.out.println(ss);
    }
}
