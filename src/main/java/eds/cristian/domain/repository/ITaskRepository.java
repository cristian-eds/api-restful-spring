package eds.cristian.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eds.cristian.domain.Task;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Long>{

}
