package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.FeatureDto;
import ibm.practica.checkin.services.Feature.FeaturePersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feature")
public class FeatureService implements FeatureController{

    @Autowired
    private FeaturePersistenceService featurePersistenceService;




    @Override
    @DeleteMapping("/{id}/{classroomId}")
    public void deleteFeature(@PathVariable("id") Long id,@PathVariable("classroomId") Long classroomId) {
        featurePersistenceService.deleteFeature(id,classroomId);
    }

    @GetMapping("/{id}")
    public List<FeatureDto> getAllFeatures(@PathVariable("id") Long id) {
        return featurePersistenceService.getAllFeatures(id);
    }


}
