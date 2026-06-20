# 📝 Blog API — Spring Boot + MongoDB

API REST para gerenciamento de um blog, com posts, usuários, comentários e busca textual. Desenvolvida em Java com Spring Boot e MongoDB, containerizada com Docker e publicada em produção.

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-Atlas-green)](https://www.mongodb.com/atlas)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue)](https://www.docker.com/)

---

## 🚀 Demo

A API está em produção e pode ser testada diretamente:

🔗 **https://curso-projeto-mongo.onrender.com**

> ⚠️ A aplicação está hospedada no plano gratuito do Render. A primeira requisição após um período de inatividade pode levar de 30 a 50 segundos para responder, pois o serviço "dorme" quando não está em uso.

### Endpoints principais

| Método | Rota                | Descrição                          |
|--------|---------------------|-------------------------------------|
| GET    | `/posts`             | Lista todos os posts                |
| GET    | `/posts/{id}`        | Busca um post por ID                |
| GET    | `/users`             | Lista todos os usuários             |
| GET    | `/users/{id}`        | Busca um usuário por ID             |

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **Spring Boot** — framework principal da aplicação
- **Spring Data MongoDB** — persistência de dados
- **MongoDB Atlas** — banco de dados na nuvem
- **Docker / Docker Compose** — containerização
- **Render** — deploy e hospedagem da API
- **Maven** — gerenciamento de dependências

---

## 📦 Estrutura do projeto

```
src/main/java/com/lucileudo/workshopmongo
├── config              # Configurações da aplicação (ex: instanciação de dados)
├── domain              # Entidades de domínio (Post, User)
├── dto                 # Objetos de transferência de dados (DTOs)
├── repository          # Interfaces de acesso ao MongoDB
├── resources           # Controladores REST (endpoints da API)
│   ├── exception       # Tratamento global de exceções
│   └── util            # Classes utilitárias
└── services            # Regras de negócio
    └── exception       # Exceções customizadas de serviço
```

---

## 🐳 Como executar localmente com Docker

### Pré-requisitos
- [Docker Desktop](https://www.docker.com/products/docker-desktop/) instalado e em execução

### Passos

```bash
# Clone o repositório
git clone https://github.com/Lucileudo-Lopes/blog-api-spring-mongodb.git
cd blog-api-spring-mongodb

# Suba a aplicação e o banco de dados juntos
docker compose up --build
```

A API estará disponível em:
```
http://localhost:8080
```

O MongoDB sobe automaticamente em um container separado, sem necessidade de instalação manual.

### Comandos úteis

| Comando                          | Descrição                                      |
|-----------------------------------|------------------------------------------------|
| `docker compose up --build`       | Sobe os containers e reconstrói as imagens      |
| `docker compose up -d`            | Sobe os containers em background                |
| `docker compose down`             | Para e remove os containers                      |
| `docker compose logs -f app`      | Exibe os logs da aplicação em tempo real         |

---

## ⚙️ Variáveis de ambiente

| Variável                     | Descrição                                  | Exemplo                                                            |
|-------------------------------|---------------------------------------------|---------------------------------------------------------------------|
| `SPRING_DATA_MONGODB_URI`     | String de conexão com o MongoDB             | `mongodb+srv://usuario:senha@cluster.mongodb.net/workshop_mongo`     |

Em ambiente local via Docker Compose, essa variável já é configurada automaticamente para apontar para o container do MongoDB.

---

## 💻 Executando sem Docker (modo desenvolvimento)

Caso prefira rodar a aplicação diretamente com Java/Maven:

```bash
# Instale e rode um MongoDB local na porta padrão 27017
# Em seguida:
./mvnw spring-boot:run
```

A aplicação usará a configuração padrão definida em `application.properties`, apontando para `localhost:27017`.

---

## 📌 Funcionalidades

- CRUD completo de **posts** e **usuários**
- Sistema de **comentários** vinculados a posts
- **Busca textual** por título e conteúdo usando queries customizadas do MongoDB
- Tratamento de exceções centralizado com respostas de erro padronizadas

---

## 👤 Autor

**Lucileudo Lopes**

[![GitHub](https://img.shields.io/badge/GitHub-Lucileudo--Lopes-181717?logo=github)](https://github.com/Lucileudo-Lopes)

---

## 📄 Licença

Este projeto é de uso educacional e está disponível livremente para fins de estudo e portfólio.
