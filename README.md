# SpringBoot-Api

Este projeto implementa uma API RESTful utilizando Spring Boot para gerenciar produtos. Ele oferece operações básicas como criar, ler, atualizar e deletar (CRUD) produtos em um sistema.

## 🚀 Início

Estas instruções permitirão que você obtenha uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- Um IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (opcional, mas recomendado)

### 🔧 Instalação

Siga os passos abaixo para configurar e executar o projeto localmente:

Clone o repositório:

```bash
# Clone o repositório
$ git clone https://github.com/GabrielFeijo/SpringBoot-Api
```

Abra o projeto na sua IDE favorita (se estiver usando uma).

Build do projeto:

```bash
$ mvn clean install
```

Execute o projeto:

O Spring Boot cria automaticamente um servidor local Tomcat incorporado. Depois de iniciar a aplicação, você poderá acessar os endpoints da API.

## 📦 Utilização

Acesse os seguintes endpoints da API para gerenciar produtos:

- GET /api/v1/products: Retorna todos os produtos.
- GET /api/v1/products/{id}: Retorna um produto específico pelo ID.
- POST /api/v1/products: Adiciona um novo produto.
- PUT /api/v1/products: Atualiza um produto existente.
- DELETE /api/v1/products/{id}: Deleta um produto pelo ID.

## 🎓 Motivação

Este projeto foi desenvolvido para relembrar e praticar a utilização do Spring Boot após um período totalmente focado em JavaScript/TypeScript.

## 🛠️ Feito utilizando

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="40" height="45" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="40" height="45" /> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" width="40" height="45" />
