package solvivalcode.survivalback.Model.Dto.Map;

import java.util.List;

import jakarta.annotation.Resources;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapDetailResponseDto {
     private Long id;
    private String name;
    private String description;
    private Integer minimumLevel;
    private String climate;
    private List<Resources> sources;

}
