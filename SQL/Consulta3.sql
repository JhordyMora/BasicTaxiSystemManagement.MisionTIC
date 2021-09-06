use taxis;
/*
create table if not exists usuario(
	`usu_cc` int(11),
    `usu_nombre` char(20),
    `usu_apellido` char(20),
    `usu_email` char(60),
    primary key (`usu_cc`)
);
insert into usuario values (4548844,"Claudia","Mendez","cmendez@mail.com");
insert into usuario values (5584669,"Paola","Angulo","pangulo@mail.com");
insert into usuario values (35448452,"Pedro","Perez ","pperez@mail.com");
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
*/
#Select 'Consulta 3';
select usu_cc, usu_nombre, usu_apellido, usu_email from conductor natural join usuario where conductor.veh_placa = "PET 363";