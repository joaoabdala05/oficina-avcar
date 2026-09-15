# Oficina AV.CAR

Projeto academico em Java para gerenciamento de uma oficina automotiva (auto center): clientes, veiculos, ordens de servico, pecas, fornecedores e colaboradores, com persistencia em banco de dados PostgreSQL via JDBC.

## Sobre o projeto

O AV.CAR esta sendo desenvolvido como projeto de estudo do curso de Analise e Desenvolvimento de Sistemas, com foco em aplicar conceitos de orientacao a objetos, arquitetura em camadas e estruturas de dados implementadas manualmente (sem depender das classes prontas do java.util para as operacoes de fila, ordenacao e busca).

O projeto esta em desenvolvimento: a arquitetura de pacotes ja esta definida e parte da base comum (camada de servico, modelo base e estruturas de dados) esta implementada, enquanto as classes de dominio especificas (Cliente, Veiculo, Ordem de Servico etc.) ainda estao em construcao.

## Objetivo

Construir um sistema de gestao de oficina mecanica que permita futuramente:

- Cadastrar e consultar clientes (pessoa fisica e juridica) e seus veiculos;
- Abrir, acompanhar e concluir ordens de servico;
- Controlar pecas, lotes de pecas e fornecedores;
- Gerenciar colaboradores e suas especialidades;
- Organizar a fila de atendimento/triagem de ordens de servico.

## Arquitetura

O projeto segue uma organizacao em camadas, inspirada em MVC, com os seguintes pacotes:

| Pacote | Responsabilidade |
| --- | --- |
| Model | Entidades do dominio (Cliente, Veiculo, OrdemServico, Peca, Colaborador etc.) e enums de apoio (StatusOS, Prioridade, StatusPeca, TipoFornecedor) |
| Repository | Acesso a dados via JDBC, com uma classe base generica (BaseRepository) que concentra o CRUD comum |
| Service | Regras de negocio, tambem com uma base generica (BaseService) que delega para o repository |
| Controller | Camada intermediaria entre a View e o Service |
| View | Telas da aplicacao (login, cadastro de clientes, veiculos, ordens de servico, fila) |
| Structure | Estruturas de dados implementadas manualmente: fila de triagem, ordenacao e busca de ordens de servico |
| Validation | Validadores de CPF, CNPJ, placa e dados de ordem de servico |
| Factory | Criacao de objetos (ex.: ClienteFactory) |
| Adapter | Adaptacao de resultados de consultas JDBC (ResultSetAdapter) |
| Config | Configuracao e fabrica de conexao com o banco (ConnectionFactory, DatabaseConfig) |
| Main | Ponto de entrada da aplicacao |

## O que ja esta implementado

- BaseModel: classe base para as entidades do sistema (id, datas de controle, flag de ativo).
- BaseRepository: estrutura generica para o CRUD via JDBC, usando generics para funcionar com qualquer entidade que estenda BaseModel (padrao Template Method).
- BaseService: camada de servico generica com os metodos salvar, buscarPorId, listarTodos, atualizar e excluir, delegando para o repository.
- ConnectionFactory: ponto central para a conexao JDBC com PostgreSQL (padrao Singleton).
- FilaTriagem: implementacao manual de uma fila FIFO (first in, first out), sem usar java.util.Queue, pensada para a triagem de ordens de servico ou veiculos.
- OrdenacaoOS: ordenacao manual de listas de OrdemServico usando o algoritmo Insertion Sort, por data de entrada ou por valor total.
- BuscaOS: busca linear manual de ordens de servico por numero da OS ou por placa do veiculo.

As demais classes (entidades de dominio, controllers, views, validacoes e o restante dos repositories/services especificos) ja tem seus arquivos e pacotes criados, mas ainda estao vazias, aguardando implementacao.
