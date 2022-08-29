package com.pension.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pension.entity.Pensioner;
import com.pension.repository.PensionerRepository;
import com.pension.service.PensionerService;

@Service
public class PensionerServiceImpl implements PensionerService{
	private PensionerRepository pensionerRepository;
	public  PensionerServiceImpl(PensionerRepository pensionerRepository)
	{
		super();
		this.pensionerRepository=pensionerRepository;
	}
	@Override
	public List<Pensioner> getAllPensioners() {
		// TODO Auto-generated method stub
		return pensionerRepository.findAll();
	}
	@Override
	public Pensioner savePensioner(Pensioner pensioner) {
		// TODO Auto-generated method stub
		return pensionerRepository.save(pensioner);
	}
	@Override
	public Pensioner getPensionerById(Long id) {
		// TODO Auto-generated method stub
		return pensionerRepository.findById(id).get();
	}
	@Override
	public Pensioner updatePensioner(Pensioner pensioner) {
		// TODO Auto-generated method stub
		return pensionerRepository.save(pensioner);
	}
	@Override
	public void deletePensionerById(Long id) {
		// TODO Auto-generated method stub
		pensionerRepository.deleteById(id);
	}

	
}



