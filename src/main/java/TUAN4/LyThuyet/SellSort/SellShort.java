package TUAN4.LyThuyet.SellSort;

// C1
public class SellShort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int[] gaps = {7, 3, 1};
        for (int h : gaps) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (a[j].compareTo(a[j - h]) < 0) {
                        Comparable temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}

// C2
class Sell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
# Dãy h nên chọn Knuth: 1,4,13,40,... --> h = 3h + 1 --> Phổ biến nhất
---> Với khoảng cách này trường hợp xấu nhất là O(N ^ 3/2). nhanh nhất là NlogN
# Dãy h cũng có thể chọn Sedgewick
--> Code:
for (int k = 0; k < 8; k++) {
    long h;

    if (k % 2 == 0) {
        h = 9 * (1L << k)
          - 9 * (1L << (k / 2)) + 1;
    } else {
        h = 8 * (1L << k)
          - 6 * (1L << ((k + 1) / 2)) + 1;
    }
    System.out.print(h + " ");
}
-----> Độ phức tạp xấu nhất là O(N ^ 4/3)
# Dãy shell gốc dùng N/2, N/4 -> chậm
 */
