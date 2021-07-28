import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		// a linha abaixo cria uma variavel
		String nome; 
		// a linha abaixo exibe uma mensagem
		System.out.println("Por favor, digite seu nome");
		// a linha abaixo cria um scanner para ler dados do teclado
		Scanner leitor = new Scanner(System.in);
		// a linha abaixo captura o conteudo digitado pelo usuario e armazena na variavel nome
		nome = leitor.next();
		// exibe mensagem e o conteudo da variavel
		System.out.println("Boa noite, " + nome);
		//leitor é um recurso de sistema e precisa ser fechado para evitar erros em outros sistemas
		leitor.close();
	}

}
