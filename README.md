

# Projeto Live DIO :two: :rocket:

> Continuando a jornada, vou agora registrar meu aprendizado neste segundo projeto de live da DIO. Objetivo do projeto é desenvolver um sistema de gerenciamento de pessoas em API REST com Spring Boot.
>
> Entender o conceito por trás do projeto será minha meta :happy:
>
> Agradeço a todos pela oportunidade!
>
> **Link de acesso heroku:** https://people-live-2.herokuapp.com/
>
> Segue abaixo o README da live para mais informações

Nesta live coding vamos desenvolver um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8082/api/v1/people
```


São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links bem bacanas, sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

[Neste link](https://drive.google.com/file/d/1crVPOVl6ok2HeYjh3fjQuGQn2lDZVHrn/view?usp=sharing), seguem os slides apresentados como o roteiro utilizado para o desenvolvimento do projeto da nossa sessão.

#### Trilha de aprendizado:

<p style="background-color: #7fffd4; border-radius: 3px;">
<strong>COMMIT INICIAL</strong><br><br>
<strong>Parte 1:</strong><br>
Instalação dos softwares que vamos utilizar no projeto.<br>
<br><strong>Parte 2:</strong><br>
Introdução aos conceitos de API REST.<br>
<br><strong>Parte 3:</strong><br>
Criando o projeto inicial e deixando-o na cloud com o Heroku.<br>
<br></p>


<p style="background-color: #6495ed; border-radius: 3px;">
<strong>SEGUNDO COMMIT -> Montagem e mapeamento das classes</strong><br><br>
<strong>Parte 4:</strong><br>
Montei as classes entidades e mapeie elas conforme a regra de negócio do projeto, aprendi a anotação @Column e as estratégias utilizadas no relacionamento entre a classe Person e Phone.<br>
<br></p>


<p style="background-color: #f5f5dc; border-radius: 3px;">
<strong>TERCEIRO COMMIT -> Conexão ao banco de dados, criado metodo post para Person</strong><br><br>
<strong>Parte 5:</strong><br>
Conexão das classes ao banco H2, criado um repository e um metodo post para a classe "person".<br>
<br></p>



<p style="background-color: #8fbc8f; border-radius: 3px;">
<strong>QUARTO COMMIT -> Testando o método post da entidade Person no swagger + heroku </strong><br><br>
<strong>Parte 6:</strong><br>
Implementação do metodo post, utilizei a documentação do swagger para realizar os testes. Criação da classe service para as regras de negócio do projeto. Aprendi sobre a anotação @ResponseStatus. Teste do projeto no Heroku.<br>
<br></p>


<p style="background-color: #e6e6fa; border-radius: 3px;">
<strong>QUINTO COMMIT -> Criação de objetos Transacionais + metodo GET listAll </strong><br><br>
<strong>Parte 7:</strong><br>
Criação dos objetos transacionais para as classes Person e Phone reponsaveis por receber as APIs, preservando as entidades do modelo. Aprendi sobre anotações para validações de campos (@NotEmpty,@Size,@Valid,etc).<br>
<br><strong>Parte 8:</strong><br>Criando mappers com a api mapstruct, um convertor de objetos trasacionais para objetos do modelo e vice versa. Foi criado a funcionalidade GET listAll. <br>
<br></p>



<p style="background-color: #ff6347; border-radius: 3px;">
<strong>SEXTO COMMIT -> Introduzindo o metodo GET findByID ao projeto
</strong><br><br>
<strong>Parte 9:</strong><br>
Introduzindo o metodo GET findByID ao projeto e criando excessões caso o usuário não encontre o ID solicitado. Uso da class Optional com o método orElseThrow.<br>
<br></p>



<p style="background-color: #40e0d0; border-radius: 3px;">
<strong>SETIMO COMMIT -> Colocando os métodos PUT e DELETE
</strong><br><br>
<strong>Parte 10:</strong><br>
Implementação do metodo DELETE e do metodo PUT ao projeto. Foi criada uma nova branch(update_feature). Encapsulamento de métodos.<br>
<br></p>


<p style="background-color: #d8bfd8; border-radius: 3px;">
<strong>OITAVO COMMIT -> Colocando testes unitários no projeto
</strong><br><br>
<strong>Parte 11:</strong><br>
Aprendi a realizar merges de branchs no github. O merge realizado foi entre a branch main e a update_feature contido no projeto. Também aprendi mais a dar git pull no projeto alterado. Introdução a teste unitários.<br>
<br></p>
