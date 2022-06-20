package fresher.service;

import fresher.core.CaseStatus;
import fresher.core.CaseType;
import fresher.model.CriminalCase;
import fresher.model.Detective;

import java.util.List;
import java.util.Optional;

public interface CriminalCaseService {
    List<CriminalCase> findByLeadInvestigator(Detective detective);
    Optional<CriminalCase> findByNumber(String caseNumber);
    List<CriminalCase> findByStatus(CaseStatus status);
    List<CriminalCase> findByType(CaseType type);
}
