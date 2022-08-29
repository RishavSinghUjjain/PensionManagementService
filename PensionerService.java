package com.pension.service;

import java.util.List;

import com.pension.entity.Pensioner;

public interface PensionerService {

	List<Pensioner> getAllPensioners();
	Pensioner savePensioner(Pensioner pensioner);
	Pensioner getPensionerById(Long id);
	Pensioner updatePensioner (Pensioner pensioner);
	void deletePensionerById(Long id);
}
