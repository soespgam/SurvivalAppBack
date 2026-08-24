package solvivalcode.survivalback.Model.Dto.RecipeMaterial;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeDetailResponseDto {
    private Long id;
    private String name;
    private String description;
    private Integer requiredLevel;
    private Integer craftTime;
    private List<RecipeMaterialDto> materials;

}
