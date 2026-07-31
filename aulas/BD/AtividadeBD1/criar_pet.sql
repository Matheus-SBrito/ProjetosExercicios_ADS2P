CREATE TABLE pet {
    int(12) id_pet PK,
    varchar(45) nome_pet NOT NULL,
    varchar(45) especie NOT NULL,
    varchar(45) raca NOT NULL,
    date data_nasc NOT NULL,
    int peso NOT NULL
}