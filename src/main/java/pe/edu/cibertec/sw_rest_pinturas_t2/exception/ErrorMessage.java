package pe.edu.cibertec.sw_rest_pinturas_t2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorMessage {
    private Integer statusCode;
    private Date dateError;
    private String message;
    private String description;
}
