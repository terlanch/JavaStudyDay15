package cn.tedu.pattern;
/*
 * + ǰ����ַ����ٳ���һ��
 * * ���п���
 * �� ������һ��
 */
public class PatternDemo2 {
	public static void main(String[] args) {
		//������ʽ�е�������
		//���� �� �ַ��������ʽ��ab abb abbbb abbbbb...
		String str = "";
		// +  ����ǰ����ַ�>=1
		System.out.println(str.matches("ab+"));
		
		//�����ַ����������ֿ�ͷ�������ֽ�β
		//*����ǰ����ַ��ǿ��п��޵�
		//* >= 0;
		//.*��ʾ���ݿ��п��ޣ������������ַ�
		System.out.println(str.matches("\\d.*\\d"));
		
		
		//�����ַ�����������ɣ����ܶ�����������
		//? ���� <= 1;
		System.out.println(str.matches("\\d\\d?"));
		
	}
}
