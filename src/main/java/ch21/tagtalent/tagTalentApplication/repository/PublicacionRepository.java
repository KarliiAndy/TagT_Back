package ch21.tagtalent.tagTalentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch21.tagtalent.tagTalentApplication.model.Publicacion;


public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{

}//interface PublicacionRepository