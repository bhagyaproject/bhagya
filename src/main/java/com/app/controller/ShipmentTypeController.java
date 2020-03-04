package com.app.controller;

import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.util.ShipmentTypeUtil;
import com.app.view.ShipmentTypeExcelView;
import com.app.view.ShipmentTypePdfView;
import com.mysql.fabric.xmlrpc.base.Array;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {

	@Autowired
	private IShipmentTypeService service;

	@Autowired
	private ServletContext context;

	@Autowired
	private ShipmentTypeUtil util;

	@RequestMapping("/register")
	public String showRegPage() {
		return "shipmentRegestration";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType, Model model) {
		Integer id = service.saveShipmentType(shipmentType);
		String message = "Shipment Type" + id + "Saved";
		model.addAttribute("message", message);
		return "shipmentRegestration";
	}

	@RequestMapping("/all")
	public String getAllShipmentTypes(Model model) {
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";

	}

	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid") Integer id, Model model) {
		service.deleteShipmentType(id);
		String message = "shipment" + id + "Deleed";
		model.addAttribute("message", message);
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);

		return "ShipmentTypeData";
	}

	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("shipmentType", st);
		return "ShipmentTypeEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute ShipmentType st, Model model) {
		service.updateShipmentType(st);
		String message = "ShipmentType" + st.getShipId() + "update";
		model.addAttribute("message", message);
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";

	}

	@RequestMapping("/view")
	public String showOneShipment(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		return "ShipmentTypeView";
	}

	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list = service.getShipmentModeCount();
		String path = context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBar(path, list);
		return "ShipmentTypeCharts";

	}

	// Export data to pdf

	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		if (id == null) {

			List<ShipmentType> list = service.getAllShipmentTypes();

			// sent data to pdf file
			m.addObject("list", list);

		}
		return m;

	}

	// Export data to excel
	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypeExcelView());

		// fetching data from db
		List<ShipmentType> list = service.getAllShipmentTypes();
		m.addObject("list", list);
		return m;

	}

}
