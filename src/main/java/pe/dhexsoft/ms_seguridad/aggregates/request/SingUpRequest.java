package pe.dhexsoft.ms_seguridad.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SingUpRequest {

    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private String tipoDoc;
    private String numDoc;
}
