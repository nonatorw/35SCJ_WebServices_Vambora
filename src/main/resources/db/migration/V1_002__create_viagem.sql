CREATE TABLE if not exists VIAGEM (
  id bigint NOT NULL AUTO_INCREMENT,
  origem varchar(200) NOT NULL,
  destino varchar(200) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
