package cn.tedu.practices;
/*
 * I like beijing. ----> beijing. like I
 */
import java.util.Scanner;

public class PracticesDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//现将这句话你用“ ”分割开
		String[] strs = str.split(" ");
		//创建一个新String数组来接收字符串
		String[] strs1 = new String[strs.length*2-1];
		
		for(int j = 0;j < strs1.length;j++){
			//当索引为偶数时，将原数组中的字符串从后往前依次传入	
			if((j&1) == 0){
				strs1[j] = strs[strs.length-j/2-1];
			//当索引为奇数时，将“ ”传入数组
			}else{
				strs1[j] = " ";
				}
			}	
			//打印新数组
			for(int k = 0;k<strs1.length;k++){
			System.out.print(strs1[k]);
		}
		
	}
}
		
	
