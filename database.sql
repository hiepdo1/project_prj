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

insert into Music(name,[path],singer)
values(N'3107-2','assets/Music/31072LofiVersion-DuonggNauWnFreakD-6952501_hq.mp3',N'Duongg,Nau'),
(N'Anh biết','assets/Music/AnhBiet-XamDBlue-6057101.mp3',N'Xám, D.Blue'),
(N'Anh phải sống thế nào','assets/Music/AnhPhaiSongTheNaoLofiVersion-NhatPhongCaoTri-6879087.mp3',N'Nhật Long, Cao Tri'),
(N'Càng đậm sâu càng đau','assets/Music/CangDamSauCangDauLofiVersion-NhuViet-6973559.mp3',N'Như Việt'),
(N'Do for love','assets/Music/DoForLove-AMeeBRay-6221980.mp3',N'AMee, B Ray'),
(N'Dream 1','assets/Music/Dream1Seabreeze-DPDuongPham-6853583.mp3',N'Dương Phạm'),
(N'Dream 3','assets/Music/Dream3SkyNight-DPDuongPham-6853582.mp3',N'Dương Phạm'),
(N'Được Không Anh','assets/Music/DuocKhongAnhLofiVersion-TrangThienMagazineTempoG-6177053.mp3',N'Trang Thiên, Magazine, Tempo G'),
(N'Em ăn sáng chưa','assets/Music/EmAnSangChua-Kien-5277335.mp3',N'Kiên'),
(N'Lạ lùng','assets/Music/LaLungLofiVersion-Vu-6181036.mp3',N'Kiên'),
(N'Anh không nhớ em','assets/Music/Lofi7AnhKhongNhoEm-DPDuongPham-6853581.mp3',N'Vũ'),
(N'Nến và hoa','assets/Music/NenVaHoaKarrotRemix-Rhymastic-5887537.mp3',N'Rhymastic'),
(N'Nước Mắt Em Lau Bằng Tình Yêu Mới','assets/Music/NuocMatEmLauBangTinhYeuMoiCM1XLofiRemix-DaLABTocTien-6098438.mp3',N'Da LAB, Tóc Tiên'),
(N'Phiêu bồng','assets/Music/PhieuBong-Tofu-6041401.mp3',N'Tofu'),
(N'See tình','assets/Music/SeeTinh-HoangThuyLinh-7130526.mp3',N'Tofu'),
(N'Sorry i like you','assets/Music/SorryILikeYou-DPDuongPham-6853580.mp3',N'Dương Phạm'),
(N'Tôi và em 1','assets/Music/ToiVaEm1-PinkFrog-5047874.mp3',N'Pink Frog'),
(N'4 oclock','assets/Music/4OClockLofiVersion-Smyang-5448501.mp3',N'Smyang'),
(N'Ai biết','assets/Music/AiBiet-WEAN-6061846.mp3',N'WEAN'),
(N'Both of us','assets/Music/BothOfUs-Idealism-5547395.mp3',N'Idealism'),
(N'Được không anh','assets/Music/DuocKhongAnhLofiVersion-TrangThienMagazineTempoG-6177053.mp3',N'Trang Thiên'),
(N'Em có nghe','assets/Music/EmCoNgheLofiVersion-KhaFreakD-6248596.mp3',N'Kha FreakD'),
(N'Lạ lùng','assets/Music/LaLungLofiVersion-Vu-6181036.mp3',N'Vũ'),
(N'Một nửa yêu thương','assets/Music/MotNuaYeuThuongLofiVersion-JuunDangDung-6262929.mp3',N'Juun Dang Vu'),
(N'Nước mắt em lau bằng tình yêu mới','assets/Music/NuocMatEmLauBangTinhYeuMoiCM1XLofiRemix-DaLABTocTien-6098438.mp3',N'DaLab'),
(N'Sai Gon simple love','assets/Music/SaigonSimpleLove-NguyenSeth-5690669.mp3',N'Nguyen Seth'),
(N'Sợ rằng em biết anh còn yêu em','assets/Music/SoRangEmBietAnhConYeuEmLofiVersion-JuunDangDungFreakD-6248597_hq.mp3',N'Juun'),
(N'See your name make me happy','assets/Music/SeeingYourNameMakesMeHappy-Burbank-5510531_hq.mp3',N'Burbank'),
(N'Take It Slow','assets/Music/TakeItSlow-CharlesHuynhRonniboiKimChiSun-5826743.mp3',N'Sun'),
(N'Yêu ai','assets/Music/YeuAiYeuAiDeKhongPhaiKhocLofiVersion-NB3HoaiBaoHoangLy-6268578.mp3',N'Hoài Bảo');

insert into Account(username,[password],name,email,[role])
values
('admin','admin','hiep','hiep23@gmail.com',1)

insert into Playlist(name,accountID)
values
(N'Playlist Chill',1),
(N'Playlist Focus',1),
(N'Playlist Sleep',1);

insert into ListDetail(musicID,playlistID)
values
(30,3),
(29,3),
(28,3),
(27,3),
(26,3),
(25,3),
(24,3),
(23,3),
(22,3),
(21,3),
(20,2),
(19,2),
(18,2),
(17,2),
(16,2),
(15,2),
(14,2),
(13,2),
(1,4),
(2,4),
(3,4),
(4,4),
(5,4),
(6,4),
(7,4),
(8,4),
(9,4),
(10,4),
(11,4),
(12,4),
(13,4),
(14,4),
(15,4),
(16,4),
(17,4),
(18,4);



















