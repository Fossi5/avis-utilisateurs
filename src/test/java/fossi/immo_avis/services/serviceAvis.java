package fossi.immo_avis.services;

import org.springframework.stereotype.Service;

import fossi.immo_avis.entités.Avis;
import fossi.immo_avis.repository.AvisRepository;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class serviceAvis {
    private final AvisRepository avisRepository;

    public void creerAvis(Avis avis) {
        this.avisRepository.save(avis);
    }
}
