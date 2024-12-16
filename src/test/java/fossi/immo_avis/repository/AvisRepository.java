package fossi.immo_avis.repository;

import org.springframework.data.repository.CrudRepository;

import fossi.immo_avis.entités.Avis;

public interface AvisRepository extends CrudRepository<Avis, Integer> {
    
}
