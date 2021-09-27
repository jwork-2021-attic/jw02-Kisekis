package S201840278;

public class Line extends Shape{
    public Line(int length) {
        this.positions = new Shape.Position[length];
    }

    @Override
    public String toString() {
        String lineString = "\t";
        for (Position p : positions) {
            lineString += p.shapable.toString();
        }
        return lineString;
    }

}
