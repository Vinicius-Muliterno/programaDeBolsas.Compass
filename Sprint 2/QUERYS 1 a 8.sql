CREATE DATABASE LOJA;
/* -- Questão 1
CREATE TABLE Produtos (
	Id_Produto INT PRIMARY KEY NOT NULL
	, Nome VARCHAR (50) NOT NULL
    , Preco double NOT NULL
	, Descricao VARCHAR(250)
	, Desconto DOUBLE DEFAULT
	, Data_inicio date )

-- incluindo Dados
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (455644 , 'camiseta', 19.99, 'rosa', null, '2020-01-01')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (534898 , 'camiseta', 20.00, 'roxa', null, '2019-12-20')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (894512 , 'casaco', 80.00, 'preta', null, '2021-08-15')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (269348 , 'blusa', 10.99, 'branca', null, '2021-08-15')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (985912 , 'calça', 99.99, 'jeans', null, '2017-01-01')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (263515 , 'sandalia', 10.00, 'preta', null, '2022-02-18')
insert into Produtos(Id_Produto,Nome,Preco, Descricao,Desconto,Data_inicio) values (187512 , 'chapéu', 30.00, 'azul', null, '2020-01-01')

-- Questão 2    
SELECT * from Produtos where Data_inicio BETWEEN '2020-01-01' AND '2021-08-15';

-- Questão 3
SELECT * from Produtos where Data_inicio  NOT BETWEEN '2020-01-01' AND '2021-08-15';
    
-- Questão 4
CREATE TABLE Notas_fiscais (
	Numero_Nota_Fiscal INT PRIMARY KEY AUTO_INCREMENT
    , Id_Notas_Fiscais INT
    , valor DOUBLE
    , CONSTRAINT fk_ProdutoNota FOREIGN KEY (Id_Notas_Fiscais) REFERENCES Produtos (Id_Produto))

-- Questão 5
SELECT NUMERO FROM Notas_fiscais WHERE ID_PRODUTO=455644;

-- Questão 6
ALTER TABLE notas_fiscais
CHANGE Numero_Nota_Fiscal order_id int; 

-- Questão 7
UPDATE Produtos SET Id_produto = 243924 where Id_produto = 455644; 


*/


    
