package hw;

import java.util.Scanner;

/*
 * 以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Ofdigits(n,0));
	}
	public static int Ofdigits (int a,int b){
		if(a!=0){
			b++;
			return Ofdigits(a/10,b); 
		}else {
			return b;
		}
	}
}
