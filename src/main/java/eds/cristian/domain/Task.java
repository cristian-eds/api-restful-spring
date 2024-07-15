package eds.cristian.domain;

import java.time.LocalDate;

import eds.cristian.domain.enuns.Priority;
import eds.cristian.domain.enuns.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	private LocalDate CompletionDate;
	
	private Priority priority;
	
	private Status status;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getCompletionDate() {
		return CompletionDate;
	}
	public void setCompletionDate(LocalDate completionDate) {
		CompletionDate = completionDate;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	
	
	
	

}
