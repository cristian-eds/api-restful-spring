package eds.cristian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eds.cristian.domain.Task;
import eds.cristian.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskService service;
	
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Task> getById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	

}
