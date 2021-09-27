package S201840278;

import java.io.IOException;

public class MonsterTeam {
    // change monster amount
    public static int num = 256;
    private static MonsterTeam mt = new MonsterTeam();
    private static Monster[] mteam = new Monster[num];
    static {
        try {
            ReadPic r = new ReadPic();
            for(int i = 0; i<num; i++) {
                int _r = r.getRGB(i)[0];
                int _g = r.getRGB(i)[1];
                int _b = r.getRGB(i)[2];
                mteam[i] = new Monster(_r,_g,_b,i+1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private MonsterTeam() {

    }
    public static MonsterTeam accessMonsterTeam() {
        return mt;
    }
    public Monster getMonster(int i) {
        return mteam[i];
    }
}
