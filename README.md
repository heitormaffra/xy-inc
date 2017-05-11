# Descrição

Repositório com um CRUD totalmente RESTful, utilizando como base o mySQL como banco de dados.


Execução
--------

Para executar o projeto, basta executar o comando do maven:

    mvn spring-boot:run


Listando todos os Produtos
--------------------------

Para listar todos os Produtos, a seguinte operação deverá ser feita, conforme descrito abaixo:

    GET: http://localhost:8080/products
ou

    GET: http://localhost:8080/clients
ou

    GET: http://localhost:8080/purchaseOrders

Cadastrando registro
----------------------

Para cadastrar um registro, a seguinte operação deverá ser feita, conforme descrito abaixo:

    GET: http://localhost:8080/products
ou

    GET: http://localhost:8080/clients
ou

    GET: http://localhost:8080/purchaseOrders
 

E adicionando o arquivo JSON no cabeçalho da requisição. O exemplo abaixo é de um produto:


    {
	  "description" : "Chave de roda",
	  "price" : "15.6",
	  "category" : "ferramentas",
	  "weight" : "1.5",
	  "ammount" : "20"
    }

Alterando um Produto
--------------------

Para alterar um Produto, a seguinte operação deverá ser feita, conforme descrito abaixo:

    PUT: http://localhost:8080/products/id
ou

    PUT: http://localhost:8080/clients/id
ou

    PUT: http://localhost:8080/purchaseOrders/id
    
    
E adicionando o arquivo JSON no cabeçalho da requisição O exemplo abaixo é para alteração de um produto:

    {
	  "description" : "Chave de roda",
	  "price" : "15.6",
	  "category" : "ferramentas",
	  "weight" : "1.5",
	  "ammount" : "20"
    }

Excluindo um Produto
--------------------

Para listas todos os POI's uma requisição GET deverá ser feita, conforme descrito abaixo:

    DELETE: http://localhost:8080/products/id
ou

    DELETE: http://localhost:8080/clients/id
ou

    DELETE: http://localhost:8080/purchaseOrders/id


Criação do banco
----------------

O arquivo application.properties irá fazer a configuração do banco de dados. Caso seja necessário adicionar as tabelas ao banco na 
primeira execução, adicionar a linha a seguir no arquivo:
    
    spring.jpa.hibernate.ddl-auto=create
    
Lembrando que para o MySQL, banco utilizado no app, é necessário ter o banco de dados criado
