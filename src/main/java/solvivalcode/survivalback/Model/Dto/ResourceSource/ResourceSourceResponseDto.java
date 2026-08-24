package solvivalcode.survivalback.Model.Dto.ResourceSource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceSourceResponseDto {

    private Long id;
    private String name;
    private String description;
    private Long materialId;
    private String materialName;
    private String sourceType;
    private Integer health;
    private Integer requiredLevel;
}
