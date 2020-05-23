CREATE TABLE if not exists CLIENTE (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(200) NOT NULL,
  documento bigint NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO CLIENTE (nome, documento) VALUES ('Jose Almeida', 53214569875);
INSERT INTO CLIENTE (nome, documento) VALUES ('Maria Rita', 65474121569);
INSERT INTO CLIENTE (nome, documento) VALUES ('Joao da Silva', 32165423614);
INSERT INTO CLIENTE (nome, documento) VALUES ('Mariana Menezes', 98532145698);
INSERT INTO CLIENTE (nome, documento) VALUES ('Rita de Cassia', 54512362285);
