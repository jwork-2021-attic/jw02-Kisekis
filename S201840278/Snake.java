package S201840278;

public class Snake {

    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Shape shape) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Shapable[] shapables = shape.toArray();
        int[] ranks = new int[shapables.length];

        for (int i = 0; i < shapables.length; i++) {
            ranks[i] = shapables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step);
            System.out.println(shape.toString());
            log += shape.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step) {
        String[] couple = step.split("<->");
        MonsterTeam gt = MonsterTeam.accessMonsterTeam();
        gt.getMonster(Integer.parseInt(couple[0])-1)
                .swapPosition(gt.getMonster(Integer.parseInt(couple[1])-1));
    }

}
