package gamesatis.business.concretes;

import gamesatis.business.abstracts.CampaignService;
import gamesatis.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya eklendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya g�ncellendi.");
		
	}


}
