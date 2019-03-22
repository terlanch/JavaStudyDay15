package cn.tedu.pattern;
/*
 * 正则表达式：用于指定字符串的规则
 * pattern类 是一个最终类 不能被继承
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {
	public static void main(String[] args) {
//		// 匹配一个字符串 值是abc
//		String str = "";
//		//指定正则表达式的规则
//		Pattern p = Pattern.compile("abc");
//		//将需要匹配的字符串和正则表达式进行关联
//		Matcher m = p.matcher(str);
//		//匹配如果成功返回true 否则返回false
//		System.out.println(m.matches());
		
		
		//匹配一个字符串  要求：有三个字符
		//第一个字符是xyz中的一个
		//第二个字符是7856中的一个
		//第三个字符是iop中的一个
//		String str = "y8i";
//		//定义正则表达式
//		Pattern p = Pattern.compile("[xyz][7856][iop]");
//		//关联
//		Matcher m = p.matcher(str);
//		//匹配
//		System.out.println(m.matches());
		
		
		//简化版正则
//		String str = "x7i";
//		System.out.println(str.matches("[xyz][7856][iop]"));
		
		
		//需求：匹配所有的小写字母
//		System.out.println(str.matches("[a-z]"));
		//需求：匹配所有的大写字母
//		System.out.println(str.matches("[A-Z]"));
		//需求：匹配一个字母
//		System.out.println(str.matches("[a-zA-Z]"));
		//需求：匹配一个数字
//		System.out.println(str.matches("[0-9]"));
		//小写字母 h-n
//		System.out.println(str.matches("[h-n]"));
		
		
		//匹配一个字符的字符串，要求是不能有abc
	    String str = "";
//		System.out.println(str.matches("[^abc]"));
		
		//匹配三个字符的字符串，要求
		//以数字开头，以字母结尾
	    //.通配符  代表的是所有的字符
	    //\d是正则表达式的转义字符 java中没有
	    //\\d java首先将\\d转换为\d，正则表达式再将\d转换为0-9
		//System.out.println(str.matches("\\d.[a-zA-Z]"));
		
		//[i-x]
//		System.out.println(str.matches("[h-x]&&[i-z]"));
	    
	    //需求:匹配 .
	    
	    String s = ".";
//	    // \\.
//	    System.out.println(s.matches("\\."));
	    
	   
	    //需求： 匹配\ --->  \\\\
	    //System.out.println(s.matches("\\\\"));
		
		
		
		
		
		
		
		
		
		
		
	}
}
