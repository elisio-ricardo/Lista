package ListaUm;

public class exercicio06 {

	public static void main(String[] args) {

		int calc = fatorial(5);
		System.out.println(calc);
	}

	private static int fatorial(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorial(num - 1);
	}

}
