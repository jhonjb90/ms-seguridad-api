package pe.dhexsoft.ms_seguridad.service.impl;

import org.springframework.stereotype.Service;
import pe.dhexsoft.ms_seguridad.aggregates.request.SingUpRequest;
import pe.dhexsoft.ms_seguridad.entity.Usuario;
import pe.dhexsoft.ms_seguridad.repository.UsuarioRepository;
import pe.dhexsoft.ms_seguridad.service.AuthenticationService;

import java.util.List;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    //inyeccion por constructor
    public final UsuarioRepository usuarioRepository;
    public AuthenticationServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public Usuario SingUpRequest(SingUpRequest signUpRequest) {
        return null;
    }

    @Override
    public Usuario singUpAdmin(SingUpRequest signUpRequest) {
        return null;
    }

    @Override
    public List<Usuario> todos() {
        return List.of();
    }
}
