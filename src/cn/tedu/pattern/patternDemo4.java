package cn.tedu.pattern;

public class patternDemo4 {
	public static void main(String[] args) {
		//������ �ã��������������Ǿͳ�֮Ϊ������
		//������Զ�����������б��
		//����������ݿ�����Ϊ��һ���ַ�
		//Ŀǰֻ��һ�������飬���Ա�ž���1
		// \\n�ʹ����Ǳ��Ϊn�Ĳ�����
		String str = "AbAb";
		//System.out.println(str.matches(".*(dhiuwqh)+.*\\1.*"));
		
		//������ı��˳�����д����ҵģ�����ʱ��������
		//ֻ��ע������
		System.out.println(str.matches("(.)\\1(.)\\2"));
		System.out.println(str.matches("(..)\\1"));
	}
}
