package Concrete;

import Abstract.BaseGameManager;
import Entities.Game;
import Entities.Gamer;

public class GameManager extends BaseGameManager {
   public void buy(Game game, Gamer gamer) {
	   System.out.println(gamer.getFirstName() + " " + game.getName() + " " + "Satýn alma onaylandý");
   }
}
