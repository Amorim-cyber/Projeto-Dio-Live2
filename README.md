# Projeto Live DIO :two: :rocket:

> Continuando a jornada, vou agora registrar meu aprendizado neste segundo projeto de live da DIO. Objetivo do projeto é desenvolver um sistema de gerenciamento de pessoas em API REST com Spring Boot.
>
> Entender o conceito por trás do projeto será minha meta :happy:
>
> Agradeço a todos pela oportunidade!
>
> **Link de acesso heroku:** https://people-live-2.herokuapp.com/

#### Trilha:

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



