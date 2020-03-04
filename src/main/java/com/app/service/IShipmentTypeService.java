package com.app.service;

import java.util.List;
import com.app.model.ShipmentType;

public interface IShipmentTypeService {

	Integer saveShipmentType(ShipmentType obj);

	List<ShipmentType> getAllShipmentTypes();

	public void deleteShipmentType(Integer id);

	ShipmentType getOneShipmentType(Integer id);

	void updateShipmentType(ShipmentType obj);

	public List<Object[]> getShipmentModeCount();
}
