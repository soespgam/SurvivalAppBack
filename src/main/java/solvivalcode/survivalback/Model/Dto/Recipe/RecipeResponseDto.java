package solvivalcode.survivalback.Model.Dto.Recipe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeResponseDto {
    private Long id;
    private String name;
    private String description;
    private Integer requiredLevel;
    private Integer craftTime;
}
