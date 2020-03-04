package com.app.service.Impl;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	public Integer saveShipmentType(ShipmentType obj) {
		return dao.saveShipmentType(obj);
	}

	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentTypes() {
		List<ShipmentType> list = dao.getAllShipmentTypes();
		Collections.sort(list, (I1, I2) -> I1.getShipId() - I2.getShipId());
		return list;
	}

	@Transactional
	public void deleteShipmentType(Integer id) {
		dao.deleteShipmentType(id);
	}

	@Transactional(readOnly = true)
	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}

	@Transactional
	public void updateShipmentType(ShipmentType obj) {
		dao.updateShipmentType(obj);
	}

	@Transactional
	public List<Object[]> getShipmentModeCount() {
		return dao.getShipmentModeCount();
	}

}
