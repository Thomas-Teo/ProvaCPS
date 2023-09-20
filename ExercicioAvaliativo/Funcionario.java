package ExercicioAvaliativo;

public class Funcionario extends Pessoa {

	// Constructor
	public Funcionario(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	// Metodos
	@Override
	public String calcularIdade() {
		
		if (this.getIdade() < 16) {
			throw new RuntimeException(this.getNome() + " não poderá ter um vincula a empresa, sua idade é menor que 16");
		}
		
		return getIdade() >= 16 && getIdade() < 18 
				? "Colaborador " + getNome() + " poderá ser vinculado a empresa como menor aprendiz"
				: "Colaborador " + getNome() + " poderá ser vinculado a empresa com contrato efetivo";
	}

}
