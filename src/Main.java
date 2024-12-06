import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number1, number2;
		String menu = """
				Escolha a operação a ser realizada...
				1 - Adição
				2 - Subtração
				3 - Multiplicação
				4 - Divisão
				5 - Potenciação
				6 - Radiciação
				""";
		int operation;
		boolean check;

		do {
			System.out.println("Insira o primeiro número");
			number1 = input.nextDouble();
			System.out.println("Insira o segundo número");
			number2 = input.nextDouble();
			System.out.println(menu);
			operation = input.nextInt();
			Calculator calculator = new Calculator(number1, number2);

			switch (operation) {
				case 1:
					System.out.println(calculator.add());
					break;
				case 2:
					System.out.println(calculator.subtract());
					break;
				case 3:
					System.out.println(calculator.multiply());
					break;
				case 4:
					System.out.println(calculator.divide());
					break;
				case 5:
					System.out.println(calculator.pow());
					break;
				case 6:
					System.out.println(calculator.square());
					break;
				default:
					System.out.println("Erro: operação inválida!");
					break;
			}

			System.out.println("Você deseja realizar outra operação? (digite 0 para sairou qualquer outro número para continuar)");
			int answer = input.nextInt();

			if (answer == 0) {
				break;
			}
			check = true;

		} while (check);

		System.out.println("Saindo...");
		input.close();
	}
}