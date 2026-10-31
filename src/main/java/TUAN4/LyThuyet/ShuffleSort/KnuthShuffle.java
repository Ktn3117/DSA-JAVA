package TUAN4.LyThuyet.ShuffleSort;

import java.util.Random;
import java.util.Arrays;

public class KnuthShuffle {
    public static void shuffle(Object[] a) {
        int N = a.length;
        Random random = new Random();
        for (int i = 0; i < N; i++) { // Cũng có thể ngược: for(int i = N - 1; i > 0; i--)
            int r = random.nextInt(i + 1);// r sinh gtri từ 0 -> i
            exch(a, i, r);
        }
    }
    private static void exch(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        String[] a = {"A", "B", "C", "D", "E"};
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
/*
-----> Thời gian xáo trộn là O(N)
-----> Cũng có thể gọi KnuthShuffle là Fisher–Yates Shuffle
 */
