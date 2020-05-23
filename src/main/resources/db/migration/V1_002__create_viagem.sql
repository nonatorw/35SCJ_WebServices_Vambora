CREATE TABLE if not exists VIAGEM (
  id bigint NOT NULL AUTO_INCREMENT,
  id_carro bigint,
  id_cliente bigint,
  origem bigint,
  destino bigint,
  dh_partida timestamp,
  dh_CHEGADA timestamp,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

