package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.ShipmentType;
import com.app.model.Uom;
import com.app.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {

	@Autowired
	private IUomService service;

	@RequestMapping("/reg")
	public String showUomPage() {
		return "Uom";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUom(@ModelAttribute Uom uom, Model model) {
		Integer id = service.saveUom(uom);
		String message = "Uom" + id + "saved";
		model.addAttribute("message", message);
		return "Uom";

	}

	@RequestMapping("/all")
	public String getAllUom(Model model) {
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "uomData";

	}

	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uomid") int uomid, Model model) {
		service.deleteUom(uomid);
		String message = "uom" + uomid + "Deleted";
		model.addAttribute("message", message);
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "uomData";
	}

	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("uomid") int uomid, Model model) {
		Uom uom = service.getOneUom(uomid);
		model.addAttribute("uom", uom);
		return "uomEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUom(@ModelAttribute Uom uom, Model model) {
		service.updateUom(uom);
		String message = "Uom" + uom.getUomId() + "update";
		model.addAttribute("message", message);
		List<Uom> list = service.getAllUom();
		model.addAttribute("list", list);
		return "uomData";

	}

	@RequestMapping("/view")
	public String showOneUom(@RequestParam("uomid") int uomid, Model model) {
		Uom uom = service.getOneUom(uomid);
		model.addAttribute("ob", uom);
		return "uomView";
	}

}