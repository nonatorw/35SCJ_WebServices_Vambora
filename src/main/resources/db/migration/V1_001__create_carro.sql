CREATE TABLE if not exists CARRO (
  id integer NOT NULL AUTO_INCREMENT,
  nome varchar(200) NOT NULL,
  status varchar(20) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
