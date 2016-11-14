package ex;
import java.util.Scanner;

/*
 * 請寫一個程式，讓使用者輸入一個整數二維陣列，
 * 建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，
 * 並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n[][] = {{96,90,85,78,92,67},
							{96,90,85,78,92,67},
							{96,90,85,78,92,67}};
		System.out.println("變異數"+Var2(n));
		System.out.println("標準差"+Std2(n));
	}
	
	public static float Var2(int a[][]){
		float out = 0;
		for(int i = 0 ; i<a.length;i++){ //Row
			for(int j = 0 ; j<a[i].length;j++){ //Row1
				out += Math.pow(a[i][j]-PinGin2(a), 2);
			}			
		}
		out /= CountNum(a);
		return out;
	}
	
	public static float Std2(int a[][]){
		float out = 0;
		out = (float) Math.sqrt(Var2(a));
		return out;
	}
	
	public static float PinGin2 (int a[][]){
		float sum = 0 ;		
		for(int i = 0 ;i<a.length;i++){ //總值
			for(int j = 0 ;j<a[i].length;j++){ //總值
				sum+=a[i][j];
			}
		}		
		sum /= CountNum(a);//平均數
		return sum;
	}
	public static int CountNum(int a[][]){//取二維陣列全部個數
		int numCount = 0;
		for(int i = 0 ;i<a.length;i++){
			numCount += a[i].length;
		}
		return numCount;
	}
}
