package cn.tedu.stringdemo;

import java.io.UnsupportedEncodingException;

public class StringDemo1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�й�";
		//ת��Ϊ�ֽ�����
		//Ĭ��ʹ�õ��ǵ�ǰ���̵ı��뷽ʽ
		//GBK һ������ռ�����ֽ�
		//utf-8 һ������ռ�����ֽ�   �������뷽ʽ����
		byte [] bs = str.getBytes("utf-8");
		System.out.println(bs.length);
		
		//���ֽ�����ת��Ϊ�ַ���
		//new String(byte[] byte)Ĭ��ʹ���ǵ�ǰ���̵ı��뷽ʽ
		String str1 = new String(bs,"utf-8");
		System.out.println(str1);
		String str2 = new String(bs,3,3,"utf-8");
		System.out.println(str2);
		
		
		
		
//		System.out.println(str.equalsIgnoreCase("ABC"));//true  ���Դ�Сд
//		System.out.println(str.hashCode());//96354 �ַ����Ĺ�ϣ��ֵ�ǹ̶���  ��ΪҪ��֤�ַ����Ǳ������
//		//���ַ���ת��Ϊ��д
//		System.out.println(str.toUpperCase());
//		//���ַ���ת��ΪСд
//		System.out.println(str.toLowerCase());
	}
}
