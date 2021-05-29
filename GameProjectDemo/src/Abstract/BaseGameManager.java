package Abstract;

import Entities.Game;

public abstract class BaseGameManager implements GameService {
	public void add(Game game) {
		System.out.println("Oyun sisteme eklendi");
	}
	
	public void update(Game game) {
		System.out.println("Oyun sistemde güncellendi");
	}
	
	public void remove(Game game) {
		System.out.println("Oyun sistemden silindi");
	}
}
