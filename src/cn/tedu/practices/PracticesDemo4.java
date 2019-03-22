package cn.tedu.practices;
/*
 * They are students   --->Thy r stdnts 
 * aeiou        
 */
import java.util.Scanner;

public class PracticesDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		//遍历str2
		for(int i = 0;i< str2.length();i++){
			//取出str2中的每个字符
			char c = str2.charAt(i);
			//将char类型转为String类型
			String c1 = String.valueOf(c);
			//用“”替换str1中的str2的每个字符
			str1 = str1.replace(c1,"");
			
			
		}
		System.out.println(str1);
	}
}
