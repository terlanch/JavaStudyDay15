package cn.tedu.pattern;

public class PatternDemo3 {
	public static void main(String[] args) {
		//����ƥ����5��������ɵ��ַ���
		//{n}: �����ַ�ֻ�ܳ���n��
		String str = "484862";
		System.out.println(str.matches("\\d{5}"));
		
		//����ƥ��������5��������ɵ��ַ���
		//{n,}
		System.out.println(str.matches("\\d{5,}"));
		
		//����ƥ��
		//{n,m}  ���ٳ���n��������m��
		System.out.println(str.matches("\\d{5,10}"));
	}

}
