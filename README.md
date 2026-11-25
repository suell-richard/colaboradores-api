# Colaboradores API

API REST desenvolvida em Java com Spring Boot para gerenciamento de colaboradores.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Maven
- Banco de dados H2
- Insomnia (testes das requisições)

## Funcionalidades

- Cadastrar colaboradores.
- Listar todos os colaboradores.
- Buscar colaborador por ID.
- Atualizar dados de um colaborador.
- Excluir colaboradores.
- Tratamento básico de exceções.

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/colaboradores` | Cadastrar colaborador |
| GET | `/colaboradores` | Listar colaboradores |
| GET | `/colaboradores/{id}` | Buscar por ID |
| PUT | `/colaboradores/{id}` | Atualizar colaborador |
| DELETE | `/colaboradores/{id}` | Excluir colaborador |

## Exemplo de cadastro

**POST** `/colaboradores`

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "cargo": "Desenvolvedor",
  "setor": "Tecnologia"
}
```

## Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/suell-richard/colaboradores-api.git
```

2. Entre na pasta:

```bash
cd colaboradores-api
```

3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

No Windows, utilize:

```bash
mvnw.cmd spring-boot:run
```

4. A API estará disponível em:

`http://localhost:8080/colaboradores`

## Banco de dados

O projeto utiliza o banco H2 em memória, configurado para execução local.

## Autor

Desenvolvido por **Suell Richard** como projeto prático de Java e Spring Boot.