package mysql.sec06_user;

import java.time.LocalDate;

/*
 * 	CREATE TABLE users (
		uid varchar(12) NOT NULL,
		pwd char(60) NOT NULL,
		uname varchar(16) NOT NULL,
		email varchar(32),
		regDate date DEFAULT (current_date),
		isDeleted int DEFAULT 0,
		PRIMARY KEY (uid)
	);
 */
public class User {
	private String uid;
	private String pwd;
	private String uname;
	private String email;
	private LocalDate regDate;
	private int isDeleted;
	
	public User() { }
	
	public User(String uid, String pwd, String uname, String email) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
	}

	public User(String uid, String pwd, String uname, String email, LocalDate regDate, int isDeleted) {
		this.uid = uid;
		this.pwd = pwd;
		this.uname = uname;
		this.email = email;
		this.regDate = regDate;
		this.isDeleted = isDeleted;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + ", regDate=" + regDate
				+ ", isDeleted=" + isDeleted + "]";
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}
