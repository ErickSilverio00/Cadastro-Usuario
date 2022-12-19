import java.util.Scanner;

public class CadastroUsuario {
	
	public static boolean verificarNome(String nome) {
		if(nome == null || nome.isBlank())
			return false;
		else
			return true;
	}
	
	public static boolean validarNome(String nome) {
		if(nome.matches("[a-z, A-Z]*"))
			return true;
		else
			return false;
	}
	
		public static boolean verificarCpf(String cpf) {
			if(cpf == null || cpf.isBlank())
				return false;
			else
				return true;
		}
		
		public static boolean validarCpf(String cpf) {
			if(cpf.matches("[0-9]*") && cpf.length() == 11)
				return true;
			else
				return false;
		}
		
		public static boolean verificarEmail(String email) {
			if(email == null || email.isBlank())
				return false;
			else
				return true;
		}
		
		public static boolean validarEmail(String email) {
			if(email.contains("@") && email.contains(".com"))
				return true;
			else
				return false;
		}
		
		public static boolean verificarTelefone(String telefone) {
			if(telefone == null || telefone.isBlank())
				return false;
			else
				return true;
		}
		
		public static boolean validarTelefone(String telefone) {
			if(telefone.matches("[0-9]*") && telefone.length() == 11)
				return true;
			else
				return false;
		}
		
		public static boolean verificarCep(String cep) {
			if(cep == null || cep.isBlank())
				return false;
			else
				return true;
		}
		
		public static boolean validarCep(String cep) {
			if(cep.matches("[0-9]*") && cep.length() == 8)
				return true;
			else
				return false;
		}
		
		public static boolean verificarLogin(String login) {
			if(login == null || login.isBlank())
				return false;
			else
				return true;
		}
		
		public static boolean verificarSenha(String senha) {
			if(senha == null || senha.isBlank())
				return false;
			else
				return true;
		}
		
		public static void imprimirDados(String nome, String cpf, String email, String telefone, String cep, String login, String senha ) {
			System.out.println("\n========== Usuário cadastrado ==========");
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Email: " + email);
			System.out.println("Telefone: " + telefone);
			System.out.println("Cep: " + cep);
			System.out.println("Login: " + login);
			System.out.println("Senha: ***** ");
			System.out.println("========================================\n");
			}
		
		public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO SISTEMA SYSTEM-BR!");
		
		System.out.println("\n===================");
		System.out.println("CADASTRO DE USUÁRIO");
		System.out.println("===================");
		
		String nome;
		String cpf;
		String email;
		String telefone;
		String cep;
		String login;
		String senha;
		
		String resposta = "SIM";
		
		while (resposta.toUpperCase().equals("SIM")) {
		
		System.out.println("\nInforme o nome do usuário: ");
		nome = entrada.nextLine();
		
		while(!verificarNome(nome)) {
			System.out.println("Campo obrigatório: Nome!");
			System.out.println("Informe o nome do usuário novamente:");
			nome = entrada.nextLine();
			}
		
		while(!validarNome(nome)) {
			System.out.println("Nome inválido! Digite apenas letras!");
			System.out.println("Informe o nome do usuário novamente:");
			nome = entrada.nextLine();
			}
		
		System.out.println("Informe o CPF do usuário: ");
		cpf = entrada.nextLine();
		
		while(!verificarCpf(cpf)) {
			System.out.println("Campo obrigatório: CPF!");
			System.out.println("Informe o CPF do usuário novamente:");
			cpf = entrada.nextLine();
			}
		
		while(!validarCpf(cpf)) {
			System.out.println("CPF inválido! Digite apenas números, o cep deve conter 11 números...");
			System.out.println("Informe o CPF do usuário novamente:");
			cpf = entrada.nextLine();
			}
		
		System.out.println("Informe o email do usuário: ");
		email = entrada.nextLine();
		
		while(!verificarEmail(email)) {
			System.out.println("Campo obrigatório: Email!");
			System.out.println("Informe o email do usuário novamente:");
			email = entrada.nextLine();
			}
		
		while(!validarEmail(email)) {
			System.out.println("Email inválido!");
			System.out.println("Informe o email do usuário novamente:");
			email = entrada.nextLine();
			}
		
		System.out.println("Informe o telefone do usuário: ");
		telefone = entrada.nextLine();
		
		while(!verificarTelefone(telefone)) {
			System.out.println("Campo obrigatório: Telefone!");
			System.out.println("Informe o telefone do usuário novamente:");
			telefone = entrada.nextLine();
			}
		
		while(!validarTelefone(telefone)) {
			System.out.println("Telefone inválido! Digite apenas números, contendo o DDD.");
			System.out.println("Informe o telefone do usuário novamente:");
			telefone = entrada.nextLine();
			}
		
		System.out.println("Informe o cep do usuário: ");
		cep = entrada.nextLine();
		
		while(!verificarCep(cep)) {
			System.out.println("Campo obrigatório: CEP!");
			System.out.println("Informe o CEP do usuário novamente:");
			cep = entrada.nextLine();
			}
		
		while(!validarCep(cep)) {
			System.out.println("CEP inválido! Digite apenas números!");
			System.out.println("Informe o cep do usuário novamente:");
			cep = entrada.nextLine();
			}
		
		System.out.println("Informe o login do usuário: ");
		login = entrada.nextLine();
		
		while(!verificarLogin(login)) {
			System.out.println("Campo obrigatório: Login!");
			System.out.println("Informe o Login do usuário novamente:");
			login = entrada.nextLine();
			}
		
		System.out.println("Informe a senha do usuário: ");
		senha = entrada.nextLine();
		
		while(!verificarSenha(senha)) {
			System.out.println("Campo obrigatório: Senha!");
			System.out.println("Informe a senha do usuário novamente:");
			senha = entrada.nextLine();
			}
		
		imprimirDados(nome, cpf, email, telefone, cep, login, senha);
		
		System.out.println("Deseja cadastrar novo usuário? (SIM) ou (NÃO): ");
		resposta = entrada.nextLine();
		
		}
		
		System.out.println("===== Obrigado por utilizar nossos serviços! =====	");
	}
}
