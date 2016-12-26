package ex;
import java.util.Scanner;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 105021062 鄭雅韵
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char[] chars=new char[999]; 
		String str1="";
		String ans1="/"; 
		chars=str1.toCharArray(); 
		for(int i=0;i< chars.length ;i++){ 
		ans1+= (int) chars[i] +"/"; 
		System.out.println(ans1);

	}

	}
}

