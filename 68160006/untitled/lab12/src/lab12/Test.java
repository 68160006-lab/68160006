package lab12;

public class Test {
	public static void main(String[] args) {
		MixNumber m1,m2;
		SesSuan a,b;
		double x,y;
		
		m1 = new MixNumber();
		a = new SesSuan();

		m1.setFull(3);
		m1.setSesSuan(1, 2);
		
		x = m1.getFull() + ((double) m1.getSesSuan().getSes() / m1.getSesSuan().getSuan());
		
		a.setSes(m1.getFull() * m1.getSesSuan().getSuan() + m1.getSesSuan().getSes());
		a.setSuan(m1.getSesSuan().getSuan());
		
		m2 = new MixNumber();
		b = new SesSuan();
		
		m2.setFull(5);
		m2.setSesSuan(3, 4);
		
		y = m2.getFull() + ((double) m2.getSesSuan().getSes() / m2.getSesSuan().getSuan());
		
	             b.setSes(m2.getFull() * m2.getSesSuan().getSuan() + m2.getSesSuan().getSes());
		b.setSuan(m2.getSesSuan().getSuan());	
		
		System.out.println(m1.show() + " = " + m1.getWholeInSesSuan().show() + " = "+ x);		
		System.out.println(m2.show() + " = " + m2.getWholeInSesSuan().show() + " = "+ y);	

	}
}

