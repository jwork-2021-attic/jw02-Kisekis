package S201840278;

public class Matrix extends Shape{
    public Matrix(int length) {
        this.positions = new Shape.Position[length];
    }

    @Override
    public String toString() {
        String lineString = "\t";
        int n = 0;
        for (Position p : positions) {
            lineString += p.shapable.toString();
            n++;
            if(n%16 == 0) {
                lineString += "\n\t";
            }
        }
        return lineString;
    }

}
