package cn.tedu.practices;

import java.util.Scanner;

public class PracticesDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		//字符串中非数字去掉
		str = str.replaceAll("\\D", " ");
		//System.out.println(str);
		//把字符串中的字符用“ ”隔开并转换为字符数组
		String[] strs = str.split(" ");
		//System.out.println(strs.length);
		//System.out.println(Arrays.toString(strs));
		for(int i = 1;i<strs.length;i++){
			String str1 = strs[i-1];
			String str2 = strs[i];
			//将长度最长的字符数组移到数组最右边
			if(str1.length()>str2.length()){
					String temp = strs[i];
					strs[i] = strs[i-1];
					strs[i-1] = temp;	
			}	
		}
		System.out.println(strs[strs.length-1]);
	}

}
