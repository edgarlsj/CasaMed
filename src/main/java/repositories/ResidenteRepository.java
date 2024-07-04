package repositories;

import entities.Residente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResidenteRepository extends JpaRepository<Residente,Long> {
}
