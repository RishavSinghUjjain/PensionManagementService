package com.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pension.entity.Pension;
import com.pension.service.PensionService;

@Controller
public class PensionController {

		private PensionService pensionService;
		public PensionController(PensionService pensionService) {
			super();
			this.pensionService= pensionService;
		}
		@GetMapping("/pensions")
		public String listAllPensione(Model model) {
			model.addAttribute("pension",pensionService.getAllPensions());
			return "pensions";   // pensioners.html we have to created.
	}
		@GetMapping("/pension/new")
		public String createdPensionForm(Model model) {
			Pension pension =new Pension();
			model.addAttribute("pension", pension);
			return "create_pension";
			
		}
		@PostMapping("/pensions")
		public String savePensioner(@ModelAttribute("pension")Pension pension) {
			pensionService.savePension(pension);
			return "redirect:/pensions";
		}
		@PostMapping("/pension/{id}")
		public String updatePensionForm(@PathVariable long id, @ModelAttribute("pension") Pension pension, Model model) {
			Pension p= pensionService.getPensionById(id);
			p.setId(id);
			p.setDA(pension.getDA());

			pensionService.updatePension(p);
			return "redirect:/pensions";
		}
		@GetMapping("/pensions/{id}")
		public String deletePension(@PathVariable long id) {
			pensionService.deletePensionById(id);
			return "redirect:/pensions";
		}

		@GetMapping("/pensions/edit/{id}")
		public String editPensionForm(@PathVariable long id,Model model)
		{
			model.addAttribute("pension",pensionService.getPensionById(id));
			return "edit_Pension";
		}
	
}
