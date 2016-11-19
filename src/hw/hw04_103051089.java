package hw;

import java.util.Scanner;

/*
 * 寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class hw04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println(Gcd(a,b));
	}
	static float Gcd(float x, float y){		
		if(x%y==0){
			return y;
		}else{
			return Gcd(y , x % y );
		}		
	}
}
