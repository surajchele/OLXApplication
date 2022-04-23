package com.olx.master.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.olx.master.entity.Advertises;
import com.olx.master.entity.OlxMaster;

public interface OlxMasterService {
	
	List<OlxMaster> getAllAdvertise();
	
	OlxMaster getAdvetise(long id);
	
	OlxMaster createNewAdvetise(OlxMaster olxMaster, String token);
	
	OlxMaster updateAdvertise(int adId, OlxMaster olxMaster);
	
	boolean DeleteAdvertise(@PathVariable("adId") long adId);
	
	Advertises SearchFilterAdvertisements() ;
	
	 Advertises SearchFilter();
	 OlxMaster getAdvetises(long id);

}
