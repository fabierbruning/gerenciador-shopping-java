package shopping;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao= 0;
		
		while(opcao != 3) {
			System.out.println("Digite uma Opção:");
			System.out.println("(1) criar uma loja");
			System.out.println("(2) criar um produto");
			System.out.println("(3) sair");
			 
			opcao= sc.nextInt();
			sc.nextLine();
			if(opcao <= 0 || opcao > 3) {
				System.out.println("“Opção inválida”");
			} else if(opcao == 1) {
				
				System.out.println("Digite o Nome da Loja:");
				String nome = sc.nextLine();
				 
				System.out.println("Digite a Quantidade de Funcionarios:");
				int quantFuncionario= sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o salario Base dos Funcionario:");
				double salarioBase = sc.nextDouble();
				sc.nextLine();
				System.out.println("Digite o Endereço da Loja:");
				System.out.println("Digite o Nome da Rua:");
				String nomeRua = sc.nextLine();
				 
				System.out.println("Digite a Cidade:");
				String cidade = sc.nextLine();
				 
				System.out.println("Digite o Estado:");
				String estado = sc.nextLine();
				 
				System.out.println("Digite o Nome do País:");
				String pais = sc.nextLine();
				 
				System.out.println("Digite o CEP:");
				String cep = sc.nextLine();
				 
				System.out.println("Digite o Número do Endereço:");
				String numero = sc.nextLine();
				 
				System.out.println("Digite o Complemento do Endereço:");
				String Complemento = sc.nextLine();
				 
				System.out.println("Agora Sobre a Data de Fundação da Loja:");
				System.out.println("Digite o Dia:");
				int dia = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o Mês:");
				int mes = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o Ano:");
				int ano = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite a Quantidade de Produtos:");
				int quantProduto = sc.nextInt();
				sc.nextLine();
				
				Endereco e = new Endereco(nomeRua,cidade,estado,pais,cep,numero,Complemento);
				
				Data d = new Data(dia,mes,ano);
				
				Loja l = new Loja(nome,quantFuncionario,salarioBase,e,d,quantProduto);
				System.out.println(l);
				
				
			}else if(opcao == 2) {
				System.out.println("Digite o Nome do Produto:");
				String nome = sc.nextLine();
				 
				System.out.println("Digite o Preço do Produto:");
				double preco = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Digite a Data de Validade do Produto:");
				System.out.println("Digite o Dia:");
				int dia = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o Mês:");
				int mes = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o Ano:");
				int ano = sc.nextInt();
				sc.nextLine();
				
				Data v = new Data(dia,mes,ano);
				
				Produto p = new Produto(nome, preco, v);
				System.out.println(p);
				
				Data dataReferencia = new Data(20, 10, 2023);
				if(p.estaVencido(dataReferencia) == true) {
					System.out.println("PRODUTO VENCIDO");
				}else {
					System.out.println("PRODUTO NÃO VENCIDO");
				}
				
			}else if(opcao == 3) {
				System.out.println("Programa encerrado.");
				
			}
		
		}
		sc.close();
	}

}
