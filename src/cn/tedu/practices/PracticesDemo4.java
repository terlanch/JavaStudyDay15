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
		//����str2
		for(int i = 0;i< str2.length();i++){
			//ȡ��str2�е�ÿ���ַ�
			char c = str2.charAt(i);
			//��char����תΪString����
			String c1 = String.valueOf(c);
			//�á����滻str1�е�str2��ÿ���ַ�
			str1 = str1.replace(c1,"");
			
			
		}
		System.out.println(str1);
	}
}
