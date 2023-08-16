import java.util.Scanner;

public class calculadora {
	public static int suma(int Numero1, int Numero2){
		int total = Numero1 + Numero2;
		return total;
	}
	public static int resta(int Numero1, int Numero2){
		int total = Numero1 - Numero2;
		return total;
	}
	public static int mult(int Numero1, int Numero2){
		int total = Numero1 * Numero2;
		return total;
	}
	public static int div(int Numero1, int Numero2){
		int total = Numero1 / Numero2;
		return total;
	}
	public static int mod(int Numero1, int Numero2){
		int total = Numero1 % Numero2;
		return total;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		int Numero1 = scan.nextInt();
		
		System.out.println("Ingrese el segundo número");
		int Numero2 = scan.nextInt();
		
		int Total1 = suma(Numero1,Numero2);
		int Total2 = resta(Numero1,Numero2);
		int Total3 = mult(Numero1,Numero2);
		int Total4 = div(Numero1,Numero2);
		int Total5 = mod(Numero1,Numero2);
		
		System.out.println(Numero1+" + "+Numero2+" = "+Total1);
		System.out.println(Numero1+" - "+Numero2+" = "+Total2);
		System.out.println(Numero1+" * "+Numero2+" = "+Total3);
		System.out.println(Numero1+" / "+Numero2+" = "+Total4);
		System.out.println(Numero1+" % "+Numero2+" = "+Total5);
}
}