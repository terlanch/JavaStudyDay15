package cn.tedu.pattern;
/*
 * ������ʽ������ָ���ַ����Ĺ���
 * pattern�� ��һ�������� ���ܱ��̳�
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {
	public static void main(String[] args) {
//		// ƥ��һ���ַ��� ֵ��abc
//		String str = "";
//		//ָ��������ʽ�Ĺ���
//		Pattern p = Pattern.compile("abc");
//		//����Ҫƥ����ַ�����������ʽ���й���
//		Matcher m = p.matcher(str);
//		//ƥ������ɹ�����true ���򷵻�false
//		System.out.println(m.matches());
		
		
		//ƥ��һ���ַ���  Ҫ���������ַ�
		//��һ���ַ���xyz�е�һ��
		//�ڶ����ַ���7856�е�һ��
		//�������ַ���iop�е�һ��
//		String str = "y8i";
//		//����������ʽ
//		Pattern p = Pattern.compile("[xyz][7856][iop]");
//		//����
//		Matcher m = p.matcher(str);
//		//ƥ��
//		System.out.println(m.matches());
		
		
		//�򻯰�����
//		String str = "x7i";
//		System.out.println(str.matches("[xyz][7856][iop]"));
		
		
		//����ƥ�����е�Сд��ĸ
//		System.out.println(str.matches("[a-z]"));
		//����ƥ�����еĴ�д��ĸ
//		System.out.println(str.matches("[A-Z]"));
		//����ƥ��һ����ĸ
//		System.out.println(str.matches("[a-zA-Z]"));
		//����ƥ��һ������
//		System.out.println(str.matches("[0-9]"));
		//Сд��ĸ h-n
//		System.out.println(str.matches("[h-n]"));
		
		
		//ƥ��һ���ַ����ַ�����Ҫ���ǲ�����abc
	    String str = "";
//		System.out.println(str.matches("[^abc]"));
		
		//ƥ�������ַ����ַ�����Ҫ��
		//�����ֿ�ͷ������ĸ��β
	    //.ͨ���  ����������е��ַ�
	    //\d��������ʽ��ת���ַ� java��û��
	    //\\d java���Ƚ�\\dת��Ϊ\d��������ʽ�ٽ�\dת��Ϊ0-9
		//System.out.println(str.matches("\\d.[a-zA-Z]"));
		
		//[i-x]
//		System.out.println(str.matches("[h-x]&&[i-z]"));
	    
	    //����:ƥ�� .
	    
	    String s = ".";
//	    // \\.
//	    System.out.println(s.matches("\\."));
	    
	   
	    //���� ƥ��\ --->  \\\\
	    //System.out.println(s.matches("\\\\"));
		
		
		
		
		
		
		
		
		
		
		
	}
}
