package programmers.level1.붕대감기;

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxSec = Integer.MIN_VALUE;

        for (int[] attack : attacks) {
            maxSec = Math.max(attack[0], maxSec);
        }
        int maxHealth = health;

        int consecutive = 0;
        int attackIdx = 0;
        for (int i = 1; i <= maxSec; i++) {

            if (i == attacks[attackIdx][0]) {
                consecutive = 0;
                health -= attacks[attackIdx][1];
                attackIdx++;
            } else {
                consecutive++;

                if (maxHealth <= health) continue;

                health += bandage[1];

                if (consecutive == bandage[0]) {
                    health += bandage[2];
                    consecutive = 0;
                }


                if (health > maxHealth)
                    health = maxHealth;
            }

            if (health <= 0) {
                return -1;
            }

        }


        return health;
    }
}
