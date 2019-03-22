package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * 输入一个字符串和一个子串，输出子串在字符串中出现的的所有的位置
 */
public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str2.length() > str1.length()){
			return;
		}
		for(int i =0 ;i<str1.length();i++){
			i = str1.indexOf(str2,i);
			if(i != -1){
				
				System.out.println(i);
					
			}else{
				System.out.println("找不到了");
				return;
			}
		}
				
	}
}
