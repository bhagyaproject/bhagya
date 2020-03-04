package com.app.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IDocumentDao;
import com.app.model.Document;
import com.app.service.IDocumentService;

@Service
public class DocumentServiceImpl implements IDocumentService {

	@Autowired
	private IDocumentDao dao;

	@Transactional
	public Integer saveDocument(Document dac) {
		return dao.saveDocument(dac);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getfileIdAndNames() {
		return dao.getfileIdAndNames();
	}

	@Transactional(readOnly = true)
	public Document getOneDocument(Integer id) {
		return dao.getOneDocument(id);
	}

}
