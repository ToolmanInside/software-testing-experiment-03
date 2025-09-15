package cn.edu.swjtu;

public static int calculateScore(int baseScore, int rewardType)
{
    int tempScore = 0;
    int finalScore = 0;
    if (rewardType == 1) {
        tempScore = baseScore * 2;
    } else {
        tempScore = baseScore + 100;
    }
    if (tempScore > 50 && baseScore > 0) {
        finalScore = tempScore + 10;
    } else {
        finalScore = tempScore - 10;
    }
    return finalScore;
}

