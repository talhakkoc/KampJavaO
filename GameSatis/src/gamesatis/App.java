package gamesatis;

import gamesatis.adapters.MernisServiceAdapter;
import gamesatis.business.concretes.PlayerManager;
import gamesatis.business.concretes.SaleManager;
import gamesatis.entities.concretes.Game;
import gamesatis.entities.concretes.Player;

public class App {

	public static void main(String[] args) {

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(new Player(1,"talha","akkoç","10139028318",1996));
		
		SaleManager sm = new SaleManager();
		sm.sale(new Player(1,"talha","akkoç","10139028318",1996), new Game(1, "fifa", 400));
	}

}
