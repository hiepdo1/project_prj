
create table music(
	[musicId] int primary key,
	[name] varchar(255),
	[singer] varchar(255),
	[path] varchar(255),
);

create table playList(
	[playlistId] int primary key,
	[name] varchar(255),
	[musicId] int,
	[accountId] int,
	FOREIGN KEY (musicId) REFERENCES music(musicId),
);

create table account(
	[accountId] int primary key,
	[name] varchar(50),
	[username] varchar(50),
	[password] varchar(50),
	playlistId int,
	FOREIGN KEY (playlistId) REFERENCES playList(playlistId),
);