package cn.tedu.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "grtffewf";
		//.indexOf()��ȡ�ַ����ַ����״γ��ֵ�λ��
		//����ַ�����û�ж�Ӧ���ַ�����ô�ͷ���-1
//		System.out.println(str.indexOf('f'));
//		System.out.println(str.indexOf("str"));
		//�Ӳ���2 λ�ÿ�ʼ���Ѱ�Ҳ���1 �״γ��ֵ�λ��
		System.out.println(str.indexOf("gtr",5));
	}
}
