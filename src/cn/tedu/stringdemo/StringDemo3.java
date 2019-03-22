package cn.tedu.stringdemo;

public class StringDemo3 {
	public static void main(String[] args) {
		//获取字符串的字面量
		String str = "abcdefgdh";
		
//		String str1 = new String("abc");
//		System.out.println(str == str1.intern());
		
		//判断字符串是否为空
//		System.out.println(str.isEmpty());
		
		//从字符串尾部往前找字符第一次出现的位置
//		System.out.println(str.lastIndexOf("d"));//7
		//从参数2位置开始向前寻找字符第一次出现的位置
//		System.out.println(str.lastIndexOf("d",3));//3
		
		//替换旧字符为新字符
//		System.out.println(str.replace('d', '+'));
		
		//从参数1索引位置截取到字符串参数2位置
//		System.out.println(str.substring(3, 6));
		
		//去掉字符串两端的空格
//		String str1 = "    des     de  sd";
//		System.out.println(str1.trim());
		
		//传入的参数可以转换为String类型
		System.out.println(String.valueOf(3));
		
	}

}
