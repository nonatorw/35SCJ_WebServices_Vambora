CREATE TABLE if not exists TB_CARROS (
  id bigint NOT NULL AUTO_INCREMENT,
  placa varchar(200) NOT NULL,
  disponivel boolean NOT NULL,
  id_ultima_viagem bigint,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO TB_CARROS (placa, disponivel) VALUES ('EDC5412', 1);
INSERT INTO TB_CARROS (placa, disponivel) VALUES ('DSS3652', 1);
INSERT INTO TB_CARROS (placa, disponivel) VALUES ('UJN4432', 1);
INSERT INTO TB_CARROS (placa, disponivel) VALUES ('UJM7896', 1);
INSERT INTO TB_CARROS (placa, disponivel) VALUES ('ACE1234', 1);
INSERT INTO TB_CARROS (placa, disponivel) VALUES ('DER5278', 1);
