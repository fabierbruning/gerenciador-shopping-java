# Gerenciador de Lojas de Shopping em Java

Projeto acadêmico desenvolvido em Java para simular o gerenciamento de lojas em um shopping center.

O sistema foi criado como parte de um desafio de Laboratório I, com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos, como classes, objetos, encapsulamento, associação entre classes, herança, polimorfismo e manipulação de arrays.

## Objetivo do Projeto

O objetivo do projeto é representar um sistema simples de gerenciamento de lojas de um shopping, permitindo trabalhar com diferentes tipos de lojas, produtos, endereços, datas e estoque.

O sistema possui classes para representar:

- Shopping
- Loja
- Produto
- Endereço
- Data
- Lojas especializadas, como lojas de cosméticos, vestuário, bijuteria, alimentação e informática

## Funcionalidades

O projeto possui as seguintes funcionalidades principais:

- Cadastro de lojas
- Cadastro de produtos
- Validação de datas
- Verificação de produto vencido
- Cálculo de gastos com salário dos funcionários
- Classificação do tamanho da loja conforme a quantidade de funcionários
- Controle de estoque de produtos usando arrays
- Inserção e remoção de produtos no estoque
- Cadastro de diferentes tipos de lojas usando herança
- Cadastro de shopping com várias lojas
- Inserção e remoção de lojas no shopping
- Contagem de lojas por tipo
- Busca da loja de informática com o seguro de eletrônicos mais caro

## Conceitos Utilizados

Durante o desenvolvimento do projeto, foram aplicados os seguintes conceitos:

- Programação Orientada a Objetos
- Classes e objetos
- Atributos e métodos
- Encapsulamento
- Métodos getters e setters
- Construtores
- Sobrecarga de construtores
- Método `toString()`
- Associação entre classes
- Herança
- Polimorfismo
- Arrays
- Estruturas condicionais
- Estruturas de repetição
- Entrada de dados com `Scanner`
- Validação de regras de negócio

## Estrutura do Projeto

```text
src/
└── shopping/
    ├── Principal.java
    ├── Loja.java
    ├── Produto.java
    ├── Endereco.java
    ├── Data.java
    ├── Shopping.java
    ├── Cosmetico.java
    ├── Vestuario.java
    ├── Bijuteria.java
    ├── Alimentacao.java
    └── Informatica.java