package solvivalcode.survivalback.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import solvivalcode.survivalback.Model.entities.Material;

public interface MaterialRepository  extends JpaRepository<Material, Long> {

}
