
public abstract class Autenticacao extends Cliente {
	
	protected double senha = 2222;
	
	public void autentica(double senha) {
		if(this.senha == senha) {
			System.out.println("AUTENTICADO!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
	}
	public String getNome() {
		return super.nome;
	}
	public String getCpf() {
		return super.cpf;
	}
	public String getProfissao() {
		return super.profissao;
	}
	public String getTelefone() {
		return super.telefone;
	}
	public void setNome(String nome) {
		super.nome = nome;
	}
	public void setCpf(String cpf) {
		super.cpf = cpf;
	}
	public void setProfissao(String profissao) {
		super.profissao = profissao;
	}
	public void setTelefone(String telefone) {
		super.telefone = telefone;
	}
}
