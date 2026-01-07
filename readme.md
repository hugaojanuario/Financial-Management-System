📌 Sistema de Gerenciamento Financeiro
Relatórios Financeiros por Intervalo de Tempo
📖 Descrição Geral

Este projeto consiste no desenvolvimento de um sistema backend de gerenciamento financeiro, utilizando Java e Spring Boot, com o objetivo de registrar operações financeiras (receitas e despesas) e gerar relatórios financeiros completos com base em um intervalo de tempo definido pelo usuário.

O sistema expõe uma API REST, seguindo boas práticas de arquitetura, organização de código, separação de responsabilidades e escalabilidade.

🎯 Objetivo do Projeto

Permitir que usuários:

Cadastrem e gerenciem suas receitas e despesas

Classifiquem operações por categorias

Consultem relatórios financeiros detalhados dentro de um intervalo de datas

Visualizem totais e saldo financeiro consolidado

⚙️ Funcionalidades
👤 Usuário

Cadastro de usuários

Identificação do usuário responsável pelas operações financeiras

Um usuário pode possuir várias operações financeiras

💰 Operações Financeiras

O sistema trabalha com dois tipos de operações:

Receita

Despesa

Cada operação financeira contém:

Descrição

Valor

Data da operação

Tipo da operação (receita ou despesa)

Categoria associada

Usuário responsável

🏷️ Categorias

Cadastro de categorias financeiras

Exemplos: Alimentação, Transporte, Lazer, Salário, Aluguel

Toda operação financeira deve estar vinculada a uma categoria

📊 Relatórios Financeiros (Funcionalidade Principal)

O sistema permite a geração de relatórios financeiros com base em:

Intervalo de tempo (data inicial e data final)

Usuário específico

O relatório financeiro deve apresentar:

Lista de todas as operações no período informado

Separação entre receitas e despesas

Total de receitas no período

Total de despesas no período

Saldo final do período (receitas − despesas)

Agrupamento opcional dos valores por categoria

## 🧱 Estrutura do Projeto

```text
finance-manager/
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── seuusuario/
        │           └── financemanager/
        │               ├── FinanceManagerApplication.java
        │               │
        │               ├── controller/
        │               │   ├── UsuarioController.java
        │               │   ├── OperacaoController.java
        │               │   ├── CategoriaController.java
        │               │   └── RelatorioController.java
        │               │
        │               ├── service/
        │               │   ├── UsuarioService.java
        │               │   ├── OperacaoService.java
        │               │   ├── CategoriaService.java
        │               │   └── RelatorioService.java
        │               │
        │               ├── repository/
        │               │   ├── UsuarioRepository.java
        │               │   ├── OperacaoRepository.java
        │               │   └── CategoriaRepository.java
        │               │
        │               ├── entity/
        │               │   ├── Usuario.java
        │               │   ├── OperacaoFinanceira.java
        │               │   └── Categoria.java
        │               │
        │               ├── dto/
        │               │   ├── UsuarioDTO.java
        │               │   ├── OperacaoRequestDTO.java
        │               │   ├── OperacaoResponseDTO.java
        │               │   └── RelatorioDTO.java
        │               │
        │               ├── exception/
        │               │   ├── BusinessException.java
        │               │   ├── ResourceNotFoundException.java
        │               │   └── GlobalExceptionHandler.java
        │               │
        │               └── config/
        │                   ├── SwaggerConfig.java
        │                   └── SecurityConfig.java
        │
        └── resources/
            ├── application.yml
            └── data.sql
```

🧠 Modelo Conceitual
Usuário

Identificador único

Nome

Email

Lista de operações financeiras

Operação Financeira

Identificador único

Descrição

Valor

Data da operação

Tipo (Receita ou Despesa)

Categoria

Usuário

Categoria

Identificador único

Nome

Tipo opcional (Receita / Despesa / Ambos)

📏 Regras de Negócio

Toda operação financeira deve pertencer a um usuário

Toda operação financeira deve possuir uma categoria

Valores não podem ser negativos

A permissão para datas futuras é uma decisão de projeto

Relatórios devem respeitar rigorosamente o intervalo de datas informado

Dados de usuários diferentes não devem ser misturados

🔄 Fluxo de Funcionamento

Usuário é cadastrado no sistema

Categorias financeiras são criadas

Usuário registra receitas e despesas

Usuário solicita um relatório informando um intervalo de datas

O sistema retorna o relatório financeiro consolidado

🛠️ Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

Bean Validation

Banco de dados relacional (H2 ou PostgreSQL)

Swagger para documentação da API
