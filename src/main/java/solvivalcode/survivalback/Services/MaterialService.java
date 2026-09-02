package solvivalcode.survivalback.Services;

import solvivalcode.survivalback.Model.entities.Material;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solvivalcode.survivalback.Repositories.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }   

}
