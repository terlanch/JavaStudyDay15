package cn.tedu.pattern;

import java.util.Arrays;

public class patternDemo5 {
	public static void main(String[] args) {
//		String str = "ferR654t_+&*(g54";
//		System.out.println(str.replaceAll("\\d", "+"));
//		//���ַ����е�������ȡ����
//		System.out.println(str.replaceAll("\\D", ""));
//		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		
		//�������ֶ��ַ������зָ�
		//.split����ָ�������ʲô��û��
		//����ָ������ǰ�棬��ô����ǰ��ָ������
		//�ָ�����ַ���ǰ�棬��ôÿ��Ӧһ���ͻ�ָ�һ������
		//�ָ�����м䣬����в�ֹһ������ô�ͻᳬ����ÿһ�������һ������
		String str = "dasd4dsad7dadw5d";
		String[] strs = str.split("[a-z]");
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));
		
		
		
	}

}

