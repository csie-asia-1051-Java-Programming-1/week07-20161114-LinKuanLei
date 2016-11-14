package ex;

import java.util.Scanner;

/*
 * 承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入的一維整數陣列之後，
 * 呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，
 * 必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class ex02_103051089 {

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
		System.out.println("變異數"+Var(n));
		System.out.println("標準差"+Std(n));
		}
		public static float Var (int a[]){
			float out = 0;
			for(int i = 0 ; i<a.length;i++){
				out += (float)Math.pow(a[i]-PinGin(a),2);
			}
			out /= a.length;
			return out;
		}
		public static float Std(int a[]){
			float out=0;
			out = (float)Math.sqrt(Var(a));
			return out;
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
