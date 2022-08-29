package com.pension.service;

import java.util.List;

import com.pension.entity.Pension;

public interface PensionService {

	List<Pension> getAllPensions();
	Pension savePension(Pension pension);
	Pension getPensionById(Long id);
	Pension updatePension(Pension pension);
	void deletePensionById(Long id);
}


