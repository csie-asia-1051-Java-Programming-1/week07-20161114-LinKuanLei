package hw;

import java.util.Scanner;

/*
 * 請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		System.out.println(Lcm(Lcm(x, y), z));		
	}
	public static float Lcm(float x,float y){
		return x * y / Gcd(x,y);
	}
	static float Gcd(float x, float y){		
		if(x%y==0){
			return y;
		}else{
			return Gcd(y , x % y );
		}		
	}
}
