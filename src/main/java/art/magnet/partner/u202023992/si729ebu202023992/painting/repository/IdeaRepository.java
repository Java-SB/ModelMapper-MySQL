package art.magnet.partner.u202023992.si729ebu202023992.painting.repository;

import art.magnet.partner.u202023992.si729ebu202023992.painting.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
    Boolean existsByAuthorIdAndTextQuery(Long authorId, String textQuery);
}
