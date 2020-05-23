CREATE TABLE if not exists TB_VIAGENS (
  id bigint NOT NULL AUTO_INCREMENT,
  id_carro bigint,
  id_cliente bigint,
  id_localizacao_origem bigint,
  id_localizacao_destino bigint,
  partida timestamp,
  chegada timestamp,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

