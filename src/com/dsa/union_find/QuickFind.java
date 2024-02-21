package com.dsa.union_find;

import java.util.Arrays;

public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {

        int p1 = id[p];
        int q1 = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == p1) {
                id[i] = q1;
            }
        }
    }

    @Override
    public String toString() {
        return "QuickFind{" +
                "id=" + Arrays.toString(id) +
                '}';
    }


    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);
        qf.union(4, 3);
        qf.union(3, 8);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);
        qf.union(8, 9);
        System.out.println(qf.connected(5, 0));
        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);
        System.out.println(qf.toString());
    }

}

