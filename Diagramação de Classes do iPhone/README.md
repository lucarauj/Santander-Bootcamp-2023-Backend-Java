```mermaid

Classe iPhone {
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
```