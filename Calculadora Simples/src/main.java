import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner enterData = new Scanner(System.in);
		
		int n1, n2, result;
		char operator;
		
		System.out.println("CALCULADORA SIMPLES");
		System.out.println("___________________");
			
			//Enter date
			
		System.out.print("Digite um n�mero: ");
		 n1 = enterData.nextInt();
		System.out.print("Digite outro n�mero: ");
		 n2 = enterData.nextInt();
		System.out.print("Escolha um dos operadores / + - * :  ");
		operator = enterData.next().charAt(0);
			
			
			
		   // Choose a logical operator
			
		switch(operator) {
			
			case '/':
				result = n1 / n2;
				System.out.print("O resultado da divis�o �: "+ result);
				break;

			case '*':
				result = n1 * n2;
				System.out.print("O resultado da Multiplica��o �: "+ result);
				break;

			case '+':
				result = n1 + n2;
				System.out.print("O resultado da Soma �: "+ result);
				break;

			case '-':
				result = n1 - n2;
				System.out.print("O resultado da Subtra��o �: "+ result);
				break;
			}
		
	}

}
