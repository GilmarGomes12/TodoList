# ToDo List

Este é um projeto de um gerenciador de tarefas simples, desenvolvido com Spring Boot.

## Estrutura do Projeto

.gitattributes .gitignore .mvn/ .vscode/ HELP.md mvnw mvnw.cmd pom.xml src/ main/ java/ br/ com/ gilmargomes/ resources/ application.properties static/ templates/ test/ java/ br/ com/ target/

## Configuração do Banco de Dados

O projeto utiliza um banco de dados H2 em memória. As configurações do banco de dados estão no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:todolist
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Dependências
As principais dependências do projeto estão listadas no arquivo pom.xml:

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>at.favre.lib</groupId>
        <artifactId>bcrypt</artifactId>
        <version>0.10.2</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.36</version>
        <scope>provided</scope>
    </dependency>
</dependencies>


Executando o Projeto
Para executar o projeto, você pode usar o Maven Wrapper incluído no projeto. No terminal, navegue até o diretório raiz do projeto e execute:

./mvnw spring-boot:run


Endpoints
Usuários
Criar Usuário
POST /users/
Body: UserModel
Tarefas
Criar Tarefa

POST /tasks/
Body: TaskModel
Listar Tarefas

GET /tasks/
Atualizar Tarefa

PUT /tasks/{id}
Body: TaskModel
Estrutura do Código
Pacote user
UserModel
IUserRepository
UserController
Pacote task
TaskModel
ITaskRepository
TaskController
Pacote filter
FilterTaskAuth
Pacote errors
ExceptionHandlerController
Pacote utils
Utils
Testes
Os testes estão localizados no diretório src/test/java/br/com/gilmargomes/todolist/. 
Para executar os testes, use o comando:

./mvnw test

Licença
Este projeto é licenciado sob a Licença Apache 2.0. Veja o arquivo LICENSE para mais detalhes.


Este `README.md` fornece uma visão geral do projeto, incluindo a estrutura do projeto, configuração do banco de dados, dependências, instruções de execução, endpoints disponíveis, estrutura do código e informações sobre testes e licença.