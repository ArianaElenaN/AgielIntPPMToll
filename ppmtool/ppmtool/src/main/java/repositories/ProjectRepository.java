package repositories;

import io.aglainintelligence.ppmtool.Domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
