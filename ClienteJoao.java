
public class ClienteJoao extends Residente {
	
	public static void main(String[] args) {
		
		ClienteJoao clienteJoao = new ClienteJoao();
		
		clienteJoao.setNome("João Pedro");
		clienteJoao.setCpf("333.333.333-45");
		clienteJoao.setProfissao("Mecanico");
		clienteJoao.setTelefone("51 9 8127-8182");
		clienteJoao.setQuarto(237);
		clienteJoao.setDivida(12, 300);
	}

}
