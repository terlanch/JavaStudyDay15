package cn.tedu.practices;
/*
 * I like beijing. ----> beijing. like I
 */
import java.util.Scanner;

public class PracticesDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//�ֽ���仰���á� ���ָ
		String[] strs = str.split(" ");
		//����һ����String�����������ַ���
		String[] strs1 = new String[strs.length*2-1];
		
		for(int j = 0;j < strs1.length;j++){
			//������Ϊż��ʱ����ԭ�����е��ַ����Ӻ���ǰ���δ���	
			if((j&1) == 0){
				strs1[j] = strs[strs.length-j/2-1];
			//������Ϊ����ʱ������ ����������
			}else{
				strs1[j] = " ";
				}
			}	
			//��ӡ������
			for(int k = 0;k<strs1.length;k++){
			System.out.print(strs1[k]);
		}
		
	}
}
		
	
