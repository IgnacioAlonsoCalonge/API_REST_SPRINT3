package es.upm.dit.isst.resumen.repository;

import org.springframework.data.repository.CrudRepository;

import es.upm.dit.isst.resumen.model.Resumen;

import java.util.List;
    
public interface ResumenRepository extends CrudRepository<Resumen, Long> {
   
   }
   