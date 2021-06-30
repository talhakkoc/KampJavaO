package hrms.takkoc.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.takkoc.hrms.business.abstracts.JobTitleService;
import hrms.takkoc.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleController {
	
	@Autowired
	private JobTitleService jobTitleServic;
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleServic.getAll();
	}
}
