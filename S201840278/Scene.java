package S201840278;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Scene {

    public static void main(String[] args) throws IOException {
        //new Matrix or Line
    Shape shape = new Matrix(MonsterTeam.num);
    MyRandom rand = new MyRandom();
    MonsterTeam gt = MonsterTeam.accessMonsterTeam();
    for(int i = 0; i < MonsterTeam.num; i++) {
        shape.put(gt.getMonster(i),rand.getRand(i));
    }


    Snake theSnake = Snake.getTheSnake();
    // new QuickSorter, SelectionSorter or BubbleSorter
    Sorter sorter = new QuickSorter();

    theSnake.setSorter(sorter);

    String log = theSnake.lineUp(shape);

    BufferedWriter writer;
    writer=new BufferedWriter(new FileWriter("result.txt"));
    writer.write(log);
    writer.flush();
    writer.close();

}

}
