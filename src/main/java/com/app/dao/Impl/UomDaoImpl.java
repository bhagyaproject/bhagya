package com.app.dao.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.app.dao.IUomDao;
import com.app.model.Uom;

@Repository
public class UomDaoImpl implements IUomDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer saveUom(Uom obj) {
		return (Integer) ht.save(obj);
	}

	public List<Uom> getAllUom() {
		return ht.loadAll(Uom.class);
	}

	public void deleteUom(Integer id) {
		ht.delete(new Uom(id));

	}

	public Uom getOneUom(Integer id) {
		return ht.get(Uom.class, id);
	}

	public void updateUom(Uom obj) {
		ht.update(obj);
	}

}
