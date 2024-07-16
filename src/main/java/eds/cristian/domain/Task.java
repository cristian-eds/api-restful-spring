package eds.cristian.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import eds.cristian.domain.enuns.Priority;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	private LocalDate CompletionDate;
	
	private Priority priority;
	
	private boolean status;
	
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
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", CompletionDate=" + CompletionDate + ", priority="
				+ priority + ", status=" + status + "]";
	}
	

}
