package pe.edu.cibertec.sw_rest_pinturas_t2.exception;

public class ResourceNotFoundException
    extends RuntimeException {

    public ResourceNotFoundException(String message){
        super(message);
    }
}
