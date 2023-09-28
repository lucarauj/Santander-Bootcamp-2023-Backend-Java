## Desafio de Modelagem e diagramação UML e Código - IPhone.

<br>

Elabore a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone: 

- Reprodutor Musicial: tocar, pausar, selecionarMusica
- Aparelho Telefônico: ligar, atender, iniciarCorreioVoz
- Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina 

Em seguida crie as classes e interfaces no formato de arquivos ```.java```.

<br>

## Diagrama UML


```mermaid
classDiagram
	class IPhone {
		- ReprodutorMusical
		- AparelhoTelefonico
		- NavegadorInternet
	}

	class ReprodutorMusical {
		+ tocar()
		+ pausar()
		+ selecionarMusica()
	}

	class AparelhoTelefonico {
		+ ligar(numero: String)
		+ atender()
		+ iniciarConversaVoz()
	}

	class NavegadorInternet {
		+ exibirPagina(url: String)
		+ adicionarNovaAba()
		+ atualizarPagina()
	}

	IPhone ..|> ReprodutorMusical : implements
	IPhone ..|> AparelhoTelefonico : implements
	IPhone ..|> NavegadorInternet : implements
```

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

