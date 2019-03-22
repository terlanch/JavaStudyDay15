package cn.tedu.stringdemo;
/*
 * 截取一段中文字符，如果出现乱码输出乱码之前的中文
 */
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		//将用户输入的字符串转换为字节数组
		byte[] bs = str.getBytes("GBK");
		//先判断字节数是否合理
		if (n < 0 || n > bs.length){
			return;
		}
		//根据用户输入的字节截取内容
		String str1 = new String(bs,0,n,"GBK");
		//获取str1最后一个字符的索引
		int index = str1.length() - 1;
		//判断str1的最后一个字符是否是半截字符
		
		if(str1.charAt(index) != str.charAt(index)){
			str1 = new String(bs,0,n-1,"GBK");
		}
		System.out.println(str1);
	}

}
