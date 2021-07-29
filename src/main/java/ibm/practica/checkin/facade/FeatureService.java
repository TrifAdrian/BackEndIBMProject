package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.FeatureDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feature")
public class FeatureService implements FeatureController{

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long createFeature(@RequestBody FeatureDto featureDto) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteFeature(@PathVariable("id") Long id) {

    }
}
