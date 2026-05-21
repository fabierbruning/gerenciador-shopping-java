package shopping;

public class Produto {
	private String nome;
	private double preco;
	private Data validade;

	public Produto(String nome, double preco, Data validade) {
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}

	public Data getValidade() {
		return validade;
	}

	public void setValidade(Data validade) {
		this.validade = validade;
	}

	public Produto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", validade=" + validade + "]";
	}

	public boolean estaVencido(Data d) {

	    if (d.getAno() > validade.getAno()) {
	        return true;

	    } else if (d.getAno() == validade.getAno() &&
	               d.getMes() > validade.getMes()) {
	        return true;

	    } else if (d.getAno() == validade.getAno() &&
	               d.getMes() == validade.getMes() &&
	               d.getDia() > validade.getDia()) {
	        return true;

	    } else {
	        return false;
	    }
	}

}
