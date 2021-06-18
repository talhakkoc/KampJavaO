package gamesatis.business.concretes;

import gamesatis.business.abstracts.SaleService;
import gamesatis.entities.concretes.Game;
import gamesatis.entities.concretes.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Game game) {
		double  price = game.getPrice();
		
		if(price==game.getPrice()) {
			System.out.println(game.getName()+" adl� oyun -->" + player.getFirstName()+" adl� oyuncuya "
					+ price +" fiyata sat�ld�");
		}else {
			System.out.println(game.getName()+" adl� oyun -->" + player.getFirstName()+" adl� oyuncuya "
					+ price +" -100 fiyata indirimli sat�ld�");
		}
	}

}
