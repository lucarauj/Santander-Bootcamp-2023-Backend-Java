```mermaid
classDiagram
	class IPhone {
		- ReprodutorMusical
		- AparelhoTelefonico
		- NavegadorInternet
	}
	IPhone --> ReprodutorMusical : usa
	IPhone --> AparelhoTelefonico : usa
	IPhone --> NavegadorInternet : usa

	Interface ReprodutorMusical {
		+ tocar()
		+ pausar()
		+ selecionarMusica()
	}

	Interface AparelhoTelefonico {
		+ ligar(numero: String)
		+ atender()
		+ iniciarConversaVoz()
	}

	Interface NavegadorInternet {
		+ exibirPagina(url: String)
		+ adicionarNovaAba()
		+ atualizarPagina()
	}

```