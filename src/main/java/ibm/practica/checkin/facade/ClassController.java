package ibm.practica.checkin.facade;

import ibm.practica.checkin.db.model.Class;
import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.ClassEnrollStudent;
import ibm.practica.checkin.domain.model.StudentDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.List;
import java.util.Optional;

public interface ClassController {

    @Operation(summary = "Add a class to the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The class was added", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ClassDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    Long createClass(ClassDto classDto);

    @Operation(summary = "Find a class by a certain id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The class was found", content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = ClassDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No class found", content = @Content) })
    Optional<ClassDto> findClass(Long id);

    @Operation(summary = "Get all classes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All the classes were returned", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ClassDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No class found", content = @Content) })
    List<ClassDto> getAllClasses();

    @Operation(summary = "updates the information of a class")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated successfully", content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = ClassDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    ClassDto updateClass(ClassDto classDto);

    @Operation(summary = "Delete class")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleted class succesfully", content = {
                    @Content(mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", description = "Id not found", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    void delete (Long id);

    @Operation(summary = "Adds a new student to the student list")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Updated successfully", content = {
                    @Content(mediaType = "application/json",schema = @Schema(implementation = ClassDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content) })
    ClassEnrollStudent enrolToClass (ClassEnrollStudent classEnrollStudent);


}
