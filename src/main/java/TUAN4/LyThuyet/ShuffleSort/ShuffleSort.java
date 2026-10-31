package TUAN4.LyThuyet.ShuffleSort;

import java.util.Arrays;
import java.util.Comparator;

public class ShuffleSort {
    public static void shuffle(String[] a) {
        int N = a.length;
        Double[] random = new Double[N];
        Integer[] index = new Integer[N];
        // Gán số ngẫu nhiên
        for (int i = 0; i < N; i++) {
            random[i] = Math.random();
            index[i] = i;
        }

        // Sắp xếp vị trí theo số ngẫu nhiên
        Arrays.sort(index,Comparator.comparingDouble(i -> random[i]));
        /*
        - i -> random[i] : Mỗi chỉ số i, lấy random[i] làm chỉ số so sánh
        - Comparator.comparingDouble(): Tạo quy tắc so sánh tăng dần theo số đó
        - Arrays.sort(index,..): Sắp xếp lại mảng index
         */
        // Xáo trộn mảng
        String[] copy = a.clone(); // Sao chép mảng --> Giữ dữ liệu ban đầu
        for (int i = 0; i < N; i++) {
            a[i] = copy[index[i]];
        }
    }
    public static void main(String[] args) {
        String[] a = {"A", "B", "C", "D"};
        shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
