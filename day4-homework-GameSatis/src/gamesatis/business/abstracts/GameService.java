package gamesatis.business.abstracts;

import gamesatis.entities.concretes.Game;

public interface GameService {
	
	void add(Game game);
	
	void update (Game game);
	
	void delete(Game game);

}
