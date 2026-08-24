package solvivalcode.survivalback.Model.Dto.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapResponseDto {
    private Long id;
    private String name;
    private String description;
    private Integer minimumLevel;
    private String climate;
    private String imageUrl;
}
