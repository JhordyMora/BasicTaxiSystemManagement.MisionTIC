use taxis;
/*create table if not exists vehiculo(
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
insert into vehiculo values ("PEL 456","Renault","duster",2015,5,"blanco",130000);*/
#Select 'Consulta 2';
select  veh_placa, veh_marca, veh_modelo from vehiculo where veh_anhio>2015 order by veh_marca;