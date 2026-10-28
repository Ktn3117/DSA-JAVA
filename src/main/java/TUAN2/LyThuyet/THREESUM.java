// Tổng bằng 0 của 3 phần tử
package TUAN2.LyThuyet;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
class Hamchuan {
    int[] a;
    public Hamchuan(){
    }
    public int ThoaMan(int n){
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                long sum = (long) a[i] + a[left] + a[right];
                if(sum == 0){
                    count++;
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }return count;
    }
}
public class THREESUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu n: ");
        int n = sc.nextInt();
        Hamchuan hc = new Hamchuan();
        hc.a = new int[n];
        //Nhập phần tử mảng
        System.out.print("Nhap so phan tu cua mang la: ");
        for(int i = 0; i < n; i++){
            hc.a[i] = sc.nextInt();
        }
        int ketQua = hc.ThoaMan(n);
        System.out.println("So bo 3 tong = 0 la: " + ketQua);
        sc.close();
    }
}
