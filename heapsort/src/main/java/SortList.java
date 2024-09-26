public abstract class SortList<E extends Comparable<E>> {

    protected E[] list;

    public SortList(E[] list) {
        this.list = list;

    }

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i < list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public abstract void sort();
}
