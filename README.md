# Desafio Zup
Você está fazendo uma API REST que precisará controlar a aplicação de vacinas entre a população brasileira. O primeiro passo deve ser a construção de um cadastro de usuários, sendo obrigatórios dados como: nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser únicos.

O segundo passo é criar um cadastro de aplicação de vacinas, sendo obrigatórios dados como: nome da vacina, e-mail do usuário e a data que foi realizada a vacina.

Você deve construir apenas dois endpoints neste sistema, o cadastro do usuário e o cadastro da aplicação da vacina. Caso os cadastros estejam corretos, é necessário voltar o Status 201, caso hajam erros de preenchimento de dados, o Status deve ser 400.

**Regras de negócio**

- Nome, e-mail, CPF e data de nascimento devem ser obrigatórios.

- E-mail e CPF devem ser únicos.

- Nome da vacina, id usuário e a data de aplicação devem ser obrigatórios.
- Possuir dois endpoints, cadastro do usuário e o cadastro da aplicação da vacina.
- Cadastros corretos retornar Status 201
- Cadastros incorretos retornar Status 400.
- Construir a aplicação sem utilizar Lombok;
- Substituir o e-mail do usuário na tabela de vacinação para uma chave estrangeira associada ao id do usuário. 

| Requisitos | Links                                                        |
| ---------- | ------------------------------------------------------------ |
| Postman    | [Link](https://github.com/jonataswf/Desafio-Zup/tree/master/postman) |
| H2         | [Link](http://localhost:8080/h2/login.jsp?jsessionid=daeaa0a979502fe39834f3e7bd288f17) |

**Instruções de Uso:**

1. Importar o projeto no Intellij.
2. Executar a API desafio.
4. Abrir o Postman, e importar o arquivo das requisições mencionado na tabela acima.
5. Executar a requisição de "CadastrarUsuarios" no Postman.
6. Executar a requisição de "CadastroVacinasAplicadas" no Postman.
8. Visualizar no banco de dados H2 as tabelas criadas de "usuários" e "vacinas", link na tabela acima.