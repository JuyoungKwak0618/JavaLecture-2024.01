package mysql.sec04_girl_group;

import java.time.LocalDate;

public class GirlGroup {
	private int gid;
	private String name;
	private LocalDate debut;
	private int hitSongId;			// Insert/Update 할 때 사용하는 필드
	private String hitSongtitle;	// Select 할 때 사용하는 필드
	
	public GirlGroup() { }
	// Insert 할 경우 사용되는 생성자
	public GirlGroup(String name, LocalDate debut, int hitSongId) {
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
	}
	// Update 할 경우 사용되는 생성자
	public GirlGroup(int gid, String name, LocalDate debut, int hitSongId) {
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
	}
	
	public GirlGroup(int gid, String name, LocalDate debut, int hitSongId, String hitSongtitle) {
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongId = hitSongId;
		this.hitSongtitle = hitSongtitle;
	}
	// List 할 경우 사용되는 생성자
	public GirlGroup(int gid, String name, LocalDate debut, String hitSongtitle) {
		super();
		this.gid = gid;
		this.name = name;
		this.debut = debut;
		this.hitSongtitle = hitSongtitle;
	}
	@Override
	public String toString() {
		return "GirlGroup [gid=" + gid + ", name=" + name + ", debut=" + debut 
				+ ", hitSongtitle=" + hitSongtitle + "]";
	}
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public int getHitSongId() {
		return hitSongId;
	}
	public void setHitSongId(int hitSongId) {
		this.hitSongId = hitSongId;
	}
	public String getHitSongtitle() {
		return hitSongtitle;
	}
	public void setHitSongtitle(String hitSongtitle) {
		this.hitSongtitle = hitSongtitle;
	}
	
}
