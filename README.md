 Projeto de Cadastro de Produtos - Módulo 38 EBAC

Este repositório contém a solução para a tarefa do Módulo 38 do curso de Desenvolvedor Back-End Java da EBAC. O projeto consiste em uma aplicação web simples, porém completa, para o cadastro de produtos, utilizando um stack clássico de tecnologias Java para a web.

 Objetivo

O objetivo principal do projeto é demonstrar o conhecimento na construção de uma aplicação seguindo a arquitetura em camadas (MVC - Model-View-Controller) e a integração com um banco de dados relacional, cobrindo todo o fluxo desde a interface do usuário até a persistência dos dados.

 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e ferramentas:

Linguagem: Java 17
  Gerenciador de Dependências: Apache Maven
  Interface Web (View): Jakarta Server Faces (JSF) 4.0 com XHTML
  Persistência de Dados (Model): Jakarta Persistence API (JPA) 3.1
  Implementação do JPA: Hibernate 6.2
  Banco de Dados: PostgreSQL
  Injeção de Dependências (Controller): CDI (Contexts and Dependency Injection) com as anotações `@Named` e `@RequestScoped`.
  Servidor de Aplicação (para execução):** Apache Tomcat 10.1
  IDE de Desenvolvimento:** Spring Tool Suite (Eclipse)



 Estrutura do Projeto

O código está organizado em pacotes que representam as diferentes camadas da aplicação:

   `src/main/java`: Contém todo o código-fonte Java.
       `br.com.ebac.controller`: Camada responsável por intermediar a comunicação entre a visão (JSF) и o modelo de negócio.
      `br.com.ebac.service`: Camada que contém as regras de negócio da aplicação.
       `br.com.ebac.repository`: Camada de acesso aos dados, responsável pela comunicação com o banco de dados através do JPA.
       `br.com.ebac.entity`: Contém as classes de entidade que são mapeadas para as tabelas do banco de dados.
   `src/main/resources`: Contém os arquivos de configuração.
       `META-INF/persistence.xml`: Arquivo de configuração do JPA/Hibernate para conexão com o banco de dados.
   `src/main/webapp`: Contém as páginas web da aplicação.
       `cadastro.xhtml`: Tela de cadastro de produtos.


 Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo:

Pré-requisitos:
      Java 17 (ou superior) instalado.
       Maven instalado.
    
  PostgreSQL instalado e em execução.
       Um servidor de aplicação como Apache Tomcat 10.1.

Banco de Dados:
      Crie um banco de dados no PostgreSQL com o nome `db_modulo38`.
      Abra o arquivo `src/main/resources/META-INF/persistence.xml` e altere as propriedades `jakarta.persistence.jdbc.user` e `jakarta.persistence.jdbc.password` com suas credenciais do PostgreSQL.

  Build do Projeto:
       Clone este repositório.
      Navegue até a raiz do projeto e execute o comando Maven para gerar o pacote `.war`:
      bash
      mvn clean package
      `

   Deploy:
      Copie o arquivo `.war` gerado na pasta `target/` para a pasta `webapps/` do seu servidor Tomcat.
       Inicie o servidor Tomcat.

---

**Desenvolvido por:** Kaliton Oliveira
