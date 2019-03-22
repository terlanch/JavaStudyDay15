package cn.tedu.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "grtffewf";
		//.indexOf()获取字符在字符串首次出现的位置
		//如果字符串中没有对应的字符，那么就返回-1
//		System.out.println(str.indexOf('f'));
//		System.out.println(str.indexOf("str"));
		//从参数2 位置开始向后寻找参数1 首次出现的位置
		System.out.println(str.indexOf("gtr",5));
	}
}
