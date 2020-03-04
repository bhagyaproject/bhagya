package com.app.dao;

import java.util.List;

import com.app.model.Document;

public interface IDocumentDao {

	public Integer saveDocument(Document dac);

	public List<Object[]> getfileIdAndNames();

	public Document getOneDocument(Integer id);

}
