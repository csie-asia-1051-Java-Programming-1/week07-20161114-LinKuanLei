package hw;

import java.util.Scanner;

/*
 * 輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println(C(a,b));
	}
	public static int C (int n,int m){//C(n,m)=C(n-1,m)+C(n-1,m-1)
		if(m>n){
			return 0;
		}else if (m==1) {
			return n;
		}else {
			return C(n-1,m)+C(n-1,m-1);
		}
	}	
}
