package com.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pension.entity.Pensioner;
import com.pension.service.PensionerService;

@Controller
public class PensionerController {
	private PensionerService pensionerService;
	public PensionerController(PensionerService pensionerService) {
		super();
		this.pensionerService= pensionerService;
	}
	@GetMapping("/pensioners")
	public String listAllPensioners(Model model) {
		model.addAttribute("pensioners",pensionerService.getAllPensioners());
		return "pensioners";   // pensioner.html we have to created.
}
	@GetMapping("/pensioners/new")
	public String createdPensionerForm(Model model) {
		Pensioner pensioner =new Pensioner();
		model.addAttribute("pensioner", pensioner);
		return "create_pensioner";
		
	}
	@PostMapping("/pensioners")
	public String savePensioner(@ModelAttribute("pensioner")Pensioner pensioner) {
		pensionerService.savePensioner(pensioner);
		return "redirect:/pensioners";
	}
	@PostMapping("/pensioner/{id}")
	public String updatePensionerForm(@PathVariable long id, @ModelAttribute("pensioner") Pensioner pensioner, Model model) {
		Pensioner p= pensionerService.getPensionerById(id);
		p.setId(id);
		p.setMobile(pensioner.getMobile());
		p.setEmailId(pensioner.getEmailId());
		p.setAddress(pensioner.getAddress());
		p.setDearnessAllowance(pensioner.getDearnessAllowance());
		p.setLiveCertificate(pensioner.getLiveCertificate());
//		p.setImage(pensioner.getImage());
		pensionerService.updatePensioner(p);
		return "redirect:/pensioners";
	}
	@GetMapping("/pensioners/{id}")
	public String deletePensioner(@PathVariable long id) {
		pensionerService.deletePensionerById(id);
		return "redirect:/pensioners";
	}

	@GetMapping("/pensioners/edit/{id}")
	public String editPensionerForm(@PathVariable long id,Model model)
	{
		model.addAttribute("pensioner",pensionerService.getPensionerById(id));
		return "edit_Pensioner";
	}
}
