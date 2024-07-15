package eds.cristian.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eds.cristian.domain.Task;
import eds.cristian.domain.repository.ITaskRepository;
import eds.cristian.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private ITaskRepository taskRepository;

	@Override
	public Task findById(Long id) {
		return taskRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Task create(Task taskToCreate) {
		return taskRepository.save(taskToCreate);
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

}
