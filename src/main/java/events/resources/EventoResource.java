package events.resources;


import events.models.Evento;
import events.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evento")
public class EventoResource {

    @Autowired
    private EventosRepository er;

    @GetMapping(produces = "application/json")
    public @ResponseBody
    Iterable<Evento> Iterable<Evento> listaEventos() {
        Iterable<Evento> listaEventos = er.findAll();
        return listaEventos;
    }

    @PostMaping()
    public Evento cadastraEvento(@RequestBod @Valid Evento evento) {
        return er.save(evento);
    }
    @DeleteMapping()
    public Evento deletaEvento(@RequestBody evento evento) {
        return er.delete(evento);
        return evento;

    }






}
