package com.pension.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pension.entity.Pension;
import com.pension.repository.PensionRepository;
import com.pension.service.PensionService;

@Service
public class PensionServiceImmpl implements PensionService {
	
		private PensionRepository pensionRepository;
		
		public PensionServiceImmpl(PensionRepository pensionRepository) {
			super();
			this.pensionRepository = pensionRepository;
		}

		@Override
		public List<Pension> getAllPensions() {
			// TODO Auto-generated method stub
			return pensionRepository.findAll();
		}

		@Override
		public Pension savePension(Pension pension) {
			// TODO Auto-generated method stub
			return pensionRepository.save(pension);
		}

		@Override
		public Pension getPensionById(Long id) {
			// TODO Auto-generated method stub
			return pensionRepository.findById(id).get();
		}

		@Override
		public Pension updatePension(Pension pension) {
			// TODO Auto-generated method stub
			return pensionRepository.save(pension);
		}

		@Override
		public void deletePensionById(Long id) {
			// TODO Auto-generated method stub
			pensionRepository.deleteById(id);
		}
		
}
