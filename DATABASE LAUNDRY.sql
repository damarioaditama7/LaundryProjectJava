CREATE TABLE data_pelanggan(
ID int not null auto_increment,
NAMA varchar(255) not null,
ALAMAT varchar(255),
TELEPON varchar(255) not null,
BERAT_LAUNDRY int not null,
TANGGAL_MASUK datetime default now(),
TANGGAL_AMBIL date,
TOTAL_BAYAR double not null,
PRIMARY KEY (ID)
);

CREATE TABLE data_admin(
ID int not null auto_increment,
USERNAME varchar(255) not null unique,
PASS varchar(255)not null,
PRIMARY KEY (ID)
);

INSERT INTO data_admin(USERNAME,PASS)
VALUES ("bebas","1234");