package shopping;

import java.util.Arrays;

public class Loja {

	private String nome;
	private int quantidadeFuncionarios;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataFundacao;
	private Produto[] estoqueProdutos;
	
	public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao,int quantidadeMaximaProdutos) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}
	
	public Loja(String nome, int quantidadeFuncionarios, int quantidadeMaximaProdutos) {
	    this.nome = nome;
	    this.quantidadeFuncionarios = quantidadeFuncionarios;
	    this.salarioBaseFuncionario = -1;
	    this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}

	public Loja() {

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Data dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}

	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}
	
	

	public Produto[] getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(Produto[] estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}

	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
				+ salarioBaseFuncionario + ", endereco=" + endereco + ", datafundacao=" + dataFundacao
				+ ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) + "]";
	}

	public double gastosComSalario() {

	    if(getSalarioBaseFuncionario() == -1) {
	        return -1;
	    }

	    return salarioBaseFuncionario * quantidadeFuncionarios;
	}

	public char tamanhoDaLoja() {
		if (getQuantidadeFuncionarios() < 10) {
			return 'P';
		} else if (getQuantidadeFuncionarios() >= 10 && getQuantidadeFuncionarios() <= 30) {
			return 'M';
		} else {
			return 'G';
		}
	}

	
	public void imprimeProdutos() {
		 if (estoqueProdutos == null) {
		        System.out.println("Estoque Vazio.");
		        return;
		    }
		for(int i = 0; i < estoqueProdutos.length; i++ ) {
			if(estoqueProdutos[i] != null) {
			System.out.println("Nome Do Produto: " + estoqueProdutos[i].getNome());
			System.out.println("Preço Do Produto: " + estoqueProdutos[i].getPreco());
			System.out.println("Validade Do Produto: " + estoqueProdutos[i].getValidade());
			}
		}	
	}
	
	
	public boolean insereProduto(Produto p) {
		
		for(int i = 0; i < estoqueProdutos.length; i++ ) {
			if(estoqueProdutos[i] == null) {
				estoqueProdutos[i] =  p;
				return true;
			}
		}
		return false;
	}
	
	
public boolean removeProduto(String s) {
	 if (estoqueProdutos == null) {
	        System.out.println("Estoque Vazio.");
	        return false;
	    }
		for(int i = 0; i < estoqueProdutos.length; i++ ) {
			if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(s)) {
				estoqueProdutos[i] =  null;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
}
