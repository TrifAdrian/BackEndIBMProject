package ibm.practica.checkin.facade;

import ibm.practica.checkin.domain.model.ClassDto;
import ibm.practica.checkin.domain.model.Teacher;
import ibm.practica.checkin.domain.model.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


import java.util.List;


public interface UserController {


    @Operation(summary = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All the users were returned", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No user found", content = @Content) })
    List<UserDto> getAllUsers();


    @Operation(summary = "Get all teacher")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All the teachers were returned", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Teacher.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content),
            @ApiResponse(responseCode = "404", description = "No teacher found", content = @Content) })
    List<Teacher> getAllTeachers();

}
