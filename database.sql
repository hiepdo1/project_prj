create database musicDb
Create table Account(
accountId int primary key,
username varchar(255),
[password] varchar(255),
name nvarchar(255),
)
create table Playlist(
playlistId int primary key,
name nvarchar(255),
accountID int FOREIGN KEY REFERENCES Account(accountID),
)
create table Music(
musicID int primary key,
name nvarchar(255),
[path] varchar(255),
)
create table List(
playlistID int FOREIGN KEY REFERENCES Playlist(playlistID),
musicID int FOREIGN KEY REFERENCES Music(musicID)
)