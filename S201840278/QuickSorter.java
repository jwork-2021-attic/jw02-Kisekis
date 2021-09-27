package S201840278;

public class QuickSorter implements Sorter {
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        quickSort(a, 0, a.length-1);
    }

    public void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(a, lo, hi);
            quickSort(a, lo, pivot - 1);
            quickSort(a, pivot + 1, hi);
        }
    }

    public int partition(int[] a, int lo, int hi) {
        int x = a[lo];
        int j = hi + 1;

        for (int i = hi; i > lo; i--) {
            if (a[i] >= x) {
                j--;
                swap(a, i, j);
            }
        }
        swap(a, lo, j - 1);
        return j - 1;
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
