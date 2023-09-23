--liquibase formatted sql

--changeset dhahuk:init_schema

DROP TABLE IF EXISTS VEHICLE;
DROP TABLE IF EXISTS DRIVER;
DROP TABLE IF EXISTS VEHICLE_TYPE;
DROP TABLE IF EXISTS COMPONENT;
DROP TABLE IF EXISTS REPAIR_SHEET;
DROP TABLE IF EXISTS CAR_BRAND;
DROP TABLE IF EXISTS UNIT_MEASUREMENT;
DROP TABLE IF EXISTS SUPPLIER;

CREATE TABLE DRIVER
(
    id  bigserial,
    first_name varchar(25) not null ,
    last_name  varchar(25) not null,
    father_name varchar(25),
    phone      varchar(25),
    create_date timestamp,
    update_date timestamp,
    primary key (id)
);

create table CAR_BRAND
(
    id   bigserial,
    name varchar(25) not null,
    primary key (id)
);

insert into CAR_BRAND (name)
values ('Scania');
insert into CAR_BRAND (name)
values ('Daf');
insert into CAR_BRAND (name)
values ('Volvo');
insert into CAR_BRAND (name)
values ('Mercedes');
insert into CAR_BRAND (name)
values ('Renault');

create table VEHICLE_TYPE
(
    id   bigserial,
    type varchar(25),
    primary key (id)
);

CREATE TABLE VEHICLE
(
    id          bigserial,
    brand               bigint,
    model               varchar(25),
    registration_number varchar(10) not null,
    current_driver      bigint,
    replacement_driver  bigint,
    type                bigint,
    primary key (id),
    constraint fk_current_car_driver foreign key (current_driver) references DRIVER (id),
    constraint fk_replacement_car_driver foreign key (replacement_driver) references DRIVER (id),
    constraint fk_brand foreign key (brand) references CAR_BRAND (id),
    constraint fk_vehicle_type foreign key (type) references VEHICLE_TYPE (id)
);

create table MEASUREMENT
(
    id   bigserial primary key,
    unit_name varchar(25) not null,
    unit_sign varchar(5)
);

create table SUPPLIER
(
    id   bigserial,
    supplier_name varchar(50),
    primary key (id)
);

insert into MEASUREMENT (unit_name, unit_sign)
values ('meter', 'm.');
insert into MEASUREMENT (unit_name, unit_sign)
values ('piece', 'p.');
insert into MEASUREMENT (unit_name, unit_sign)
values ('liter', 'l.');

create table COMPONENT
(
    id   bigserial primary key,
    short_name     varchar(50) not null,
    description    varchar(255),
    code           varchar(25),
    supplier       bigint,
    measurement bigint,
    constraint fk_component_measurement foreign key (measurement) references MEASUREMENT (id),
    constraint fk_component_supplier foreign key (supplier) references SUPPLIER (id)
);

create table REPAIR_SHEET
(
    id   bigserial,
    repair_date timestamp,
    vehicle     bigint,
    component   bigint,
    amount      int,
    primary key (id),
    constraint fk_vehicle foreign key (vehicle) references VEHICLE (id),
    constraint fk_component foreign key (component) references COMPONENT (id)
);




