package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		
		double a = 8;
		double b = 3;		

		double loesung1 = a*a + 2*a*b + b*b;
		
		double Klammer = a + b;
		double loesung2 = Math.pow(Klammer, 2);
		
		double loesung3 = Math.pow(a, 2) + 2*a*b + Math.pow(b, 2);
		
		System.out.println(loesung1);
		System.out.println(loesung2);
		System.out.println(loesung3);
	}

}
