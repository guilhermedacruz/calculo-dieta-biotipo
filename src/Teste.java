
public class Teste {
	public static void main(String[] args) {
		Paciente p1 = new BiotipoEctomorfo();
		p1.setNome("Felipe");
		p1.setPeso(100.0);
		p1.imprimirInfos();
		p1.definirBiotipo(1, 1);
		p1.calcMesomorfo();
		p1.imprimirDados();
		
	}
}
