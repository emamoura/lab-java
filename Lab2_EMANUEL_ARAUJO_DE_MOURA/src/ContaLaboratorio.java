/**
 * Classe que representa a conta em um determinado laboratório do curso de Ciência da Computação,
 * no sistema do COISA.
 * Cada conta de laboratório possui um nome, o espaço ocupado em mb, e a cota usada em mb.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 */
public class ContaLaboratorio {
	
	
	/**
	 * Atributo que se refere ao nome do laboratório.
	 */
	private String nomeLaboratorio;
	
	/**
	 * Atributo que se refere ao espaço ocupado no laboratório em mb.
	 */
	private int espacoOcupado;
	
	/**
	 * Atributo que se refere a cota disponível, em mb,  em um determinado laboratório.
	 */
	private int cota;
	
	
	
	/**
	 * Constrói uma conta em um laboratório, com um único parâmetro, que é o nome do laboratório.
	 * Com esse construtor, o espaço padrão da cota é iniciado com 2000mb.
	 * O espaço ocupado é inicializado com 0. 
	 * 
	 * @param nomeLaboratorio O nome do laboratório.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		// TODO Auto-generated constructor stub
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
		this.espacoOcupado = 0;
	}	
	
	
	/**
	 * Esse segundo construtor recebe dois parâmetros, o nome do laboratório e a cota.
	 * O espaço ocupado é inicializado como o valor 0.
	 * 
	 * @param nomeLaboratorio O nome do laboratório.
	 * @param cota Recebe a cota, em mb, que pode ser gasta no laboratório.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
		this.espacoOcupado = 0;
	}
	
	/**
	 *Esse método consome o espaço em mb do laboratório.
	 *
	 * @param mbytes valor do espaço que vai ser consumido do laboratório.
	 * 
	 * @return void.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;  
	}
	
	/**
	 *Esse método libera o espaço em mb do laboratório.
	 *
	 *@param mbytes valor do espaço que será liberado do laboratório.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}

	/**
	 * Esse método mostra se a cota já foi atingida.
	 * 
	 * 
	 * @return um boolean, se a cota foi atingida, ele retorna true, se não, retorna false.
	 */
	public boolean atingiuCota() {
		if(espacoOcupado < this.cota) {
			return false;
		}
		return true;
	}
	
	/**
	 * Retorna a representação de uma conta no laboratório.
	 * O formato é o seguinte: "nomeLaboratorio espaçoOcupado/Cota"
	 * 
	 * @return uma String com a representação de uma conta no laboratório.
	 */
	public String toString() {
		return this.nomeLaboratorio + " " + this.espacoOcupado + "/" + this.cota;
	}
	
}
