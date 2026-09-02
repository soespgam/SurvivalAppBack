package solvivalcode.survivalback.Services;

import java.util.List;
import solvivalcode.survivalback.Model.entities.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solvivalcode.survivalback.Repositories.MapRepository;

@Service
public class MapService {
    @Autowired
    private  MapRepository mapRepository;

    public List<Map> getAllMaps() {
        return mapRepository.findAll();
    }

  
}
