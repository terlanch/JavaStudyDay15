package cn.tedu.pattern;
/*
 * 判断是不是小数  0.0  0.1  01.09(不是)
 */
import java.util.Scanner;

public class PatternTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		//第一只种情况，以0开头    第二种情况 是以1-9开头
		//str.matches("-?0\\.[0-9]+|-?[1-9]\\d*\\.\\d+")
		if(str.matches("-?0\\.[0-9]+") || str.matches("-?[1-9]\\d*\\.\\d+")){
			System.out.println("这个数是小数");
		}else{
			System.out.println("这个数不是小数");
		}
	}

}
