```mermaid
classDiagram
	class IPhone {
		- ReprodutorMusical
		- AparelhoTelefonico
		- NavegadorInternet
	}

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

	IPhone --> ReprodutorMusical : has
	IPhone --> AparelhoTelefonico : has
	IPhone --> NavegadorInternet : has

```