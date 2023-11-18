CREATE TABLE train (
   id int not null auto_increment,
   train_number varchar(5) not null,
   train_type enum('Diesel', 'Electric', 'Stadler') not null,
   number_of_wagons int not null,
   primary key (id)
);

create table station (
    id int not null auto_increment,
    title varchar(40) not null,
    station_code varchar(10) not null,
    primary key (id)
);

create table passenger (
    id int not null auto_increment,
    name varchar(20) not null,
    surname varchar(20) not null,
    birth date not null,
    mail varchar(30) not null,
    primary key (id)
);

create table carriage (
    id int not null  auto_increment,
    train_id int not null,
    carriage_number int not null,
    type enum('Open seating','compartment','sitting', 'luxury') not null,
    number_of_seats int not null,
    remaining_seats int not null,
    primary key (id),
    foreign key (train_id) references train(id)
);

create table discounts (
    id int not null auto_increment,
    discount_name varchar(50) not null,
    discount_text text not null,
    discount_amount decimal(5,2),
    primary key(id)
);

create table routes (
    id int not null auto_increment,
    title varchar(50),
    departure_station_id int not null,
    arrival_station_id int not null,
    departure_time datetime not null,
    arrival_time datetime not null,
    route_length int not null,
    duration time not null,
    price decimal(10, 2),
    train_id int not null,
    primary key(id),
    foreign key (departure_station_id) references station(id),
    foreign key (arrival_station_id) references station(id),
    foreign key (train_id) references train(id)
);

create table route_station_sequence (
    id int not null,
    route_id int not null,
    station_id int not null,
    sequence_number int,
    distance_to_next_station decimal(10,2),
    time_to_next_station time,
    primary key (id),
    foreign key (route_id) references routes(id),
    foreign key (station_id) references station(id)
);

create table ticket (
    id int not null auto_increment,
    passenger_id int not null,
    discount_id int not null,
    route_id int not null,
    carriage_id int not null,
    price decimal(10,2),
    primary key (id),
    foreign key (passenger_id) references passenger(id),
    foreign key (discount_id) references discounts(id),
    foreign key (route_id) references routes(id),
    foreign key (carriage_id) references carriage(id)
);