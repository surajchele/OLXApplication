package com.olx.advertise.service;

import java.util.List;

import com.olx.advertise.entity.OlxAdvertise;
import com.olx.advertise.entity.OlxAdvertiseCategoriesStatus;

public interface OlxAdvertiseService {
	List<OlxAdvertise> allAdvertisementCategories();
	List<OlxAdvertiseCategoriesStatus> advertisementCategoriesStatus();

}
