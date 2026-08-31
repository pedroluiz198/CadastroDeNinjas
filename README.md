# 🥷 Cadastro de Ninjas - API RESTful

API RESTful desenvolvida com Spring Boot para gerenciamento de Ninjas e suas respectivas Missões, com suporte a relacionamentos entre entidades do banco de dados.

---

## 🎓 Propósito do Projeto

Este projeto foi desenvolvido com fins educacionais para praticar e consolidar conceitos fundamentais do ecossistema **Java + Spring Boot**, incluindo:
* Arquitetura em camadas (**Controller**, **Service**, **Repository**, **Model**).
* Mapeamento objeto-relacional (ORM) com **Spring Data JPA** e anotações como `@ManyToOne`.
* Construção de uma **API RESTful** completa com operações CRUD.
* Testes de endpoints HTTP e envio de requisições JSON via **Postman**.

---

## 🛠️ Tecnologias Utilizadas

* **Java 23**
* **Spring Boot 4.1.1**
* **Spring Data JPA**
* **H2 Database** (Banco em memória)
* **Lombok**
* **Apache Tomcat**
* **Postman** (Testes de endpoints)

---

## 📌 Funcionalidades (CRUD Completo)

### 🗡️ Ninjas (`/ninjas`)
* `GET /ninjas/listar` - Lista todos os ninjas cadastrados.
* `GET /ninjas/listar/{id}` - Busca um ninja específico pelo ID.
* `POST /ninjas/criar` - Cadastra um novo ninja.
* `PUT /ninjas/alterar/{id}` - Atualiza os dados de um ninja existente.
* `DELETE /ninjas/deletar/{id}` - Deleta um ninja do banco de dados.

### 📜 Missões (`/missoes`)
* `GET /missoes/listar` - Lista todas as missões cadastradas.
* `GET /missoes/listar/{id}` - Busca uma missão específica pelo ID.
* `POST /missoes/criar` - Cadastra uma nova missão.
* `PUT /missoes/alterar/{id}` - Atualiza os dados de uma missão existente.
* `DELETE /missoes/deletar/{id}` - Deleta uma missão do banco de dados.

---

## 🗄️ Estrutura do Banco de Dados

A aplicação utiliza um relacionamento **`@ManyToOne`** entre **Ninja** e **Missão** (vários ninjas podem pertencer à mesma missão).

* **H2 Console:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:ninjadb`
* **User:** `SA`
* **Password:** *(deixar em branco)*

---

## 🚀 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone <URL_DO_SEU_REPOSITORIO>
