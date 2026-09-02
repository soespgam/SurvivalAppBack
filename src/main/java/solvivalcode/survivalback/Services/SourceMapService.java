package solvivalcode.survivalback.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solvivalcode.survivalback.Model.entities.SourceMap;
import solvivalcode.survivalback.Repositories.SourceMapRepository;

@Service
public class SourceMapService {
    @Autowired
    private SourceMapRepository sourceMapRepository;

    public List<SourceMap> getAllMaps() {
        return sourceMapRepository.findAll();
    }

}
