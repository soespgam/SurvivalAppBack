package solvivalcode.survivalback.Model.Dto.Recipe;

import lombok.Data;

@Data
public class RecipeRequestDto {
    private String name;
    private String description;
    private Integer requiredLevel;
    private Integer craftTime;

}
