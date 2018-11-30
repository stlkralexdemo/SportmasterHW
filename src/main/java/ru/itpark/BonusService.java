package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int totalAmount) {

        int result;
        int goldCardMin = 150_001;
        int silverCardMin = 15_001;
        int blueCardMin = 1;
        int goldPointMultiplier = 100;
        int silverPointMultiplier = 70;
        int bluePointMultiplier = 50;
        int minCost = 1000;

        if (totalAmount >= goldCardMin) {
            return result = purchaseAmount * goldPointMultiplier / minCost;
        }
        if (totalAmount >= silverCardMin) {
            return result = purchaseAmount * silverPointMultiplier / minCost;
        }
        if (totalAmount >= blueCardMin) {
            return result = purchaseAmount * bluePointMultiplier / minCost;
        } else {
            return result = 0;
        }
    }
}

