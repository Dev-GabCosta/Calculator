import java.util.Scanner;

public class Calculator {
	private final double NUMBER1;
	private final double NUMBER2;

	public Calculator(double NUMBER1, double NUMBER2) {
		this.NUMBER1 = NUMBER1;
		this.NUMBER2 = NUMBER2;
	}

	public static boolean checkInput() {
		boolean answer = false;
		Scanner input = new Scanner(System.in);

		do {
			int number = input.nextInt();

			switch (number) {
				case 1:
					answer = true;
					break;
				case 0:
					answer = false;
					break;
				default:
					System.out.println("Por favor, digite 0 para sair do programa ou 1 para realizar outra operação!");
					break;
			}

		} while (number != 0 || number != 1);

		input.close();
		return answer;
	}

	public double add() {
		return this.NUMBER1 + this.NUMBER2;
	}

	public double subtract() {
		return this.NUMBER1 - this.NUMBER2;
	}

	public double multiply() {
		return this.NUMBER1 * this.NUMBER2;
	}

	public double divide() {

		if(this.NUMBER2 ==0){
			return this.NUMBER1 / this.NUMBER2;
		}else {
			System.out.println("Erro! Não é possível dividir por 0!");
			return -1;
		}
	}

}
