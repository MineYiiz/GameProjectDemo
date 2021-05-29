package Concrete;

import Abstract.BaseGameManager;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager extends BaseGameManager {
   public void campaign(Game game, Campaign campaign) {
	   System.out.println("Yeni" + campaign.getName() + game.getDiscount());
   }
}
