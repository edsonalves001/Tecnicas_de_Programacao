public class Main
{
	public static void main(String[] args) {
		Calculadora cientifica = new Calculadora();
		System.out.println("Soma de dois inteiros: " + cientifica.somar(3,5));
		System.out.println("Soma de três inteiros: " + cientifica.somar(1,2,3));
		System.out.println("Soma de dois double: " + cientifica.somar(5.5,7.7));
	}
}
