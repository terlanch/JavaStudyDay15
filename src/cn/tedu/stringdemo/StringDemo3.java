package cn.tedu.stringdemo;

public class StringDemo3 {
	public static void main(String[] args) {
		//��ȡ�ַ�����������
		String str = "abcdefgdh";
		
//		String str1 = new String("abc");
//		System.out.println(str == str1.intern());
		
		//�ж��ַ����Ƿ�Ϊ��
//		System.out.println(str.isEmpty());
		
		//���ַ���β����ǰ���ַ���һ�γ��ֵ�λ��
//		System.out.println(str.lastIndexOf("d"));//7
		//�Ӳ���2λ�ÿ�ʼ��ǰѰ���ַ���һ�γ��ֵ�λ��
//		System.out.println(str.lastIndexOf("d",3));//3
		
		//�滻���ַ�Ϊ���ַ�
//		System.out.println(str.replace('d', '+'));
		
		//�Ӳ���1����λ�ý�ȡ���ַ�������2λ��
//		System.out.println(str.substring(3, 6));
		
		//ȥ���ַ������˵Ŀո�
//		String str1 = "    des     de  sd";
//		System.out.println(str1.trim());
		
		//����Ĳ�������ת��ΪString����
		System.out.println(String.valueOf(3));
		
	}

}
