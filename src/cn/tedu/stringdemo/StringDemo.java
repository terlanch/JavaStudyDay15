package cn.tedu.stringdemo;

public class StringDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = sb.append(true).append("hehe").toString();
		sb.append("haha");
		sb.insert(2, "it");
		sb.delete(1, 4);
		System.out.println(sb);
	}
}
