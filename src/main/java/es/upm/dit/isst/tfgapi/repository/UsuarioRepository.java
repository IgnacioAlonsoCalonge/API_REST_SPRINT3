package es.upm.dit.isst.tfgapi.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.isst.tfgapi.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    Usuario findByCorreo(String correo);
}
