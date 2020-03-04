package com.app.dao.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer saveShipmentType(ShipmentType obj) {
		return (Integer) ht.save(obj);
	}

	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}

	public void deleteShipmentType(Integer id) {
		ht.delete(new ShipmentType(id));
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}

	@Override
	public void updateShipmentType(ShipmentType obj) {
		ht.update(obj);
	}

	@Override
	public List<Object[]> getShipmentModeCount() {
		String hql = "  select shipMode,count(shipMode)  " + " from  com.app.model.ShipmentType  "
				+ " group by shipMode ";
		return (List<Object[]>) ht.find(hql);
	}

}
