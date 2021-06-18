package gamesatis.business.concretes;

import gamesatis.adapters.PlayerCheckService;
import gamesatis.business.abstracts.PlayerService;
import gamesatis.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " isimli oyuncu eklendi.");
		}else {
			System.out.println("not a valid person.");
		}
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " isimli oyuncu silindi.");
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " isimli oyuncu güncellendi.");
	}

}
