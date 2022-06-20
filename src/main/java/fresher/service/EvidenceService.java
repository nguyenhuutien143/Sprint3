package fresher.service;

import fresher.model.CriminalCase;
import fresher.model.Evidence;
import fresher.model.Storage;

import java.util.List;
import java.util.Optional;

public interface EvidenceService {
    List<Evidence> findByCriminalCase(CriminalCase criminalCase);
    Optional<Evidence> findByNumber(String evidenceNumber);
    boolean isInStorage(Storage storage);
}
