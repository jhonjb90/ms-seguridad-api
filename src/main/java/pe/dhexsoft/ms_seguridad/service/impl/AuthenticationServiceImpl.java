package pe.dhexsoft.ms_seguridad.service.impl;

import org.springframework.stereotype.Service;
import pe.dhexsoft.ms_seguridad.aggregates.request.SingUpRequest;
import pe.dhexsoft.ms_seguridad.entity.Usuario;
import pe.dhexsoft.ms_seguridad.repository.RolRepository;
import pe.dhexsoft.ms_seguridad.repository.UsuarioRepository;
import pe.dhexsoft.ms_seguridad.service.AuthenticationService;

import java.util.List;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    //-----------------------inyeccion por constructor---------------------------------
    private final UsuarioRepository usuarioRepository;
    private final RolRepository rolRepository;
    public AuthenticationServiceImpl(UsuarioRepository usuarioRepository, RolRepository rolRepository) {
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
    }

    //-----------------------metodos---------------------------------
    @Override
    public Usuario singUpRequest(SingUpRequest signUpRequest) {
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


    //-----------------------metodos de apoyo ---------------------------------
}
