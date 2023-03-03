import java.util.Scanner;

public class EditaDB {
	
public static void insereVeiculo(DAO dao, Scanner sc) {
	
	int id;
	String placa;
	String modelo;
	
	System.out.println("Digite o id do veículo: ");
	id = sc.nextInt();
	sc.nextLine();
	System.out.println("Digite a placa do veículo: ");
	placa = sc.nextLine();
	System.out.println("Digite o modelo do veículo: ");
	modelo = sc.nextLine();

	Veiculos veiculo = new Veiculos(id,placa,modelo);
	if(dao.inserirVeiculos(veiculo) == true) {
		System.out.println("Inserção com sucesso -> " + veiculo.toString());
	}
}

public static void listaVeiculo(DAO dao, Scanner sc) {

	Veiculos[] veiculo = dao.getVeiculos();
	System.out.println("==== Mostrar usuários === ");		
	for(int i = 0; i < veiculo.length; i++) {
		System.out.println(veiculo[i].toString());

	}
}
public static void excluiVeiculo(DAO dao, Scanner sc) {

	int id;
	System.out.println("Digite o id do Veiculo a ser excluido");
	id = sc.nextInt();
	dao.excluirVeiculos(id);
}

public static void atualizaVeiculo(DAO dao, Scanner sc) {

	int id;
	String placa;
	String modelo;
	System.out.println("Digite o id do Veiculo a ser atualizado");
	id = sc.nextInt();
	sc.nextLine();
	System.out.println("Digite a nova placa: ");
	placa = sc.nextLine();
	System.out.println("Digite o novo modelo: ");
	modelo = sc.nextLine();
	Veiculos veiculos = new Veiculos (id,placa,modelo);
	dao.atualizarVeiculos(veiculos);
}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		dao.conectar();
		char opcao = '1';
		
		do {
			System.out.println("Bem vindo ao Menu do Banco de Dados de carros:");
			System.out.println("O que deseja fazer: ");
			System.out.println("1-Listar\n2-Inserir\n3-Excluir\n4-Atualizar\n5-Sair");
			opcao = sc.next().charAt(0);
			switch (opcao) {
			case '1': {
				listaVeiculo(dao, sc);
				break;
			}
			case '2': {
				insereVeiculo(dao,sc);
				break;
			}
			case '3': {
				excluiVeiculo(dao, sc);
				break;
			}
			case '4': {
				atualizaVeiculo(dao, sc);
				break;
			}
			case '5' : {
				break;
			}
			default:
				System.out.println("Escolha uma opcao valida");
			}
			
		} while (opcao != '5');
		System.out.println("Programa finalizado");
		dao.close();
		sc.close();

}
}