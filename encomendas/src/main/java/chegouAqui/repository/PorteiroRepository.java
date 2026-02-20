package chegouAqui.repository;

import chegouAqui.entity.Porteiro;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PorteiroRepository extends JpaRepository <Porteiro, Long> {
    Optional<Porteiro> findByLogin(String login);
}
