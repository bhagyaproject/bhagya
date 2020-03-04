package com.app.service.Impl;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomDao;
import com.app.model.Uom;
import com.app.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {

	@Autowired
	private IUomDao dao;

	@Transactional
	public Integer saveUom(Uom obj) {
		return dao.saveUom(obj);
	}

	@Transactional(readOnly = true)
	public List<Uom> getAllUom() {
		List<Uom> list = dao.getAllUom();
		Collections.sort(list, (I1, I2) -> I1.getUomId() - I2.getUomId());
		return list;
	}

	@Transactional
	public void deleteUom(Integer id) {
		dao.deleteUom(id);
	}

	@Transactional(readOnly = true)
	public Uom getOneUom(Integer id) {
		return dao.getOneUom(id);
	}

	@Transactional
	public void updateUom(Uom obj) {
		dao.updateUom(obj);
	}

}
