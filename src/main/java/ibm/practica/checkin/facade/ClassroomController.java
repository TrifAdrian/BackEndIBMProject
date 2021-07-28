package ibm.practica.checkin.facade;

import ibm.practica.checkin.db.model.Classroom;
import ibm.practica.checkin.domain.model.ClassroomDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;
import java.util.Optional;

public interface ClassroomController {

    @Operation(summary = "Add a classroom to the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The classroom was added", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Classroom.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    Long createClassroom(ClassroomDto classroomDto);

    @Operation(summary = "Find a classroom by a certain id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The classroom was found", content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = Classroom.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No classroom found", content = @Content) })
    Optional<ClassroomDto> findClassroom(Long id);

    @Operation(summary = "Get all classes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All the classes were returned", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Classroom.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No classroom found", content = @Content) })
    List<ClassroomDto> getAllClassroom();


}
