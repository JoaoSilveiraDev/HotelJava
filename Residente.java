
public class Residente extends Cliente {
	
	protected double quarto;
	protected double divida;
	
	public double getDivida() {
		return this.divida;
	}
	public double getQuarto() {
		return this.quarto;
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
	public void setQuarto(double quarto) {
		this.quarto = quarto;
	}
	public void setDivida(double dias, double valor) {
		this.divida = dias * valor;
	}
}
