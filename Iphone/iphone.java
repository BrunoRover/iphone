package Iphone;

public class iphone implements aparelhoTelefonico, navegadorNaInternet, reprodutorMusical {
	public void tocar() {
		System.out.println("tocando musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("selecionando musica" + musica);
		
	}

	@Override
	public void pausar() {
		System.out.println("musica pausada");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("exibindo pagina" + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("adcionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ataulizando pagina");
		
	}

	@Override
	public void atender() {
		System.out.println("atender chamada");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("ligando para" + numero);
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
		
	}
	
}
