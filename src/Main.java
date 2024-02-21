import com.dsa.union_find.QuickFind;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        QuickFind qf = new QuickFind(10);
        qf.union(4,3);
        qf.union(3,8);
        qf.union(6,5);
        qf.union(9,4);
        qf.union(2,1);
        qf.union(8,9);
        System.out.println(qf.connected(5,0));
        qf.union(5,0);
        qf.union(7,2);
        qf.union(6,1);
        System.out.println(qf.toString());
    }
}