package mysql.sec03_Song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongbySid(101);
		System.out.println(song);
		System.out.println("==========================================================");
		
		song = songDao.getSongbyTitle("별빛");
		System.out.println(song);
		System.out.println("==========================================================");
		
		 song = new Song("비의랩소디","떠나가요 아주 먼 곳으로");
//		 songDao.insertSong(song);

		 
		 song = songDao.getSongbySid(116);
		 song.setTitle("Love wins all");
		 song.setLyrics("Dearest, Darling, My universe");
		 songDao.updateSong(song);
		 
		 songDao.delete(133);
	
		 List<Song> list = songDao.getSongListAll();
		 list.forEach(x -> System.out.println(x));
		
		 songDao.close();
	}
}
