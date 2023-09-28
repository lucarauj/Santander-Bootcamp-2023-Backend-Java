# Banco de Dados NoSQL

<br>

## Tipos

- Key-Value
- Documento
- Coluna
- Grafos
- outros

<br>

## MongoDB

- orientado a documentos
- escalabilidade horizontal
- documentos: armazenados em Binary JSON (BSON)
- tipos de dados simples: String, Number, Boolean, Date, Null, ObjectId
- tipos de dados complexos: Array, Documento Embutido, Referência, GeoJSON
- Formatador JSON: https://jsonformatter.curiousconcept.com/

<br>

## Modelagem de dados (MongoDB)

<br>

- Modelagem de Dados Aninhada: 
```
Documentos podem conter documentos BSON ou arrays de documentos BSON, adequados para dados complexos e aninhados.
```

- Modelagem de Dados por Referência: 
```
Usada para estabelecer relacionamentos entre documentos em coleções diferentes usando referências.
```

- Modelagem de Dados Denormalizada: 
```
Envolve a incorporação de informações redundantes em um documento para melhorar o desempenho de leitura.
```

<br>

## Operações no MongoDB

<br>

```
- Inserindo documento: 
```
- insertOne({})
- insertMany([{}])

<br>

```
- Consultando documento: 
```
- find({}) 
- findOne({}) 
- findOneAndUpdate({}) 
- findOneAndDelete({})

<br>

```
- Excluindo documento: 
```
- deleteOne({}) 
- deleteMany({})

<br>

## Operadores

<br>

```
- Igualdade: 
```
- find({"endereco.cidade": "São Paulo"})

<br>

```
- Lógicos: 
```
- $and --> {$and: [{idade: 20}, {nome: "Carlos"}]}
- $or --> {$or: [{idade: 20}, {nome: "Carlos"}]} 
- $not

<br>

```
- Comparação:
```
- $eq: == --> {$and: [{idade: {$eq: 20}}, {nome: "Carlos"}]}
- $ne: !=
- $gt: > --> {idade: {$gt: 18}}
- $gte: >=
- $lt: <
- $lte: <=
- $in: [] --> {cidade: {$in: ["São Paulo", "Belo Horizonte"]}}
- $nin: []

<br>

```
- Paginação:
```
- find().skip(10).limit(5)

<br>

## Redis

- Sistema de armazenamento de dados em memória de alto desempenho.

<br>

```
Principais comandos
```
- SET - Define um valor para uma chave.
- GET - Recupera o valor associado a uma chave.
- DEL - Exclui uma ou mais chaves.
- EXISTS - Verifica se uma chave existe.
- KEYS - Recupera chaves que correspondem a um padrão.
- INCR - Incrementa o valor de uma chave numérica.
- DECR - Decrementa o valor de uma chave numérica.

<br>

## Diferença entre o MongoDB x Redis:
```
MongoDB:
```
- Banco de dados NoSQL orientado a documentos.
- Armazena dados em documentos semelhantes a JSON (BSON).
- Ótimo para aplicativos que precisam de flexibilidade na - estrutura de dados, como aplicativos da web com esquemas variáveis.
- Bom para consultas complexas e análise de dados.
- Melhor escolha para armazenar grandes volumes de dados estruturados ou semiestruturados.

<br>

```
Redis:
```
- Banco de dados NoSQL em memória.
- Armazena dados na RAM para acesso ultrarrápido.
- É um armazenamento chave-valor, onde os dados são associados a chaves únicas.
- Excelente para armazenar dados em cache, como resultados de consultas frequentes ou sessões de usuário.
- Amplamente usado para filas de mensagens, gerenciamento de sessões, armazenamento em cache e contagem de visualizações em tempo real.