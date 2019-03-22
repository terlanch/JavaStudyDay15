package cn.tedu.pattern;

public class patternDemo4 {
	public static void main(String[] args) {
		//捕获组 用（）括起来的我们就称之为捕获组
		//正则会自动给捕获组进行编号
		//捕获组的内容可以认为是一个字符
		//目前只有一个捕获组，所以编号就是1
		// \\n就代表是标号为n的捕获组
		String str = "AbAb";
		//System.out.println(str.matches(".*(dhiuwqh)+.*\\1.*"));
		
		//捕获组的编号顺序是有从左到右的（出现时间来决定
		//只关注左括号
		System.out.println(str.matches("(.)\\1(.)\\2"));
		System.out.println(str.matches("(..)\\1"));
	}
}
