import java.util.Scanner;

public class Main {
	public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		Scanner input = new Scanner(System.in);
		double number1, number2;
		String menu = """
				Escolha a operação a ser realizada...
				1 - Adição
				2 - Subtração
				3 - Multiplicação
				4 - Divisão
				""";
		int operation;
		boolean check;

		do {
			System.out.println("Insira o primeiro número");
			number1 = input.nextDouble();
			System.out.println("Insira o segundo número");
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
				default:
					System.out.println("Erro: operação inválida!");
					break;
			}

			check = Calculator.checkInput();
		} while (check);
	}
}