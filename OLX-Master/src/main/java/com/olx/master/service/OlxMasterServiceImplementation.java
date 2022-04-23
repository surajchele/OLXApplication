package com.olx.master.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.master.entity.Advertises;
import com.olx.master.entity.OlxMaster;

@Service
public class OlxMasterServiceImplementation implements OlxMasterService{
	
	
	static List<OlxMaster> master=new ArrayList<OlxMaster>();
	Advertises advertises1=new Advertises(master);
	static {
		master.add(new OlxMaster(1,"laptop sale",54000,"Electronic goods","intel core 3 Sony Vaio","anand","2022-04-21","2022-04-22","OPEN"));
	}

	@Override
	public List<OlxMaster> getAllAdvertise() {
		return master;
	}

	@Override
	public OlxMaster getAdvetise(long id) {
		for (OlxMaster olxMaster : master) {
			if (olxMaster.getId() == id) {
				return olxMaster;
			}
		}
		return null;
	}
	@Override
	public OlxMaster createNewAdvetise(OlxMaster olxMaster, String token) {
		if(token.equals("SC66579")) {
			master.add(olxMaster);
			return olxMaster;
		}else {
		return null;
		}
	}

	@Override
	public OlxMaster updateAdvertise(int adId,OlxMaster olxMaster) {
		OlxMaster availableAdvertise = getAdvetise(adId);
		availableAdvertise.setId(olxMaster.getId());
		availableAdvertise.setTitle(olxMaster.getTitle());
		availableAdvertise.setPrice(olxMaster.getPrice());
		availableAdvertise.setCategory(olxMaster.getCategory());
		availableAdvertise.setDescription(olxMaster.getDescription());
		availableAdvertise.setUsername(olxMaster.getUsername());
		availableAdvertise.setCreatedDate(olxMaster.getCreatedDate());
		availableAdvertise.setModifiedDate(olxMaster.getModifiedDate());
		availableAdvertise.setStatus(olxMaster.getStatus());
		return availableAdvertise;
	}

	@Override
	public boolean DeleteAdvertise(long adId) {
		for (OlxMaster olxMaster : master) {
			if (olxMaster.getId() == adId) {
				master.remove(olxMaster);
				return true;
			}
				
		}return false;

	}

	@Override
	public Advertises SearchFilterAdvertisements() {
		return advertises1;
	}

	@Override
	public Advertises SearchFilter() {
		return advertises1;
	}

	@Override
	public OlxMaster getAdvetises(long id) {
		for (OlxMaster olxMaster : master) {
			if (olxMaster.getId() == id) {
				return olxMaster;
			}
		}
		return null;
	}
	


}
