package S201840278;

public class Shape {

    protected Shape.Position[] positions;

    public void put(Shapable shapable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Shape.Position(null);
        }
        this.positions[i].setLinable(shapable);
    }

    public Shapable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].shapable;
        }
    }

    class Position {

        protected Shapable shapable;

        Position(Shapable shapable) {
            this.shapable = shapable;
        }

        public void setLinable(Shapable shapable) {
            this.shapable = shapable;
            shapable.setPosition(this);
        }

    }

    public String toString() {
        String lineString = "\t";
        for (Shape.Position p : positions) {
            lineString += p.shapable.toString();
        }
        return lineString;
    }

    public Shapable[] toArray() {
        Shapable[] shapables = new Shapable[this.positions.length];

        for (int i = 0; i < shapables.length; i++) {
            shapables[i] = positions[i].shapable;
        }

        return shapables;

    }
}
