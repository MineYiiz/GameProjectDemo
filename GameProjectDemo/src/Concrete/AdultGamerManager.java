package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class AdultGamerManager extends BaseGamerManager {
	private GamerCheckService _gamerCheckService;

	public AdultGamerManager(GamerCheckService gamerCheckService) {
		_gamerCheckService = gamerCheckService;
	}

	public void Save(Gamer gamer) {
		if (_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu sisteme kaydedildi");
		} else {
			System.out.println("Geçerli bir kiþi deðil");
		}
	}

}
