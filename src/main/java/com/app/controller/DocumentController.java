package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
@RequestMapping("/doc")
public class DocumentController {

	@Autowired
	private IDocumentService service;

	// 1.show document upload page
	@RequestMapping("/show")
	public String showUploadPage(Model model) {
		List<Object[]> list = service.getfileIdAndNames();
		model.addAttribute("list", list);
		return "Document";
	}

	// 2.upload data into DB
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String doUpload(@RequestParam Integer fileId, @RequestParam CommonsMultipartFile fileob, Model model) {
		if (fileob != null) {
			Document doc = new Document();
			doc.setFileId(fileId);
			doc.setFileName(fileob.getOriginalFilename());
			doc.setFileData(fileob.getBytes());
			service.saveDocument(doc);
			String msg = fileId + "is uploaded";
			model.addAttribute("message", msg);

		}

		return "redirect:show";
	}
	@RequestMapping("/download")
	public void doDownload(@RequestParam("fid") Integer fid, HttpServletResponse resp) {
		Document doc = service.getOneDocument(fid);
		resp.addHeader("Content-Disposition", "attachment;filename=" + doc.getFileName());

		try {

			FileCopyUtils.copy(doc.getFileData(), resp.getOutputStream());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
