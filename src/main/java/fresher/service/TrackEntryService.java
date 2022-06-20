package fresher.service;

import fresher.core.TrackAction;
import fresher.model.TrackEntry;

import java.util.Date;
import java.util.List;

public interface TrackEntryService {
    List<TrackEntry> findByDetectiveId(Long detectiveId);
    List<TrackEntry> findByEvidenceId(Long evidenceId);
    List<TrackEntry> findByDate(Date date);
    List<TrackEntry> findByDateAndAction(Date date, TrackAction action);
}
