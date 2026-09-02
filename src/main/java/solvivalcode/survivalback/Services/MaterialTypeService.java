package solvivalcode.survivalback.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solvivalcode.survivalback.Model.entities.MaterialType;
import solvivalcode.survivalback.Repositories.MaterialTypeRepository;

@Service
public class MaterialTypeService {
    @Autowired
    private MaterialTypeRepository materialTypeRepository;

    public List<MaterialType> getAllMaterialTypes() {
        return materialTypeRepository.findAll();
    }

}
