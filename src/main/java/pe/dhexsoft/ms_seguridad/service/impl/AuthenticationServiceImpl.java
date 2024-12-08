package pe.dhexsoft.ms_seguridad.service.impl;

import org.springframework.stereotype.Service;
import pe.dhexsoft.ms_seguridad.aggregates.constants.Constants;
import pe.dhexsoft.ms_seguridad.aggregates.request.SingUpRequest;
import pe.dhexsoft.ms_seguridad.entity.Rol;
import pe.dhexsoft.ms_seguridad.entity.Role;
import pe.dhexsoft.ms_seguridad.entity.Usuario;
import pe.dhexsoft.ms_seguridad.repository.RolRepository;
import pe.dhexsoft.ms_seguridad.repository.UsuarioRepository;
import pe.dhexsoft.ms_seguridad.service.AuthenticationService;

import java.util.Collections;
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
        Usuario usuario = getUsuarioEntity(signUpRequest);
        usuario.setRoles(Collections.singleton(getRoles(Role.USER)));
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario singUpAdmin(SingUpRequest signUpRequest) {
        Usuario usuario = getUsuarioEntity(signUpRequest);
        usuario.setRoles(Collections.singleton(getRoles(Role.ADMIN)));
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> todos() {
        return usuarioRepository.findAll();
    }


    //-----------------------metodos de apoyo ---------------------------------
    private Usuario getUsuarioEntity(SingUpRequest singUpRequest){
        return Usuario.builder()
                .nombres(singUpRequest.getNombres())
                .apellidos(singUpRequest.getApellidos())
                .email(singUpRequest.getEmail())
                .password(singUpRequest.getPassword())
                .tipoDoc(singUpRequest.getTipoDoc())
                .numDoc(singUpRequest.getNumDoc())
                .isAccountNonExpired(Constants.STATUS_ACTIVE)
                .isAccountNonLocked(Constants.STATUS_ACTIVE)
                .isCredentialNonExpired(Constants.STATUS_ACTIVE)
                .isEnabled(Constants.STATUS_ACTIVE)
                .build();
    }

    private Rol getRoles(Role rolBuscado){
        return rolRepository.findByNombreRol(rolBuscado.name())
                .orElseThrow(
                        () -> new RuntimeException("ERROR EL ROL NO EXISTE:" + rolBuscado.name()));
    }
}
