package ex;

import java.util.Scanner;

/*
 * 讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("n!="+Jchan(n));
	}
	public static int Jchan(int a){
		if(a==1){
			return 1;
		}else{
			return a*Jchan(a-1);
		}		
	}

}
