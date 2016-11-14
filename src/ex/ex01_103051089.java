package ex;
/*
 * 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，
 * 透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;

public class ex01_103051089 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("要輸入幾個數?");
		int m = sc.nextInt();
		int n[] =new int[m];
		for(int i = 0 ; i<n.length;i++){
			System.out.print("第"+(i+1)+"個數");
			n[i] = sc.nextInt();
		}
		System.out.println(var(n));
	}
	public static float var (int a[]){
		float sum = 0;
		for(int i = 0 ; i<a.length;i++){
			sum += Math.pow(a[i]-PinGin(a),2);
		}
		sum/=a.length;
		return sum;
	}
	public static float PinGin (int a[]){
		float sum = 0;
		for(int i = 0 ;i<a.length;i++){ //總值
			sum+=a[i];
		}
		sum/=a.length;//平均數
		return sum;
	}
}
