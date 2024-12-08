package pe.dhexsoft.ms_seguridad.service;

import pe.dhexsoft.ms_seguridad.aggregates.request.SingUpRequest;
import pe.dhexsoft.ms_seguridad.entity.Usuario;

import java.util.List;

public interface AuthenticationService {

    //SIGNUP --> REGISTRARSE
    Usuario singUpUser(SingUpRequest signUpRequest);

    Usuario singUpAdmin(SingUpRequest signUpRequest);

    List<Usuario> todos();
}
