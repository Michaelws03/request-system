package events.resources;

import events.models.Evento;
import events.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/evento")
public class EventoResource {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public Iterable<Evento> listaEventos() {
        return eventoRepository.findAll();
    }

    @PostMaping
    public Evento cadastraEvento(@RequestBody @Valid Evento evento) {
        return eventoRepository.save(evento);
    }
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaEvento(@RequestBody Evento evento) {
        eventoRepository.delete(evento);

    }


}
