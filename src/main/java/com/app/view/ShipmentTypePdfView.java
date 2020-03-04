package com.app.view;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.mysql.fabric.xmlrpc.base.Data;

public class ShipmentTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// download file
		response.addHeader("Content-Disposition", "attachment;filename=shipment.pdf");

		// create element
		Paragraph p = new Paragraph("welcome to shipmenttype");

		// add element
		document.add(p);

		// read data from model
		List<ShipmentType> list = (List<ShipmentType>) model.get("list");

		// create table with no of columns
		PdfPTable t = new PdfPTable(6);
		t.addCell("Id");
		t.addCell("Mode");
		t.addCell("code");
		t.addCell("Enable");
		t.addCell("Grade");
		t.addCell("Note");

		// adding data to table

		for (ShipmentType st : list) {
			t.addCell(st.getShipId().toString());
			t.addCell(st.getShipMode());
			t.addCell(st.getShipCode());
			t.addCell(st.getEnbShip());
			t.addCell(st.getShipGrade());
			t.addCell(st.getShipDesc());
		}
		// add table to document
		document.add(t);

		// print date and time
		document.add(new Paragraph(new Data().toString()));

	}
}
