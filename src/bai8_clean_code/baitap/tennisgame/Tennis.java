package bai8_clean_code.baitap.tennisgame;

public class Tennis {
    public static String getScore(String player1Name, String player2Name, int scorePlay1, int scorePlay2) {
        String result = "";
        int tempScore=0;
        if (scorePlay1==scorePlay2)
        {
            result = getDraw(scorePlay1);
        }
        else if (scorePlay1>=4 || scorePlay2>=4)
        {
            result = getWin(scorePlay1, scorePlay2);
        }
        else
        {
            result = getTempScose(scorePlay1, scorePlay2, result);
        }
        return result;
    }

    private static String getTempScose(int scorePlay1, int scorePlay2, String result) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = scorePlay1;
            else { result+="-"; tempScore = scorePlay2;}
            switch(tempScore)
            {
                case 0:
                    result+="Love";
                    break;
                case 1:
                    result+="Fifteen";
                    break;
                case 2:
                    result+="Thirty";
                    break;
                case 3:
                    result+="Forty";
                    break;
            }
        }
        return result;
    }

    private static String getWin(int scorePlay1, int scorePaly2) {
        String result;
        int minusResult = scorePlay1-scorePaly2;
        if (minusResult==1) result ="Advantage player1";
        else if (minusResult ==-1) result ="Advantage player2";
        else if (minusResult>=2) result = "Win for player1";
        else result ="Win for player2";
        return result;
    }

    private static String getDraw(int scorePlay1) {
        String result;
        switch (scorePlay1)
        {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }
}
