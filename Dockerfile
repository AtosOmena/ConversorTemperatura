# Imagem base com Maven e JDK 17
FROM maven:3.9-eclipse-temurin-17 AS builder

# Diretório de trabalho no container
WORKDIR /app

# Copia os arquivos do projeto para o container
COPY pom.xml .
COPY src ./src

# Executa o build e os testes
RUN mvn clean package
