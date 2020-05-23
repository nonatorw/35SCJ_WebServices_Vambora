CREATE TABLE if not exists TB_CLIENTES (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(200) NOT NULL,
  documento integer NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO TB_CLIENTES (nome, documento) VALUES ('Jose Almeida', 53214);
INSERT INTO TB_CLIENTES (nome, documento) VALUES ('Maria Rita', 65474);
INSERT INTO TB_CLIENTES (nome, documento) VALUES ('Joao da Silva', 32165);
INSERT INTO TB_CLIENTES (nome, documento) VALUES ('Mariana Menezes', 98532);
INSERT INTO TB_CLIENTES (nome, documento) VALUES ('Rita de Cassia', 54512);
