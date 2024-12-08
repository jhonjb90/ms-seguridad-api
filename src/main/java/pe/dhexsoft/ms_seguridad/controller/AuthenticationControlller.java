package pe.dhexsoft.ms_seguridad.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.ms_seguridad.aggregates.request.SingUpRequest;
import pe.dhexsoft.ms_seguridad.entity.Usuario;
import pe.dhexsoft.ms_seguridad.service.AuthenticationService;

import java.util.List;

@RestController
@RequestMapping("api/authentication/v1/")
@RequiredArgsConstructor //inyeccion con la anotacion
public class AuthenticationControlller {

//-----------------------inyeccion por constructor---------------------------------
    private final AuthenticationService authenticationService;



//-----------------------Nuestros EndPoints---------------------------------
    @PostMapping("/signupuser")
    public ResponseEntity<Usuario> signUpUser(@RequestBody SingUpRequest singUpRequest){
        return ResponseEntity.ok(authenticationService.singUpUser(singUpRequest));
    }

    @PostMapping("/signupadmin")
    public ResponseEntity<Usuario> signUpAdmin(@RequestBody SingUpRequest singUpRequest){
        return ResponseEntity.ok(authenticationService.singUpAdmin(singUpRequest));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.ok(authenticationService.todos());
    }

}
