package fossi.immo_avis.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import fossi.immo_avis.entités.Avis;
import fossi.immo_avis.services.serviceAvis;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
@RequestMapping("/avis")
@RestController
public class AvisController {
    private final serviceAvis serviceAvis;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/creer")
    public void creerAvis(@RequestBody Avis avis) {
        this.serviceAvis.creerAvis(avis);
    }
}
