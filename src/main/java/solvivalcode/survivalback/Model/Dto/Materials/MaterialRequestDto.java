package solvivalcode.survivalback.Model.Dto.Materials;

import lombok.Data;

@Data
public class MaterialRequestDto {
    private String name;
    private String description;
    private Long materialTypeId;
    private String rarity;
    private String iconUrl;
}
