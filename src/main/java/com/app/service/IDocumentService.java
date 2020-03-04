package com.app.service;

import java.util.List;
import com.app.model.Document;

public interface IDocumentService {

	public Integer saveDocument(Document dac);

	public List<Object[]> getfileIdAndNames();

	public Document getOneDocument(Integer id);
}
