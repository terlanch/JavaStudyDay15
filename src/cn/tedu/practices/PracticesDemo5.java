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
		//�ҳ�.���ڵ�����
		int i = str.indexOf('.');
		//���.������ַ��� Ҳ�����ļ�����չ��
		String str1 = new String(chs,i+1,str.length()-i-1);
		System.out.println(str1);
	}

}
