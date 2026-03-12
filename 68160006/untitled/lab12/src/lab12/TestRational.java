package lab12;

public class TestRational {
	   public static void main(String[] args) {
	      Rational r1,r2,r3,r4,r5,r6;

	      r1 = new Rational(3,5);
	      r2 = new Rational(1,5);
	      r3 = r1.sub(r2);
	      System.out.println(r1.show() + " - "  + r2.show() + " = " + r3.show());

	            
	      r4 = new Rational(3,7);
	      r5 = new Rational(1,4);

	      r6 = r4.sub(r5);
	      System.out.println(r4.show() + " - "  + r5.show() + " = " + r6.show());
	   }
	}



