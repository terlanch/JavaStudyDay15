package cn.tedu.stringdemo;
/*
 * ��ȡһ�������ַ���������������������֮ǰ������
 */
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		//���û�������ַ���ת��Ϊ�ֽ�����
		byte[] bs = str.getBytes("GBK");
		//���ж��ֽ����Ƿ����
		if (n < 0 || n > bs.length){
			return;
		}
		//�����û�������ֽڽ�ȡ����
		String str1 = new String(bs,0,n,"GBK");
		//��ȡstr1���һ���ַ�������
		int index = str1.length() - 1;
		//�ж�str1�����һ���ַ��Ƿ��ǰ���ַ�
		
		if(str1.charAt(index) != str.charAt(index)){
			str1 = new String(bs,0,n-1,"GBK");
		}
		System.out.println(str1);
	}

}
