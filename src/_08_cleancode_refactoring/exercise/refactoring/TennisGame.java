package _08_cleancode_refactoring.exercise.refactoring;

public class TennisGame {
    public static final int ADVANTAGEP1 = 1;
    public static final int ADVANTAGEP2 = -1;
    public static final int WINCONDITION = 2;

    public static String getScore(String player1Name, String player2Name, int player1Scores, int player2Scores) {
        String score = "";
        int tempScore = 0;

        if (player1Scores == player2Scores) {
            score = check1(player1Scores);
        } else if (player1Scores >= 4 || player2Scores >= 4) {
            score = check2(player1Scores, player2Scores);
        } else {
            score = check3(player1Scores, player2Scores, tempScore);
        }
        return score;
    }

    public static String check1(int player1Scores) {
        String score = "";
        switch (player1Scores) {

            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String check2(int player1Scores, int player2Scores) {
        String score = "";
        int minusResult = player1Scores - player2Scores;
        if (minusResult == ADVANTAGEP1) score = "Advantage player1";
        else if (minusResult == ADVANTAGEP2) score = "Advantage player2";
        else if (minusResult >= WINCONDITION) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String check3(int player1Scores, int player2Scores, int tempScore) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Scores;
            else {
                score += "-";
                tempScore = player2Scores;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
