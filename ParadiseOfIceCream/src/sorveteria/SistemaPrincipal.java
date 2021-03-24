package sorveteria;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		System.out.println("***********************************************************************");
		System.out.println("\t \t \t PARADISE OF ICE CREAM ");
		System.out.println("***********************************************************************");
		Scanner ler = new Scanner(System.in);
		Estoque novoProd = new Estoque();
		Vendas novaVenda = new Vendas();
		Funcionario novoFunc = new Funcionario();
		System.out.println("1 - Entrar || 2 - Sair");
		byte op = ler.nextByte();
		switch (op){
		 	case 1:
		 		System.out.print("Digite o usuario: ");
		 		String user = ler.next();
		 		if (user.equals("Admin")) {
		 			System.out.print("Digite a senha:");
		 			String pass =  ler.next();
		 			if (pass.equals("Admin@Admin")) {
		 				System.out.println("\n \n===========================================================");
		 				System.out.println("Bem Vindo, Administrador");
		 				System.out.println("O que deseja fazer? \n");
		 				System.out.println("1 - Cadastrar Venda ||  2 - Cadastrar Estoque || 3 - Cadastrar Funcionario || 4 - Somente Visualizar");
		 				byte op4 = ler.nextByte();
		 				switch(op4) {
		 					case 1:
		 						System.out.print("Quantidade de produtos vendidos: ");
			 					novaVenda.setQntProdVend(ler.nextInt());
			 					System.out.print("Hora da Venda: ");
			 					novaVenda.setHoraVenda(ler.next());
			 					System.out.print("Nome do Cliente: ");
			 					novaVenda.setNomeCliente(ler.next());
			 					System.out.print("Atacado ou Varejo: ");
			 					novaVenda.setProdComprado(ler.next());
			 					System.out.println("Cadastro realizado com sucesso\n \n!");
			 					
			 					
 								
 								System.out.println("=============================================================");
 								System.out.println("\t\t INFORMAÇÕES DAS VENDAS");
 								System.out.println("Quantidade de produtos vendidos: " + novaVenda.getQntProdVend());
 								System.out.println("Hora da venda: " + novaVenda.getHoraVenda());
 								System.out.println("Nome do Cliente: " + novaVenda.getNomeCliente());
 								System.out.println("Produto comprado: " + novaVenda.getProdComprado());
 								System.out.println("=============================================================");
		 						
			 				break;
		 					case 2:
		 						System.out.print("Marca do produto: ");
		 						novoProd.setMarca(ler.next());
		 						System.out.print("Qual a quantidade ainda disponivel: ");
		 						novoProd.setQuantidade(ler.nextInt());
		 						System.out.print("Qual o sabor: ");
		 						novoProd.setSabor(ler.next());
		 						;
 								
 								System.out.println("=============================================================");
 								System.out.println("\t\t INFORMAÇÕES DO ESTOQUE");
 								System.out.println("Marca: " + novoProd.getMarca());
 								System.out.println("Quantidade: " + novoProd.getQuantidade());
 								System.out.println("Sabor: " + novoProd.getSabor());
 								System.out.println("============================================================= \n \n");
 								
 								
		 						
		 					break;
		 					case 3:
		 						System.out.print("Nome do funcionario: ");
		 						novoFunc.setNome(ler.next());
		 						System.out.print("CPF: ");
		 						novoFunc.setCpf(ler.next());
		 						System.out.print("Idade: ");
		 						novoFunc.setIdade(ler.nextInt());
		 						System.out.print("RG: ");
		 						novoFunc.setRg(ler.next());
		 						System.out.print("Função: ");
		 						novoFunc.setFuncao(ler.next());
		 						System.out.print("Endereço: ");
		 						novoFunc.setEndereco(ler.next());
		 						System.out.print("Salario: R$");
		 						novoFunc.setSalario(ler.nextDouble());
		 						System.out.println("Funcionario cadastrado com sucesso!\n \n");
		 						System.out.println("=============================================================");
 								System.out.println("\t\t INFORMAÇÕES DOS FUNCIONARIOS");
 								System.out.println("Nome: " + novoFunc.getNome());
 								System.out.println("CPF: " + novoFunc.getCpf());
 								System.out.println("Idade: " + novoFunc.getIdade());
 								System.out.println("RG: " + novoFunc.getRg());
 								System.out.println("Função: " + novoFunc.getFuncao());
 								System.out.println("Endereço: " + novoFunc.getEndereco());
 								System.out.println("Salario: " + novoFunc.getSalario());
 								System.out.println("============================================================= \n \n");
 								
 								
		 						
		 					break;
		 					case 4:
		 						System.out.println("Quais informações gostaria de visualizar?");
		 						System.out.println("1 - Funcionario || 2 - Estoque || 3 - Vendas");
		 						byte op5 = ler.nextByte();
		 						switch(op5) {
		 							case 1:
		 								System.out.println("=============================================================");
		 								System.out.println("\t\t INFORMAÇÕES DOS FUNCIONARIOS");
		 								System.out.println("Nome: " + novoFunc.getNome());
		 								System.out.println("CPF: " + novoFunc.getCpf());
		 								System.out.println("Idade: " + novoFunc.getIdade());
		 								System.out.println("RG: " + novoFunc.getRg());
		 								System.out.println("Função: " + novoFunc.getFuncao());
		 								System.out.println("Endereço: " + novoFunc.getEndereco());
		 								System.out.println("Salario: " + novoFunc.getSalario());
		 								System.out.println("=============================================================");
		 							break;
		 							case 2:
		 								System.out.println("=============================================================");
		 								System.out.println("\t\t INFORMAÇÕES DO ESTOQUE");
		 								System.out.println("Marca: " + novoProd.getMarca());
		 								System.out.println("Quantidade: " + novoProd.getQuantidade());
		 								System.out.println("Sabor: " + novoProd.getSabor());
		 								System.out.println("=============================================================");
		 							break;
		 							case 3:
		 								System.out.println("=============================================================");
		 								System.out.println("\t\t INFORMAÇÕES DAS VENDAS");
		 								System.out.println("Quantidade de produtos vendidos: " + novaVenda.getQntProdVend());
		 								System.out.println("Hora da venda: " + novaVenda.getHoraVenda());
		 								System.out.println("Nome do Cliente: " + novaVenda.getNomeCliente());
		 								System.out.println("Produto comprado: " + novaVenda.getProdComprado());
		 								System.out.println("=============================================================");
		 							default:
		 								System.out.println("Opção Inválida");
		 								System.exit(0);
		 						}
		 						
		 						
		 				}
		 				
		 				
		 			} else {
		 				System.out.println("Senha Incorreta");
		 				System.exit(0);

		 			}
		 		} else if (user.equals("Funcionario")) {
		 			System.out.println("Digite a senha");
		 			String pass = ler.next();
		 			if (pass.equals("Funcionario@Funcionario")) {
		 				System.out.println("Bem vindo, Funcionario");
		 				System.out.println("O que deseja fazer? \n");
		 				System.out.println("1 - Cadastrar Venda ||  2 - Cadastrar Estoque || 3 - Somente Visualizar");
		 				byte op2 = ler.nextByte();
		 				switch(op2) {
		 					case 1:
			 					System.out.print("Quantidade de produtos vendidos: ");
			 					novaVenda.setQntProdVend(ler.nextInt());
			 					System.out.print("Hora da Venda: ");
			 					novaVenda.setHoraVenda(ler.next());
			 					System.out.print("Nome do Cliente: ");
			 					novaVenda.setNomeCliente(ler.next());
			 					System.out.print("Atacado ou Varejo: ");
			 					novaVenda.setProdComprado(ler.next());
			 					System.out.print("Cadastro realizado com sucesso!\n");
			 					System.out.println("=============================================================");
 								System.out.println("\t\t INFORMAÇÕES DAS VENDAS");
 								System.out.println("Quantidade de produtos vendidos: " + novaVenda.getQntProdVend());
 								System.out.println("Hora da venda: " + novaVenda.getHoraVenda());
 								System.out.println("Nome do Cliente: " + novaVenda.getNomeCliente());
 								System.out.println("Produto comprado: " + novaVenda.getProdComprado());
 								System.out.println("=============================================================");
		 					break;
		 					case 2:
		 						System.out.print("Marca do produto: ");
		 						novoProd.setMarca(ler.next());
		 						System.out.print("Qual a quantidade ainda disponivel: ");
		 						novoProd.setQuantidade(ler.nextInt());
		 						System.out.print("Qual o sabor: ");
		 						novoProd.setSabor(ler.next());
		 						System.out.println("Cadastro realizado com Sucesso!\n");
		 						System.out.println("=============================================================");
 								System.out.println("\t\t INFORMAÇÕES DO ESTOQUE");
 								System.out.println("Marca: " + novoProd.getMarca());
 								System.out.println("Quantidade: " + novoProd.getQuantidade());
 								System.out.println("Sabor: " + novoProd.getSabor());
 								System.out.println("=============================================================");
		 					break;
		 					case 3:
		 						System.out.println("Quais informações gostaria de ter acesso?\n");
		 						System.out.println("1 - Informações do Estoque || 2 - Informações das Vendas");
		 						byte op3 = ler.nextByte();
		 						switch(op3) {
		 							case 1:
		 								System.out.println("=============================================================");
		 								System.out.println("\t\t INFORMAÇÕES DO ESTOQUE");
		 								System.out.println("Marca: " + novoProd.getMarca());
		 								System.out.println("Quantidade: " + novoProd.getQuantidade());
		 								System.out.println("Sabor: " + novoProd.getSabor());
		 								System.out.println("=============================================================");
		 							break;
		 							case 2:
		 								System.out.println("=============================================================");
		 								System.out.println("\t\t INFORMAÇÕES DAS VENDAS");
		 								System.out.println("Quantidade de produtos vendidos: " + novaVenda.getQntProdVend());
		 								System.out.println("Hora da venda: " + novaVenda.getHoraVenda());
		 								System.out.println("Nome do Cliente: " + novaVenda.getNomeCliente());
		 								System.out.println("Produto comprado: " + novaVenda.getProdComprado());
		 								System.out.println("=============================================================");
		 						}
		 					default:
		 						System.out.println("Opção Invalida");
		 				}
		 				
		 				
		 				
		 			} else {
		 				System.out.println("Senha Incorreta");
		 				System.exit(0);
		 			}
		 		} else {
		 			System.out.println("Login Inválido");
		 			System.exit(0);
		 		}
		 		
		 		break;
		 	case 2:
		 		System.exit(0);
		 		ler.close();
		}
	}

}
