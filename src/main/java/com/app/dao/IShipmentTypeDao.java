package com.app.dao;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeDao {

	Integer saveShipmentType(ShipmentType obj);

	List<ShipmentType> getAllShipmentTypes();

	public void deleteShipmentType(Integer id);

	ShipmentType getOneShipmentType(Integer id);

	void updateShipmentType(ShipmentType obj);

	public List<Object[]> getShipmentModeCount();

}
