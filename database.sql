create database musicDb
Create table Account(
accountId int identity(1,1) primary key,
username varchar(255),
[password] varchar(255),
name nvarchar(255),
email varchar(255),
[role] bit default(0)
)
create table Playlist(
playlistId int IDENTITY(1,1) PRIMARY KEY,
name nvarchar(255),
accountID int FOREIGN KEY REFERENCES Account(accountID),
)
create table Music(
musicID int IDENTITY(1,1) PRIMARY KEY,
name nvarchar(255),
[path] varchar(255),
singer nvarchar(255)
)
create table List(
playlistID int FOREIGN KEY REFERENCES Playlist(playlistID),
musicID int FOREIGN KEY REFERENCES Music(musicID)
)