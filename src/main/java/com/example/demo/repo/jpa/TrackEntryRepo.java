package com.example.demo.repo.jpa;


import com.example.demo.model.TrackEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackEntryRepo extends JpaRepository<TrackEntry,Long> {

//    Set<TrackEntry> findByDetectiveId(Long detectiveId);
//    Set<TrackEntry> findByEvidenceId(Long evidenceId);
//    Set<TrackEntry> findByDate(Date date);
//    Set<TrackEntry> findByDateAndAction(Date date, TrackAction action);
}
