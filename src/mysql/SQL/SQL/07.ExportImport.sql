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
	FIELDS TERMINATED BY ','                    # csv 파일안 컬럼 구분자 지정
	ENCLOSED BY '"'                             #  각 컬럼/필드는 ""로 감싸져 있음
	LINES TERMINATED BY '\n';                   # 각 라인 구분은 \n

/*
* 3. Import ()
*/
# 데이터 삭제
truncate song;

# 데이터 로드
LOAD DATA INFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'    # 읽어 들일 파일 지정
	INTO TABLE song                                             # load할 테이블 선택
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n';

# 데이터 확인
	

