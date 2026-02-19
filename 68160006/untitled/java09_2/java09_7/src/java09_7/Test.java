package java09_7;

public class Test {

	public static void main(String[] args) {
		
		int r = Tool.sub(7,2);
				
		System.out.println("r = " + r);
		
		int a = Tool.add(r, 4);
		
		System.out.println("a = " + a);		

		int b = Tool.max(3,8);
		
		System.out.println("b = " + b);
		
		int c = Tool.max(a,r);		
		
		System.out.println("c = " + c);
		
		int d = Tool.min(7, Tool.mul(4,2), Tool.sub(9, 4));
		
		System.out.println("d = " + d);		
		
	}

}