package chegouAqui.repository;

import chegouAqui.entity.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <Morador, Long> {
}
