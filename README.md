# 💰 OperacoesBancarias-Spring

API REST desenvolvida em Java com Spring Boot, evoluída a partir de um sistema bancário console para uma arquitetura backend profissional.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.5
- Spring Web (API REST)
- Spring DevTools
- Maven
- BigDecimal (precisão financeira)

---

## 🏗️ Arquitetura

```
src/main/java/dev/kelvin/operacoesbancarias/
│
├── app/         → Ponto de entrada (OperacoesBancariasSpringApplication)
├── controller/  → Camada HTTP (ContaController)
├── service/     → Regras de negócio (ContaService)
├── model/       → Entidade de domínio (Conta)
└── exception/   → Exceções customizadas e tratamento global
```

---

## 📡 Endpoints Disponíveis

### Consultar Saldo
```
GET /conta/saldo
```
**Resposta:**
```json
{
  "saldo": 0
}
```

---

### Realizar Depósito
```
POST /conta/depositar?valor=500
```
**Resposta:**
```json
{
  "mensagem": "Depósito realizado com sucesso",
  "saldo": 500
}
```

---

### Realizar Saque
```
POST /conta/sacar?valor=200
```
**Resposta:**
```json
{
  "mensagem": "Saque realizado com sucesso",
  "saldo": 300
}
```

---

### Erros Tratados

Saldo insuficiente:
```json
{
  "erro": "Saldo insuficiente para saque."
}
```

Valor inválido:
```json
{
  "erro": "O valor deve ser maior que zero."
}
```

---

## ▶️ Como Executar Localmente

### Pré-requisitos
- Java 17+
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/Kxllvin/OperacoesBancarias-Spring.git

# Acesse a pasta
cd OperacoesBancarias-Spring

# Execute a aplicação
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## 🧪 Testando os Endpoints

Recomendado usar **Postman** ou **Insomnia** para testar os endpoints POST.

Para o endpoint GET, basta acessar diretamente no navegador:
```
http://localhost:8080/conta/saldo
```

---

## 💡 Conceitos Aplicados

- API REST com Spring Boot
- Arquitetura em camadas (Controller → Service → Model)
- Tratamento global de exceções com `@RestControllerAdvice`
- Respostas em JSON com `ResponseEntity`
- Uso de `BigDecimal` para precisão em operações financeiras
- Boas práticas de encapsulamento

---

## 📈 Roadmap

- [x] Estrutura em camadas
- [x] API REST com endpoints JSON
- [x] Exceções customizadas
- [x] Tratamento global de erros HTTP
- [ ] Testes automatizados com JUnit
- [ ] Persistência com banco de dados H2
- [ ] Migração para PostgreSQL
- [ ] Deploy na nuvem

---

## 🔗 Projeto Base

Este projeto é a evolução do [OperacoesBancarias](https://github.com/Kxllvin/OperacoesBancarias), originalmente desenvolvido como aplicação console.

---

## 👨‍💻 Autor

Kelvin Alves  
[GitHub](https://github.com/Kxllvin) 
