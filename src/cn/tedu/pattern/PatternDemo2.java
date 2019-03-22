package cn.tedu.pattern;
/*
 * + 前面的字符至少出现一次
 * * 可有可无
 * ？ 最多出现一次
 */
public class PatternDemo2 {
	public static void main(String[] args) {
		//正则表达式中的数量词
		//需求 ： 字符串满足格式：ab abb abbbb abbbbb...
		String str = "";
		// +  代表前面的字符>=1
		System.out.println(str.matches("ab+"));
		
		//需求：字符串中以数字开头，以数字结尾
		//*代表前面的字符是可有可无的
		//* >= 0;
		//.*表示内容可有可无，而且是任意字符
		System.out.println(str.matches("\\d.*\\d"));
		
		
		//需求：字符串以数字组成，不能多于两个数字
		//? 代表 <= 1;
		System.out.println(str.matches("\\d\\d?"));
		
	}
}
