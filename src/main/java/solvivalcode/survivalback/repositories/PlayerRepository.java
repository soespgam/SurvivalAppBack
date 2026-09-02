package solvivalcode.survivalback.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import solvivalcode.survivalback.Model.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
