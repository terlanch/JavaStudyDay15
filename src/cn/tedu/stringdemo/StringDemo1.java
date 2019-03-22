package cn.tedu.stringdemo;

import java.io.UnsupportedEncodingException;

public class StringDemo1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "中国";
		//转换为字节数组
		//默认使用的是当前工程的编码方式
		//GBK 一个汉字占两个字节
		//utf-8 一个汉字占三个字节   （“编码方式”）
		byte [] bs = str.getBytes("utf-8");
		System.out.println(bs.length);
		
		//将字节数组转换为字符串
		//new String(byte[] byte)默认使用是当前工程的编码方式
		String str1 = new String(bs,"utf-8");
		System.out.println(str1);
		String str2 = new String(bs,3,3,"utf-8");
		System.out.println(str2);
		
		
		
		
//		System.out.println(str.equalsIgnoreCase("ABC"));//true  忽略大小写
//		System.out.println(str.hashCode());//96354 字符串的哈希码值是固定的  因为要保证字符串是被共享的
//		//将字符串转换为大写
//		System.out.println(str.toUpperCase());
//		//将字符串转换为小写
//		System.out.println(str.toLowerCase());
	}
}
