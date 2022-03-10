package controller;
public class corrida {
	
	final static int num_sapos = 5;
	final static int distancia = 1000;
	public static void main (String[] args) {
		
		for (int i =1; i<= num_sapos; i++) {
			new sapocorrendoThread ("Sapo_"+i, distancia).start();
		}
	}
	
class sapocorrendoThread extends Thread {
	
		String nome;
		int distanciacorrida = 0;
		int distanciatotalcorrida;
		int pulo = 0;
		int pulos= 0;
		static int colocacao = 0;
		final static int pulo_maximo = 500;
		
		public sapocorrendoThread (String nome, int distanciatotalcorrida) {
		super(nome);
		this.distanciatotalcorrida = distanciatotalcorrida;
		this.nome = nome;
		}
		
		public void sapoimprimindosituacao () {
		System.out.println("O"+ nome + " pulou "+ "m /t e já percorreu"+distanciacorrida+ "m");
		}
		
		public void sapopulando (){
		pulos ++;
		pulo = (int) (Math.random()* pulo_maximo);
		distanciacorrida += pulo;
		if (distanciacorrida>distanciatotalcorrida) {
			distanciacorrida = distanciatotalcorrida;
		
		}
		
	}
	
	public void sapodescansando(){
		yield();
	}
	
	public void colocacaosapo () {
		colocacao++;
		System.out.println ("nome + " foi o " + colocacao + "° colocado com " + pulos + " pulos");
		
		public void run () {
		while (distanciacorrida < distanciatotalcorrida) {
			sapopulando();
			sapoimprimindosituacao();
			sapodescansando();
			
		}
		colocacaosapo();
		}
				

	}
	 
	
	

}
