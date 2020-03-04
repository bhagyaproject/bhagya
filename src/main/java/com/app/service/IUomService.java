package com.app.service;

import java.util.List;
import com.app.model.Uom;

public interface IUomService {

	Integer saveUom(Uom obj);

	List<Uom> getAllUom();

	public void deleteUom(Integer id);

	Uom getOneUom(Integer id);

	void updateUom(Uom obj);

}
