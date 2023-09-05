# Sistema de Gerenciamento de Banco de Dados (SGBD)

<br>

## Funcionalidades básicas

- C reate
- R ead
- U pdate
- D elete

<br>

## Transações

- A tomicidade
- C onsistência
- I solamento
- D urabilidade

<br>

## Organização SQL

- DQL | Consulta | SELECT
- DML | Manipulação | INSERT, UPDATE, DELETE
- DDL | Definição | CREATE, ALTER, DROP
- DCL | Controle | GRANT, REVOKE
- DTL | Transação | BEGIN, COMMIT, ROLLBACK

<br>

## Modelagem

- https://creately.com/
- https://app.quickdatabasediagrams.com/
- Cardinalidade [ 1..1 | 1..n | n..n ]

<br>

## Tipos de dados e parâmetros nos Banco de Dados 

- Inteiro (Integer)
- Decimal/Numérico (Decimal/Numeric)
- Caractere/Varchar (Character/Varchar)
- Data/Hora (Date/Time)
- Booleano (Boolean)
- Texto longo (text)
- Restrições de valor (NOT NULL | UNIQUE | DEFAULT)
- Chaves primárias e estrangeiras
- Auto incremento

<br>

## Comando SELECT - Operadores

- =
- <> ou !=
- >
- <
- >=
- <=
- LIKE (comparação de padrões)
- IN (pertence a uma lista de valores)
- BETWEEN (dentro de um intervalo)
- AND
- OR

<br>

## Alterando e excluindo tabelas

- ALTER TABLE {nome}
- DROP TABLE {nome}

<br>

## Chaves primárias e estrangeiras

```
(ID PRIMARY KEY AUTOINCREMENT,
chave_estrangeira INT,
FOREIGN KEY(chave_estrangeira) REFERENCES {outra tabela} (id)
);
```

- ON DELETE | ON UPDATE | CASCADE | SET NULL | SET DEFAULT | RESTRICT

<br>

## Normalização de dados


- 1ª Forma Normal (1FN):

Garante a atomicidade dos dados, o que significa que cada valor em uma coluna deve ser indivisível. Isso evita que você tenha múltiplos valores ou estruturas complexas em uma única célula da tabela. Cada célula deve conter um único valor ou item de dados.

- 2ª Forma Normal (2FN):

Além de atender à 1FN, a 2FN se concentra na dependência funcional dos dados. Isso significa que, para alcançar a 2FN, você deve garantir que todos os atributos (colunas não chave) de uma tabela dependam completamente da chave primária. Ou seja, cada coluna não chave deve ser diretamente associada à chave primária e não a apenas parte dela. Isso ajuda a eliminar redundâncias e a garantir que os dados estejam bem estruturados.

- 3ª Forma Normal (3FN):

Além de atender à 2FN, a 3FN vai um passo adiante. Ela exige que nenhuma coluna não chave dependa de outra coluna não chave. Isso significa que não deve haver dependências transitivas entre as colunas não chave. A 3FN ajuda a evitar problemas de redundância e reduz a possibilidade de anomalias de atualização nos dados.

<br>

## JOINs

- Usadas no SQL para combinar dados de 2 ou mais tabelas relacionadas;
- INNER JOIN: : Retorna apenas registros que têm correspondência nas duas tabelas;
- LEFT JOIN ou LEFT OUTER JOIN: Retorna todos os registros da tabela da esquerda e os correspondentes da tabela da direita (ou NULL se não houver correspondência);
- RIGHT JOIN ou RIGHT OUTER JOIN: Retorna todos os registros da tabela da direita e os correspondentes da tabela da esquerda (ou NULL se não houver correspondência);
- FULL JOIN ou FULL OUTER JOIN: Retorna todos os registros de ambas as tabelas, preenchendo com NULL onde não houver correspondência em uma ou ambas as tabelas.

<br>

## Sub consultas

- SELECT
- FROM
- WHERE
- HAVING
- JOIN

<br>

## Funções agregadas e Agrupamentos de dados

- COUNT: Conta o número de linhas que atendem a uma condição.
- SUM: Calcula a soma dos valores em uma coluna numérica.
- AVG: Calcula a média dos valores em uma coluna numérica.
- MIN: Retorna o valor mínimo em uma coluna.
- MAX: Retorna o valor máximo em uma coluna.

<br>

## Agrupamento e Ordenação de resultados

- SELECT
- FROM
- GROUP BY
- ORDER BY

<br>

## Índices

- select_type: Indica o tipo de operação de seleção de dados, como uma consulta simples (SIMPLE), uma subconsulta (SUBQUERY) ou uma junção (JOIN).

- table: Mostra a tabela envolvida na consulta ou operação em questão.

- type: Refere-se ao método de acesso aos dados, podendo ser "ALL" para uma leitura completa da tabela ou "INDEX" quando um índice é utilizado para otimizar a consulta.

- possible_keys: Lista os índices que podem ser considerados para a consulta, mas que não necessariamente foram utilizados.

- key: Indica o índice que efetivamente foi escolhido para a consulta.

- key_len: Indica o tamanho do índice utilizado na consulta.

- ref: Se a consulta envolve uma junção, este campo mostra a coluna na qual a tabela é referenciada pela chave.

- rows: Mostra o número estimado de linhas que a consulta irá examinar ou processar. Quanto menor esse número, mais eficiente é a consulta.

<br>

## 👨‍🎓 Autor

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
