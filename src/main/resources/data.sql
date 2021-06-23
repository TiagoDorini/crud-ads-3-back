
CREATE TABLE cliente (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(20) NOT NULL,
  sobre_nome VARCHAR(100) NOT NULL,
  nacionalidade VARCHAR(100) NOT NULL,
  profissao VARCHAR(250) NOT NULL,
  endereco VARCHAR(250) NOT NULL,
  cpf VARCHAR(14) NOT NULL
);


INSERT INTO cliente (nome, sobre_nome, nacionalidade, profissao, endereco, cpf) VALUES ('Tiago', 'Dorini de O. C. Rossi', 'Brasil', 'Desenvolvedor de Software', 'Rua das Rosas, 1447', '111.222.333-44');
  