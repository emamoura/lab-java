/***
 * Classe que representa uma conta de uma cantina do Controle Institucional da Situação Acadêmica (COISA),
 * cada cantina possui um nome, uma quantidade de itens comprados e o valor gasto na mesma, em centavos.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 */


public class ContaCantina {
	/** 
	 *Atributo que se refere ao nome da cantina.
	 */
	private String nomeDaCantina;
	
	/** 
	 *Atributo que se refere a quantidade de items que a pessoa consome na cantina.
	 */
	private int qtdItens;
	
	/** 
	 *Atributo que se refere aos custos do lanche, além disso, se refere também ao valor que
	 *se tem para ser quitado da cantina,o valor é dado em centavos.
	 */
	private int valorCentavos;
	
	/** 
	 *Atributo que se refere ao valor total gasto na cantina.
	 */
	private int valorCentavosAcumulado;
	
	/** 
	 *Constrói uma construtor a partir do nome da cantina. Toda cantina é começada com os campos:
	 *quantidade de Itens(qtdItens), valor em centavos(valorCentavos) e 
	 *valor total em centavos(valorCentavosAcumaldo) igual a 0.
	 *
	 *@param nomeDaCantina O nome da cantina.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.qtdItens = 0;
		this.valorCentavos = 0;
		this.valorCentavosAcumulado = 0;
	}
	
	/** 
	 *O método cadastra um lanche recebendo dois parâmetros, além disso, soma a quantidade
	 *de centavos em valorCentavosAcumlado, visto que é necessário saber o total que já foi 
	 *gasto na cantina.
	 *
	 *@param qtdItens recebe a quantidade de items que vai ser consumido na cantina.
	 *@param valorCentavos recebe o valor, em centavos, do preço gasto nos lanches.
	 *
	 *@return void.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorCentavos += valorCentavos;
		this.valorCentavosAcumulado += valorCentavos;
	}
	
	/**
	 * O método paga uma conta da cantina,decrementado de valorCentavos,
	 * caso o valor do parâmetro seja menor ou igual ao valor da quantidade
	 * de centavos existente.
	 *  
	 * 
	 * @param valorCentavos A quantidade de centavos que será paga na cantina.
	 * 
	 * @return void
	 */
	public void pagaConta(int valorCentavos) {
		if(valorCentavos > this.valorCentavos) {
			System.out.println("Insira um valor abaixo do que você está devendo");
		} else {
			this.valorCentavos -= valorCentavos;
		}
	}
	
	/**
	 * O método retorna o valor que falta pagar na cantina.
	 * 
	 * @return um int com a quantidade de centavos que ainda falta pagar na conta.
	 */
	public int getFaltaPagar() {
		return this.valorCentavos;
	}
	
	/**
	 * Retorna a String que representa uma conta na cantina.
	 * O formato é o seguinte: "nomeDaCantina QuantidadeItens ValorTotalAcumulado".
	 * 
	 * @return a representação em String de uma cantina.
	 */
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavosAcumulado;
	}
}
