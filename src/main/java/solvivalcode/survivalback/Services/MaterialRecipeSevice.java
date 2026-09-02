package solvivalcode.survivalback.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solvivalcode.survivalback.Model.entities.MaterialRecipe;
import solvivalcode.survivalback.Repositories.MaterialRecipeRepository;

@Service
public class MaterialRecipeSevice {

    @Autowired
    private MaterialRecipeRepository materialRecipeRepository;

    public List<MaterialRecipe> getAllMaterialRecipes() {
        return materialRecipeRepository.findAll();
    }

}
