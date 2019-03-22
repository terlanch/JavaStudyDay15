package cn.tedu.pattern;

public class PatternDemo3 {
	public static void main(String[] args) {
		//需求：匹配由5个数字组成的字符串
		//{n}: 代表字符只能出现n次
		String str = "484862";
		System.out.println(str.matches("\\d{5}"));
		
		//需求：匹配至少由5个数字组成的字符串
		//{n,}
		System.out.println(str.matches("\\d{5,}"));
		
		//需求：匹配
		//{n,m}  最少出现n次最多出现m次
		System.out.println(str.matches("\\d{5,10}"));
	}

}
