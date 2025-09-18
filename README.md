API Gestão de Tarefas

API desenvolvida para gerenciamento de tarefas, permitindo criar, listar, editar e excluir tarefas. Projeto construído com Spring Boot, JPA, H2 e MapStruct.

Tecnologias Utilizadas

Java 17

Spring Boot 3.5.5

Spring Web

Spring Data JPA

Spring Validation

H2 Database (banco em memória para desenvolvimento)

MapStruct (mapeamento entre entidades e DTOs)

Lombok (redução de boilerplate)

Maven (gerenciamento de dependências e build)

JUnit / Spring Boot Test (testes unitários)

Pré-requisitos

Java 17 ou superior instalado

Maven 3.6+ instalado

IDE de sua preferência (IntelliJ, Eclipse, VS Code)

Navegador ou ferramenta para testar endpoints (Postman, Insomnia, curl)

Como rodar localmente

Clone o repositório:

git clone <URL_DO_REPOSITORIO>
cd gestaotarefa


Instale as dependências e compile o projeto:

mvn clean install


Execute a aplicação:

mvn spring-boot:run


Acesse a API em:

http://localhost:8080

Endpoints Disponíveis
Método	Endpoint	Descrição
GET	/tarefas	Retorna a lista de todas as tarefas
GET	/tarefas/{id}	Retorna os detalhes de uma tarefa específica
POST	/tarefas	Cria uma nova tarefa
PUT	/tarefas/{id}	Atualiza uma tarefa existente
DELETE	/tarefas/{id}	Exclui uma tarefa

Obs.: A API utiliza H2 Database, portanto os dados são voláteis e reiniciam a cada execução.

Acesso ao H2 Database

Console disponível em: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:gestaotarefa

Username: sa

Password: (em branco)
