package S201840278;

public class InsertSorter implements Sorter {
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        for(int i=0;i<a.length;i++) {
            for(int j=i;j>0;j--) {
                if(a[j]<a[j-1]) {
                    swap(j,j-1);
                }else break;
            }
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
