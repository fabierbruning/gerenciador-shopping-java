package shopping;

import java.util.Arrays;

public class Shopping {
private String nome;
private Endereco endereco;
private Loja[] lojas;


public  Shopping(String nome,Endereco endereco,int quantLojas) {
	this.nome = nome;
	this.endereco = endereco;
	this.lojas = new Loja[quantLojas];
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public Loja[] getLojas() {
	return lojas;
}

public void setLojas(Loja[] lojas) {
	this.lojas = lojas;
}

@Override
public String toString() {
	return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
}


public boolean insereLoja(Loja l) {
	
	for(int i = 0; i < lojas.length; i++ ) {
		if(lojas[i] == null) {
			lojas[i] =  l;
			return true;
		}
	}
	return false;
}


public boolean removeLoja(String s) {
	
	for(int i = 0; i < lojas.length; i++ ) {
		if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(s)) {
			lojas[i] =  null;
			return true;
		}
	}
	return false;
}


public int quantidadeLojasPorTipo(String s) {
	int cont = 0;
	for(int i = 0; i < lojas.length; i++ ) {
		if(lojas[i] != null && s.equalsIgnoreCase("Cosmético") && lojas[i] instanceof Cosmetico) {
			cont ++;
		} else if(lojas[i] != null && s.equalsIgnoreCase("Vestuário") && lojas[i] instanceof Vestuario) {
			cont ++;
		} else if(lojas[i] != null && s.equalsIgnoreCase("Bijuteria") && lojas[i] instanceof Bijuteria) {
			cont ++;
		} else if(lojas[i] != null && s.equalsIgnoreCase("Alimentação") && lojas[i] instanceof Alimentacao) {
			cont ++;
		} else if(lojas[i] != null && s.equalsIgnoreCase("Informática") && lojas[i] instanceof Informatica) {
			cont ++;
		}
	}
	
	
	if(!s.equalsIgnoreCase("Cosmético") && !s.equalsIgnoreCase("Vestuário") && !s.equalsIgnoreCase("Bijuteria") && !s.equalsIgnoreCase("Alimentação") && !s.equalsIgnoreCase("Informática")) {
		return -1;
	}else {
		return cont;
	}
	
}


public Loja lojaSeguroMaisCaro() {
	double maior = -1;
	int posicao = 0;
	int confirma = -1;
	for(int i = 0; i < lojas.length; i++ ) {
		if(lojas[i] != null && lojas[i] instanceof Informatica) {
			Informatica info = (Informatica) lojas[i];
			if(info.getSeguroEletronicos() > maior) {
				maior = info.getSeguroEletronicos();
				posicao = i;
				confirma ++;
			}
			
		}
	}
	if(confirma == -1) {
		return null;
	}else{
		return lojas[posicao];
	}
	
}
	
}





