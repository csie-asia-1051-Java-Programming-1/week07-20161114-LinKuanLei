package hw;

import java.util.Scanner;

/*
 * 寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。例如:輸入 1234 回傳 4321
 * Date: 2016/11/14
 * Author: 103051089 林冠磊
 */
public class hw05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String str = String.valueOf(a);
		System.out.println(Restore(str));
	}

	static String Restore(String str){		
		if(str.equals("")){
	      return "";
	     }
	     else{	    	 
	      return Restore(str.substring(1))+str.substring(0,1);
	     }
	    }
}
