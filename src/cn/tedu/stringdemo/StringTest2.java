package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * ����һ���ַ�����һ���Ӵ�������Ӵ����ַ����г��ֵĵ����е�λ��
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
				System.out.println("�Ҳ�����");
				return;
			}
		}
				
	}
}
