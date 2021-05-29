package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements GamerService {
	public void save(Gamer gamer) {
		System.out.println("Oyuncu sisteme kaydedildi");
	}
	
	public void remove(Gamer gamer) {
		System.out.println("Oyuncu sistemden silindi");
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncu sistemde güncellendi");
	}
}
