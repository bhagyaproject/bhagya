package com.app.dao;

import java.util.List;
import com.app.model.Uom;

public interface IUomDao {

	Integer saveUom(Uom obj);

	List<Uom> getAllUom();

	public void deleteUom(Integer id);

	Uom getOneUom(Integer id);

	void updateUom(Uom obj);

}
