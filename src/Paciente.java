public abstract class Paciente implements IPaciente  {
	protected String nome;
	protected double peso;
	//0 = metabolismo alto ; 1 = metabolismo baixo
	protected int [] metabolismo = {0, 1};
	//0 = estrutura óssea estreita ; 1 = estrutura óssea larga
	protected int [] estrutossea = {0, 1};
	/*0 = proteínas ; 1 = carboidratos ;  2 = lípidos */
	protected double [] macros = {0 , 1 ,2}; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public void definirBiotipo(int met, int estrutoss) {
		if(metabolismo[0] == met && estrutossea[0] == estrutoss) {
			System.out.println("Seu biotipo é : Ectomorfo");
			System.out.println("Estrutura ossea : Estreita");
			System.out.println("Metabolismo : Alto");
			System.out.println("**RECOMENDAÇÕES: ***");
			System.out.println("- Não exceder o volume de proteínas");
			System.out.println("- Baixo volume de treinos");
			System.out.println("- dieta com balanço calorio positivo");
		} else if ( metabolismo[1] == met && estrutossea[1] == estrutoss)  {
			System.out.println("Seu biotipo é:  Mesomorfo");
			System.out.println("Estrutura ossea : Larga");
			System.out.println("Metabolismo: baixo");
			System.out.println("**RECOMENDAÇÕES: ***");
			System.out.println("- Evitar estímulo à insulina  ");
			System.out.println("- distribuição correta dos alimentos");
			System.out.println("- manter o equilíbrio dos macrosnutrientes");
		} else {
			System.out.println("Erro");
		}
		
	}
	@Override
	public void calcMesomorfo() {
		this.peso *= 25;
		macros[0] = this.peso * 0.04;
		macros[1] = this.peso * 0.04;;
		macros[2] = this.peso * 0.02;	
	}
	@Override
	public void calcEctomorfo() {
		this.peso *= 50;
		macros[0] = this.peso * 0.02;
		macros[1] = this.peso * 0.06;
		macros[2] = this.peso * 0.02;
	}
	
	@Override
	public void imprimirInfos() {
		System.out.println("***INFORMAÇÕES BÁSICAS: ***");
		System.out.println("Nome: " + this.nome);
		System.out.println("Peso: " + this.peso + "Kg");
	}
	@Override
	public void imprimirDados() {
		System.out.println("***DIETA POR BIOTIPO: ***");
		System.out.println("Valor energético por dia: " + this.peso + "Kcal");
		System.out.println("Proteínas: " + this.macros[0] + "g");
		System.out.println("Carboidratos: " + this.macros[1] + "g");
		System.out.println("Lípidios: " + this.macros[2] + "g");
		
	}

}
