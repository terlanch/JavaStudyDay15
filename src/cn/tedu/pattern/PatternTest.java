package cn.tedu.pattern;
/*
 * �ж��ǲ���С��  0.0  0.1  01.09(����)
 */
import java.util.Scanner;

public class PatternTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		//��һֻ���������0��ͷ    �ڶ������ ����1-9��ͷ
		//str.matches("-?0\\.[0-9]+|-?[1-9]\\d*\\.\\d+")
		if(str.matches("-?0\\.[0-9]+") || str.matches("-?[1-9]\\d*\\.\\d+")){
			System.out.println("�������С��");
		}else{
			System.out.println("���������С��");
		}
	}

}
