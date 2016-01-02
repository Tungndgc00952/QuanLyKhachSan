
create database HotelManagement
go
use HotelManagement
go
create table _User(
userName varchar(20),
password varchar(20),
)
drop table _User
create table Room(
ID int primary key,
Type nvarchar(20),
Status nvarchar(20),
Price float
)

create table CheckIn(
Name nvarchar(50),
CheckIn date,
DateArrived date,
HoursArrived time,
CheckOut date,
Adult int,
Child int,
RoomNumber int foreign key references Room(ID),
Deposits float,
Request nvarchar(100)
)
drop table CheckIn
create table Customer(
Name nvarchar(50),
Gender nvarchar(10),
Nationality nvarchar(50),
DateBirh datetime,
PlaceOfBirth nvarchar(100),
Address nvarchar(100),
PhoneNumber int,
Email varchar(50),
ID int,
IssuedBy nvarchar(50),
Note nvarchar(100)
)
drop table Customer
create table Staff(
userName varchar(20),
password varchar(20),
name nvarchar(50) primary key
)
create table StaffInformation(
id varchar(20),
name nvarchar(50) foreign key references Staff(name),
salary float,
gender nvarchar(10),
age int,
phoneNumber int
)
create table Bill(
RoomNumber int foreign key references Room(ID),
StaffName nvarchar(50) foreign key references Staff(name),
Price float,
ServiceName nvarchar(50) foreign key references Service(ServiceName) ,
ServicePrice float,
Total float
)
create table Service(
ServiceName nvarchar(50) primary key,
Price float
)
drop table Bill
insert into _User values
('admin','12345',N'Đức')
insert into Room values
(101,N'Phòng đơn',N'Chưa đặt',500000),
(102,N'Phòng đôi',N'Đã đặt',1200000),
(103,N'Phòng gia đình',N'Chưa đặt',3000000),
(104,N'Phòng VIP',N'Chưa đặt',4000000),
(105,N'Phòng đôi',N'Chưa đặt',1200000)
insert into Room values
(106,N'Phòng đôi',N'Đã đặt',1200000),
(107,N'Phòng VIP',N'Chưa đặt',4000000)
insert into StaffInformation values
(1,N'Phạm Anh Đức',2000,N'Nam',20,01698709496)
insert into Staff values
('ducpagc00970','12345',N'Phạm Anh Đức')
create table Customer(
Name nvarchar(50) foreign key references _User(name),
Gender nvarchar(10),
Nationality nvarchar(50),
DateBirh date,
PlaceOfBirth nvarchar(100),
Address nvarchar(100),
PhoneNumber int,
Email varchar(50),
ID int,
IssuedBy nvarchar(50),
Note nvarchar(500)
)

insert into Customer values
(N'Ling',N'Nam',N'Việt Nam','1996-08-09',N'Hà Nội',N'Thanh Nhàn',01698709496,'ducpagc00970@fpt.edu.vn',343543543,N'Hà Nội',N'abc')
insert into CheckIn values
(N'Ling','2015-01-01','2015-01-01','08:43','2015-01-06',1,2,103,1000000,N'abc')
select * from StaffInformation
select * from Staff
select * from _User
select * from Room
select * from Bill
select * from Customer
select * from CheckIn
create table time(
Timer time
)
insert into time values
('11:23')
select * from time



