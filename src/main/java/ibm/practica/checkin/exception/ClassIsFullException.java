package ibm.practica.checkin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT,reason = "Classroom is full cannot participate to class!")
public class ClassIsFullException extends RuntimeException{

    public ClassIsFullException() {
        super();
    }
}
