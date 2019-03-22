package cn.tedu.pattern;
/*
 * 判断一个密码是否符合规范：
 * 密码由8-12位组成，大写字母、小写字母、数字
 * 、空格最少要出现两种
 */

import java.util.Scanner;

public class PatterTest2 {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		
		checkPassword(str);	
		
			
	}
	public static boolean checkPassword(String password){
		//判断字符是否符合密码长度要求
		if(!password.matches("[A-Za-z\\d ]{8,12}")){
			return false;
		}
		//定义一个变量，记录每一种出现的次数，如果总数次数大于等于2，符合要求
		int count = 0;
		
		//判断是否有小写字母
		if(password.matches(".*[a-z].*")){
			count++;
		}
		//判断是否有大写字母
		if(password.matches(".*[A-Z].*")){
			count++;
		}
		//判断是否有数字
		if(password.matches(".*[0-9].*")){
			count++;
		}
		//判断是否有空格
		if(password.matches(".* .*")){
			count++;
		}
		return count >= 2;
	}

}
