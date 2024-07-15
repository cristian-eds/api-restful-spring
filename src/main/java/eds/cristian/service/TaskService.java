package eds.cristian.service;

import java.util.List;

import eds.cristian.domain.Task;

public interface TaskService {
	
	Task findById(Long id);
	
	Task create(Task taskToCreate);
	
	List<Task> findAll();
	
	void delete(Long id);

}
