
public class Cliente extends Pessoa {

	// Constructor
	public Cliente(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	// Metodos
	@Override
	public String calcularIdade() {
		
		if (this.getIdade() < 16) {
			throw new RuntimeException(this.getNome() + " n�o poder� ter um cadastro devido idade ser menor do que 16 anos");
		}
		
		return getIdade() >= 16 && getIdade() < 18
				? "Cliente " + getNome() + " poder� ter um cadastro desde que tenha aprova��o de um respons�vel"
				: "Cliente " + getNome() + " poder� ter um cadastro sujeito a consulta SPC";
	}

}
