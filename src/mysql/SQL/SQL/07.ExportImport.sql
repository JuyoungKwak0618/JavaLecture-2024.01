#########################
#
#ㅌ 테이블 Export/Import
#
#########################

/*
* 1. secure_file_priv 확인
*           
*           
*           C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\
*/
SHOW VARIABLES LIKE 'secure_file_priv';

/*
* 2. Export (Table -> File)
*/ 
SELECT * FROM song INTO OUTFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';

/*
* 3. Import ()
*/
# 데이터 삭제
truncate song;

# 데이터 로드
LOAD DATA INFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	INTO TABLE song
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';
	

