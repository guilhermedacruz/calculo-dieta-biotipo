public abstract class Paciente implements IPaciente  {
	protected String nome;
	protected double peso;
	//0 = metabolismo alto ; 1 = metabolismo baixo
	protected int [] metabolismo = {0, 1};
	//0 = estrutura �ssea estreita ; 1 = estrutura �ssea larga
	protected int [] estrutossea = {0, 1};
	/*0 = prote�nas ; 1 = carboidratos ;  2 = l�pidos */
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
			System.out.println("Seu biotipo � : Ectomorfo");
			System.out.println("Estrutura ossea : Estreita");
			System.out.println("Metabolismo : Alto");
			System.out.println("**RECOMENDA��ES: ***");
			System.out.println("- N�o exceder o volume de prote�nas");
			System.out.println("- Baixo volume de treinos");
			System.out.println("- dieta com balan�o calorio positivo");
		} else if ( metabolismo[1] == met && estrutossea[1] == estrutoss)  {
			System.out.println("Seu biotipo �:  Mesomorfo");
			System.out.println("Estrutura ossea : Larga");
			System.out.println("Metabolismo: baixo");
			System.out.println("**RECOMENDA��ES: ***");
			System.out.println("- Evitar est�mulo � insulina  ");
			System.out.println("- distribui��o correta dos alimentos");
			System.out.println("- manter o equil�brio dos macrosnutrientes");
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
		System.out.println("***INFORMA��ES B�SICAS: ***");
		System.out.println("Nome: " + this.nome);
		System.out.println("Peso: " + this.peso + "Kg");
	}
	@Override
	public void imprimirDados() {
		System.out.println("***DIETA POR BIOTIPO: ***");
		System.out.println("Valor energ�tico por dia: " + this.peso + "Kcal");
		System.out.println("Prote�nas: " + this.macros[0] + "g");
		System.out.println("Carboidratos: " + this.macros[1] + "g");
		System.out.println("L�pidios: " + this.macros[2] + "g");
		
	}

}
