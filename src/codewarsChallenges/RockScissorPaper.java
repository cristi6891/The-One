package codewarsChallenges;

public class RockScissorPaper {

    public static void main(String[] args) {
        System.out.println(rps("paper", "paper"));

    }

    public static String rps(String p1, String p2) {

        StringBuilder outputString = new StringBuilder();


        switch (p1) {
            case "scissors":
                if (p2.equals("paper")) {
                    outputString.append("Player 1 won!");
                } else if (p2.equals("rock")) {
                    outputString.append("Player 2 won!");
                }
                break;

            case "paper":
                if (p2.equals("rock")) {
                    outputString.append("Player 1 won!");
                } else if (p2.equals("scissors")) {
                    outputString.append("Player 2 won!");
                }
                break;

            case "rock":
                if (p2.equals("scissors")) {
                    outputString.append("Player 1 won!");
                } else if (p2.equals("paper")) {
                    outputString.append("Player 2 won!");
                }
                break;

        }
        if (p1.equals(p2)) {
            outputString.append("Draw!");
        }

        return String.valueOf(outputString);

    }


}
