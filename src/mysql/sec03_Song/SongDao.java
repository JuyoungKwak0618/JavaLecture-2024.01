package mysql.sec03_Song;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SongDao {
	private String ConnStr;
	private String user;
	private String password;

	public SongDao() {
		String path = "C:/Workspace/Java/lesson/src/mysql/mysql.Properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));

			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.ConnStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Connection myConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ConnStr, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Song getSongbySid(int sid) {
		Connection conn = myConnection();
		String sql = "select * from song where sid=?";
		Song song = new Song();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				song.setSid(rs.getInt(1));
				song.setTitle(rs.getString(2));
				song.setLyrics(rs.getString(3));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}
	
	public Song getSongbyTitle(String title) {
		Connection conn = myConnection();
		String sql = "select * from song where title=?";
		Song song = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return song;
	}
	
	public List<Song> getSongListAll() {
		Connection conn = myConnection();
		String sql = "select * from song";
		List<Song> list = new ArrayList<Song>();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Song song = new Song(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(song);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertSong(Song song) {
		Connection conn = myConnection();
		String sql = "insert into song values(default, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateSong(Song song) {
		Connection conn = myConnection();
		String sql = "update song set title=?, lyrics=? where sid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, song.getTitle());
			pstmt.setString(2, song.getLyrics());
			pstmt.setInt(3, song.getSid());
			
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(int sid) {
		Connection conn = myConnection();
		String sql = "delete from song where sid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,sid);
			
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
 
}
