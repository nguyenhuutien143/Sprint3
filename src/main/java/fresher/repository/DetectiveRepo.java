package fresher.repository;

import fresher.core.Rank;
import fresher.model.Detective;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
@Repository
public interface DetectiveRepo extends AbstractRepo<Detective> {

    Set<Detective> findAll();
    Optional<Detective> findByBadgeNumber(String badgeNumber);
    Set<Detective> findbyRank(Rank rank);

    default Optional<Detective> findByIdWithPersonDetails(Long id) {
        return Optional.empty();
    }
}