📌 ENUNCIADO DO PROJETO
Sistema de Gerenciamento Financeiro com Relatórios por Intervalo de Tempo
1️⃣ DESCRIÇÃO GERAL

Desenvolver um sistema backend de gerenciamento financeiro, utilizando Java e Spring Boot, capaz de registrar operações financeiras (receitas e despesas) e gerar relatórios financeiros completos com base em um intervalo de tempo definido pelo usuário.

O sistema deverá expor uma API REST, seguindo boas práticas de arquitetura, organização de código e separação de responsabilidades.

2️⃣ FUNCIONALIDADES OBRIGATÓRIAS
2.1 Usuário

Cadastrar usuário

Identificar o usuário responsável pelas operações financeiras

Um usuário pode possuir várias operações financeiras

2.2 Operações Financeiras

O sistema deverá tratar operações financeiras de dois tipos:

Receita

Despesa

Cada operação financeira deve possuir:

Descrição

Valor

Data da operação

Tipo da operação (receita ou despesa)

Categoria

Usuário associado

2.3 Categorias

Cadastro de categorias financeiras

Exemplo: Alimentação, Transporte, Lazer, Salário, Aluguel

Cada operação deve obrigatoriamente possuir uma categoria

2.4 Relatórios Financeiros (PONTO CENTRAL DO PROJETO ❗)

O sistema deverá permitir gerar relatórios financeiros com base em:

Intervalo de tempo (data inicial e data final)

Usuário específico

O relatório deverá conter:

Todas as operações financeiras no período

Separação entre receitas e despesas

Total de receitas no período

Total de despesas no período

Saldo final do período (receitas − despesas)

Agrupamento opcional por categoria

3️⃣ REQUISITOS NÃO FUNCIONAIS

API RESTful

Padrão MVC adaptado para REST

Uso de DTOs para entrada e saída de dados

Validação de dados de entrada

Tratamento global de exceções

Código organizado, legível e escalável

Banco de dados relacional

4️⃣ ESTRUTURA DE PACOTES (OBRIGATÓRIA)
finance-manager/
 └── src/
     └── main/
         ├── java/
         │   └── com/
         │       └── seuusuario/
         │           └── financemanager/
         │               ├── FinanceManagerApplication
         │               │
         │               ├── controller
         │               │   ├── UsuarioController
         │               │   ├── OperacaoController
         │               │   ├── CategoriaController
         │               │   └── RelatorioController
         │               │
         │               ├── service
         │               │   ├── UsuarioService
         │               │   ├── OperacaoService
         │               │   ├── CategoriaService
         │               │   └── RelatorioService
         │               │
         │               ├── repository
         │               │   ├── UsuarioRepository
         │               │   ├── OperacaoRepository
         │               │   └── CategoriaRepository
         │               │
         │               ├── entity
         │               │   ├── Usuario
         │               │   ├── OperacaoFinanceira
         │               │   └── Categoria
         │               │
         │               ├── dto
         │               │   ├── UsuarioDTO
         │               │   ├── OperacaoRequestDTO
         │               │   ├── OperacaoResponseDTO
         │               │   └── RelatorioDTO
         │               │
         │               ├── exception
         │               │   ├── BusinessException
         │               │   ├── ResourceNotFoundException
         │               │   └── GlobalExceptionHandler
         │               │
         │               └── config
         │                   ├── SwaggerConfig
         │                   └── SecurityConfig (futuro)
         │
         └── resources/
             ├── application.yml
             └── data.sql (opcional)

5️⃣ MODELO CONCEITUAL (ENTIDADES)
Usuário

Identificador único

Nome

Email

Lista de operações financeiras

Operação Financeira

Identificador único

Descrição

Valor

Data

Tipo (Receita ou Despesa)

Categoria

Usuário

Categoria

Identificador único

Nome

Tipo opcional (Receita / Despesa / Ambos)

6️⃣ REGRAS DE NEGÓCIO (NÃO ESQUECER ❗)

Uma operação SEMPRE pertence a um usuário

Uma operação SEMPRE possui uma categoria

Valores não podem ser negativos

Datas futuras podem ser permitidas ou não (decisão de projeto)

Relatórios devem respeitar rigorosamente o intervalo informado

O sistema não deve misturar dados de usuários diferentes

7️⃣ RELATÓRIO FINANCEIRO – DETALHAMENTO
Entrada do relatório:

ID do usuário

Data inicial

Data final

Saída esperada:

Lista de operações no período

Total de receitas

Total de despesas

Saldo do período

Totais agrupados por categoria (opcional)

8️⃣ FLUXO DE FUNCIONAMENTO

Usuário é cadastrado

Categorias são criadas

Usuário registra receitas e despesas

Usuário solicita relatório informando um intervalo de datas

Sistema retorna o relatório financeiro consolidado

9️⃣ TECNOLOGIAS SUGERIDAS

Java 17+

Spring Boot

Spring Web

Spring Data JPA

Validation

Banco relacional (H2 / PostgreSQL)

Swagger para documentação