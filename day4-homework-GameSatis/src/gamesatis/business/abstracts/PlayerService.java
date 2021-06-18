package gamesatis.business.abstracts;

import gamesatis.entities.concretes.Player;

public interface PlayerService {
	
	void add(Player player);
	
	void delete(Player player);
	
	void update(Player player);
	
}
