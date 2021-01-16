/**
 * Representação do estado de saúde de uma pessoa do COISA.
 * O estado de saúde é representado pela Saúde Mental e pela Saúde Física.
 * 
 * @author Emanuel Araújo de Moura - 119210350
 */
public class Saude {
	/**
	 * O atributo do tipo String se refere a saúde física do indíviduo.
	 */
	private String saudeFisica;
	/**
	 * O atributo do tipo String se refere a saúde mental do indíviduo.
	 */
	private String saudeMental;
	
	/**
	 * Constrói um estado de saúde, inicialmente a saúde mental e a saúde física é iniciada como "boa".
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}
	
	/**
	 * O método recebe uma String, contendo o valor "boa" ou "fraca". O valor é colocado em saudeMental.
	 * Caso não seja colocado nenhum dos valores esperados, é mostrada uma mensagem pedindo um valor válido.
	 * 
	 * @return void.
	 */
	public void defineSaudeMental(String valor) {
		if(valor.equals("boa") || valor.equals("fraca")) {
			this.saudeMental = valor;
		}else {
			System.out.println("Coloque um valor válido!");
		}
	}
	
	/**
	 * O método recebe uma String, contendo o valor "boa" ou "fraca". O valor é colocado em saudeFisica.
	 * Caso não seja colocado nenhum dos valores esperados, é mostrada uma mensagem pedindo um valor válido.
	 * 
	 * @return void.
	 */
	public void defineSaudeFisica(String valor) {
		if(valor.equals("boa") || valor.equals("fraca")) {
			this.saudeFisica = valor;
		}else {
			System.out.println("Coloque um valor válido!");
		}
	}
	
	/** 
	 * O método pega o status geral da saúde, assim, se ambas estiverem boas, ele retorna uma String "boa".
	 * Se ambas estiverem fracas, ele retorna uma String "fraca".
	 * Caso uma esteja boa e a outra esteja fraca, ele retorna uma String "ok".
	 * 
	 * 
	 * @return uma String mostrando o status da saúde do indíviduo.
	 */
	public String getStatusGeral() {
		if((this.saudeFisica.equals("boa")) && (this.saudeMental.equals("boa"))) {
			return "boa";
		}else if((this.saudeFisica.equals("fraca")) && (this.saudeMental.equals("fraca"))){
			return "fraca";
		}else {
			return "ok";
		}
	}
}
