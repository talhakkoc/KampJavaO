package gamesatis.business.abstracts;

import gamesatis.entities.concretes.Game;
import gamesatis.entities.concretes.Player;

public interface SaleService {
	
	void sale(Player player , Game game);

}
