# 1. 2009년도에 데뷔한 걸그룹의 힛트송은?
#(걸그룹 이름, 데뷔일자, 힛트송 제목)

SELECT r.name, r.debut,l.title FROM song l
	JOIN girl_group r ON l.sid=r.hit_song_id
	 WHERE YEAR(r.debut) = 2009;
/*
*	WHERE r.debut LIKE '2009%';
*	WHERE r.debut BETWEEN DATE('2009-01-01') AND DATE('2009-12-31');
*/

# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)

SELECT r.name, r.debut,l.title FROM song l
JOIN girl_group r ON l.sid=r.hit_song_id
    WHERE date(r.debut) 
    ORDER BY r.debut ASC
    LIMIT 5;

# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
	SELECT Continent,COUNT(*) 국가숫자,SUM(GNP) SumGNP ,ROUND(AVG(GNP)) AVGGNP FROM country
	GROUP BY Continent;
    

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로  보여줄 것
        (대륙명, 국가명, 도시명 ,인구수)
      
    SELECT r.Continent, r.name, l.name, l.Population FROM city l
	JOIN country r ON l.CountryCode = r.code
	WHERE r.Continent='Asia'
	ORDER BY population DESC
	LIMIT 10;
    
# 5. 전 세게에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
        (국가명, GNP, 언어명)

    SELECT l.Name,l.GNP,r.`Language` FROM country l
	JOIN countrylanguage r ON l.Code = r.CountryCode
	WHERE r.IsOfficial = 'T'
	ORDER BY l.GNP desc
	LIMIT 10;
	
      
	

