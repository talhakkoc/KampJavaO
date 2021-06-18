package gamesatis.business.concretes;

import gamesatis.business.abstracts.GameService;
import gamesatis.entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() +" adl� oyun eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() +" adl� oyun g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() +" adl� oyun silindi.");
		
	}

}
