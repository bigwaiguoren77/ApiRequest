package forum.alura.api.repositorios;
import forum.alura.api.modelos.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicRepository extends JpaRepository<topicos, Integer> {
}
