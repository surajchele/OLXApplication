package com.olx.advertise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.advertise.entity.OlxAdvertise;
import com.olx.advertise.entity.OlxAdvertiseCategoriesStatus;
@Service
public class OlxAdvertiseServiceImplementation implements OlxAdvertiseService {

	static List<OlxAdvertise> advertisement = new ArrayList<OlxAdvertise>();
	static {
		advertisement.add(new OlxAdvertise(1,"Furniture"));
		advertisement.add(new OlxAdvertise(2,"Cars"));
		advertisement.add(new OlxAdvertise(3,"Mobiles"));
		advertisement.add(new OlxAdvertise(4,"Real Estate"));    
		advertisement.add(new OlxAdvertise(5,"Sports"));
	}
	
	static List<OlxAdvertiseCategoriesStatus> status = new ArrayList<OlxAdvertiseCategoriesStatus>();
	static {
		status.add(new OlxAdvertiseCategoriesStatus(1,"OPEN"));
		status.add(new OlxAdvertiseCategoriesStatus(2,"CLOSED"));
		status.add(new OlxAdvertiseCategoriesStatus(3,"OPEN"));
		status.add(new OlxAdvertiseCategoriesStatus(4,"CLOSED"));    
		status.add(new OlxAdvertiseCategoriesStatus(5,"OPEN"));
	}
	
	@Override
	public List<OlxAdvertise> allAdvertisementCategories() {
		return advertisement;
	}

	@Override
	public List<OlxAdvertiseCategoriesStatus> advertisementCategoriesStatus() {
	
		return status;
	}

}
