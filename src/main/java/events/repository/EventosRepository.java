package events.repository;

import events.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventosRepository extends JpaRepository<Evento, String> {
}
