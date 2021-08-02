package ibm.practica.checkin.facade;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.db.model.Feature;
import ibm.practica.checkin.domain.model.FeatureDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;

public interface FeatureController {

    @Operation(summary = "Add a classroom to the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The feature was created", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = FeatureDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    Long createFeature(FeatureDto featureDto);

    @Operation(summary = "Deletes a feature")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Feature deleted succesfully", content = {
                    @Content(mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Id not found", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })

    void deleteFeature(Long id,Long classroomId);

    List<FeatureDto> getAllFeatures(Long id);

}
