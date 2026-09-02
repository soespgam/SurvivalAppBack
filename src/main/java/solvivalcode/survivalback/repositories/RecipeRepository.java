package solvivalcode.survivalback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import solvivalcode.survivalback.Model.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
