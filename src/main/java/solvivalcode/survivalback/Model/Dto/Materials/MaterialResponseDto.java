package solvivalcode.survivalback.Model.Dto.Materials;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaterialResponseDto {
    private Long id;
    private String name;
    private String description;
    private Long materialTypeId;
    private String materialTypeName;
    private String rarity;
    private String iconUrl;

}
