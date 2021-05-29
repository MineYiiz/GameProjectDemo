import java.time.LocalDate;

import Abstract.BaseGameManager;
import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.AdultGamerManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer= new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Mine");
		gamer.setLastName("Yiðiz");
		gamer.setBirthDate(LocalDate.of(1994, 10, 23));
		gamer.setNationalityId("32576407846");
		
		BaseGamerManager baseGamerManager = new AdultGamerManager(new MernisServiceAdapter());
		baseGamerManager.save(gamer);
		
		Game Pubg= new Game();
		Pubg.setId(1);
		Pubg.setName("PUBG");
		Pubg.setDetail("Saldýrý oyunu");
		Pubg.setDiscount(15);
		Pubg.setUnitPrice(20);
		
		Campaign campaign= new Campaign(1, "Yaz Kampanyasý");
		
	    GameManager gameManager = new GameManager();
	    gameManager.buy(Pubg,gamer);
	    
	  
	}

}
