package cn.tedu.pattern;

import java.util.Arrays;

public class patternDemo5 {
	public static void main(String[] args) {
//		String str = "ferR654t_+&*(g54";
//		System.out.println(str.replaceAll("\\d", "+"));
//		//把字符串中的数字提取出来
//		System.out.println(str.replaceAll("\\D", ""));
//		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		
		//按照数字对字符串进行分割
		//.split如果分割符在最后，什么都没有
		//如果分割符在最前面，那么会在前面分割出“”
		//分割符在字符串前面，那么每对应一个就会分割一个“”
		//分割符在中间，如果有不止一个，那么就会超出的每一个都会多一个“”
		String str = "dasd4dsad7dadw5d";
		String[] strs = str.split("[a-z]");
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));
		
		
		
	}

}

