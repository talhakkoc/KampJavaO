package gamesatis.business.abstracts;

import gamesatis.entities.concretes.Campaign;

public interface CampaignService {

	void add(Campaign campaign);
	
	void delete(Campaign campaign);
	
	void update(Campaign campaign);
}
