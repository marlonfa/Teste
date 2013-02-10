import java.util.*;
public class exe01 {
	
	public static void main (String args[]) {		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite a Temperatura em graus Celsius:");
			double gc = ent.nextDouble();
			
			double gf;
			gf = (9*gc + 160)/5;
			
		System.out.println(gc+" graus Celsius é = "+gf+" graus Fahrenheit.");
	}
}

