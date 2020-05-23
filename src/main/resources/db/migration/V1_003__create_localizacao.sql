CREATE TABLE if not exists TB_LOCALIZACOES (
  id bigint NOT NULL AUTO_INCREMENT,
  longitude double,
  latitude double,
  data_hora_localizacao timestamp,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

