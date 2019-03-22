package cn.tedu.pattern;
/*
 * \w --- [\da-zA-Z_]
 */
public class PatternTest3 {
	public static void main(String[] args) {
		String str = "841634721@qq.cn";
		System.out.println(str.matches("\\w{8,32}@\\w+(\\.com)|\\w{8,32}@\\w+(\\.com)?(\\.cn)"));
	}
}
