drop database taxis;
create database taxis;
use taxis;

####1. Creation of Vehiculos Database and data insertion
create table if not exists vehiculo(
	`veh_placa` char(7) not null,
    `veh_marca` char(15) not null,
    `veh_modelo` char(15) not null,
    `veh_anhio` smallint(6) not null,
    `veh_capacidad` tinyint(4) not null,
    `veh_color` char(15) not null,
	`veh_kilometros` int(11) not null,
    primary key (`veh_placa`)	
);
insert into vehiculo values ("KLM 565","Chevrolet","spark",2015,5,"amarillo",120000);
insert into vehiculo values ("LCS 364","Chevrolet","spark",2016,5,"blanco",125000);
insert into vehiculo values ("KGH 211","Kia","picanto",2015,5,"amarillo",80000);
insert into vehiculo values ("PET 363","Kia","rio",2019,5,"blanco",150000);
insert into vehiculo values ("CUL 073","Renault","duster",2006,5,"blanco",220000);
insert into vehiculo values ("PEL 456","Renault","duster",2015,5,"blanco",130000);

####2. Creation of usuario Database and data insertion
create table if not exists usuario(
	`usu_cc` int(11),
    `usu_nombre` char(20),
    `usu_apellido` char(20),
    `usu_email` char(60),
    primary key (`usu_cc`)
);
insert into usuario values (4548844,"Claudia","Mendez","cmendez@mail.com");
insert into usuario values (5584669,"Paola","Angulo","pangulo@mail.com");
insert into usuario values (35448452,"Pedro","Perez","pperez@mail.com");
insert into usuario values (55488445,"Luis","Rojas","lrojas@mail.com");
insert into usuario values (55844775,"Andres","Cruz","acruz@mail.com");
insert into usuario values (55987784,"Viviana","Henao","vhenao@mail.com");
insert into usuario values (64588522,"Ana","Lopez","alopez@mail.com");
insert into usuario values (65448733,"Ana","Riascos","ariascos@mail.com");
insert into usuario values (65544788,"Carlos","Penagos","cpenagos@mail.com");
insert into usuario values (76636633,"Nelson","Ruiz","nruiz@mail.com");
insert into usuario values (325555451,"Maria","Lopez","mlopez@mail.com");
insert into usuario values (454671556,"Camilo","Garcia ","cgarcia@mail.com");
insert into usuario values (987367363,"Jorge","Rodriguez","jrodriguez@mail.com");
insert into usuario values (987445125,"Fredy","Bustos","fbustos@mail.com");
# Query asked for a part in a challenge
select concat(usu_nombre," ",usu_apellido," con cc ",usu_cc," con ", usu_email) as Información from usuario;

####3. Creation of conductores Database and data insertion
create table if not exists conductor(
	`usu_cc` int(11),
    `veh_placa` char(7),
    primary key(`usu_cc`),
    foreign key (`usu_cc`) references usuario(`usu_cc`),
    foreign key (`veh_placa`) references vehiculo(`veh_placa`)
);
insert into conductor values (4548844,"KLM 565");
insert into conductor values (325555451,"KLM 565");
insert into conductor values (76636633,"LCS 364");
insert into conductor values (64588522,"PET 363");
insert into conductor values (65544788,"PET 363");
insert into conductor values (55844775,"LCS 364");
insert into conductor values (55488445,"KGH 211");
insert into conductor values (987367363,"KGH 211");
# Query asked for a part in a challenge
select concat(usu_nombre, " ",usu_apellido ," conduce ", veh_placa) as Información from conductor natural join usuario;

####4. Creation of viajes Database and data insertion
create table if not exists viaje(
	`via_id` int(11)  not null auto_increment,
    `usu_cc` int(11) not null,
    `con_cc` int(11) not null,
    `fecha` datetime,
    primary key (`via_id`),
    foreign key (`usu_cc`) references usuario(`usu_cc`),
    foreign key (`con_cc`) references conductor(`usu_cc`)
);
insert into viaje (usu_cc,con_cc,fecha) values (65448733,4548844, '2017-10-25 20:00:00');
insert into viaje (usu_cc,con_cc,fecha) values (65448733,325555451,'2019-03-15 18:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (65448733, 55844775, '2019-05-20 20:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (35448452,4548844,'2018-05-20 20:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (35448452,55844775,'2020-01-20 20:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (325555451,64588522,'2019-05-20 20:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (325555451,65544788,'2018-06-22 21:30:00');
insert into viaje (usu_cc,con_cc,fecha)  values (325555451,55488445,'2020-03-17 15:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (64588522,55488445,'2020-03-17 15:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (64588522,76636633,'2020-04-10 18:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (55488445,987367363,'2020-02-17 20:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (55488445,55844775,'2020-02-20 16:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (55488445,64588522,'2020-03-27 18:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (55844775,64588522,'2020-03-20 21:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (76636633,64588522,'2020-01-10 17:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (76636633,325555451,'2020-02-15 20:30:20');
insert into viaje (usu_cc,con_cc,fecha)  values (76636633,987367363,'2020-03-17 18:30:20');
# Query asked for a part in a challenge
select concat(usuario.usu_nombre, " ",usuario.usu_apellido ," viajó con ", u2.usu_nombre, " ", u2.usu_apellido," el ", fecha) as Información from viaje natural join usuario join conductor on viaje.con_cc = conductor.usu_cc join usuario u2 on conductor.usu_cc=u2.usu_cc;

## 4.1 Change the color of the car "KGH 211" to azul(Blue)
update vehiculo set veh_color = "azul" where veh_placa = "KGH 211";

## 4.2 Change the email of the user "Andres Cruz" to acruz@example.com => "Andres Cruz" ->> usu_cc = 55844775;
update usuario set usu_email = "acruz@example.com" where usu_cc = 55844775;

## 4.3 Delete the travel of "Luis Rojas" with "Ana Lopez" --->via_id = 13
delete from viaje where via_id = 13;

####5. Challenge 4 requirements
#5.1 Retrieve the users(usuario) information through the identification number (número de cédula) in ascending order.
#Select 'Consulta 1';
select * from usuario order by usu_cc asc;

#5.2 Retreive the vehicle(vehiculos) information (placa, marca, modelo)(number, brand, model) for those that are older than 2015, order by brand.
#Select 'Consulta 2';
select  veh_placa, veh_marca, veh_modelo from vehiculo where veh_anhio>2015 order by veh_marca;


#5.3 Retrieve the information of the drivers (conductores) of the car with number "PET 363"
#Select 'Consulta 3';
select usu_cc, usu_nombre, usu_apellido, usu_email from conductor natural join usuario where conductor.veh_placa = "PET 363";

#5.4 Retrieve the number(veh_placa) information of the drivers (conductores) with who has the user with number identificaiton 64588522
#Select 'Consulta 4';
select veh_placa from usuario natural join viaje join conductor on viaje.con_cc=conductor.usu_cc natural join vehiculo where usuario.usu_cc=64588522;

#5.5 Retrieve the information of how many cars (vehículos) has more than 120000 km
#Select 'Consulta 5';
select count(*) from vehiculo where veh_kilometros > 120000;