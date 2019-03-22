package cn.tedu.practices;
/*
 * Abc/file.txt ---> txt
 */
import java.util.Scanner;

public class PracticesDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chs = str.toCharArray();
		//找出.所在的索引
		int i = str.indexOf('.');
		//输出.后面的字符串 也就是文件的扩展名
		String str1 = new String(chs,i+1,str.length()-i-1);
		System.out.println(str1);
	}

}
