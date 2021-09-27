package S201840278;

import java.util.Random;

public class MyRandom {
    static int[] r = new int[MonsterTeam.num];
    static {
        for (int i = 0; i < MonsterTeam.num; i++) {
            r[i] = i;
        }
    }

    MyRandom() {
        Random rand = new Random();
        int temp = 0;
        for (int i = 0; i < MonsterTeam.num; i++) {
            int rand01 = rand.nextInt(MonsterTeam.num);
            int rand02 = rand.nextInt(MonsterTeam.num);
            temp = r[rand01];
            r[rand01] = r[rand02];
            r[rand02] = temp;
        }
    }

    public int getRand(int i) {
        return r[i];
    }
}