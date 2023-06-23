
public class Gerente extends Autenticacao {
	
	public static void main(String[] args) {
		
		Gerente gerenteJoao = new Gerente();
		
		gerenteJoao.setNome("João Vitor");
		gerenteJoao.setCpf("222.222.222-00");
		gerenteJoao.setProfissao("Programador");
		gerenteJoao.setTelefone("51 99543-4353");
		gerenteJoao.autentica(2222);
		
		System.out.println(gerenteJoao.getNome()); 
		System.out.println(gerenteJoao.getCpf()); 
		System.out.println(gerenteJoao.getProfissao()); 
		System.out.println(gerenteJoao.getTelefone()); 
	}

}
