package hrms.takkoc.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.takkoc.hrms.business.abstracts.JobTitleService;
import hrms.takkoc.hrms.dataAccess.abstracts.JobTitleDao;
import hrms.takkoc.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	@Autowired
	JobTitleDao jobTitleDao;
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao=jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return jobTitleDao.findAll();
	}

}
