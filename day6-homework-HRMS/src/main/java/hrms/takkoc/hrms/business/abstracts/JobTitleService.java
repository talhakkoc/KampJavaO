package hrms.takkoc.hrms.business.abstracts;

import java.util.List;
import hrms.takkoc.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	List<JobTitle> getAll();
	
}
