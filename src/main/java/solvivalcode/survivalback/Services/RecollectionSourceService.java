package solvivalcode.survivalback.Services;

import org.springframework.stereotype.Service;

import solvivalcode.survivalback.Model.entities.RecollectionSource;
import solvivalcode.survivalback.Repositories.RecollectionSourceRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RecollectionSourceService {
    @Autowired
    private RecollectionSourceRepository recollectionSourceRepository;

    public List<RecollectionSource> getAllRecollectionSources() {
        return recollectionSourceRepository.findAll();
    }

}
