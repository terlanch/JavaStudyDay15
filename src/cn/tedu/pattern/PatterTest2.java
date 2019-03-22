package cn.tedu.pattern;
/*
 * �ж�һ�������Ƿ���Ϲ淶��
 * ������8-12λ��ɣ���д��ĸ��Сд��ĸ������
 * ���ո�����Ҫ��������
 */

import java.util.Scanner;

public class PatterTest2 {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		
		checkPassword(str);	
		
			
	}
	public static boolean checkPassword(String password){
		//�ж��ַ��Ƿ�������볤��Ҫ��
		if(!password.matches("[A-Za-z\\d ]{8,12}")){
			return false;
		}
		//����һ����������¼ÿһ�ֳ��ֵĴ�������������������ڵ���2������Ҫ��
		int count = 0;
		
		//�ж��Ƿ���Сд��ĸ
		if(password.matches(".*[a-z].*")){
			count++;
		}
		//�ж��Ƿ��д�д��ĸ
		if(password.matches(".*[A-Z].*")){
			count++;
		}
		//�ж��Ƿ�������
		if(password.matches(".*[0-9].*")){
			count++;
		}
		//�ж��Ƿ��пո�
		if(password.matches(".* .*")){
			count++;
		}
		return count >= 2;
	}

}
