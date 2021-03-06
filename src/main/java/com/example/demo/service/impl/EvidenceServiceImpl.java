package com.example.demo.service.impl;


import com.example.demo.core.NotFoundException;
import com.example.demo.model.CriminalCase;
import com.example.demo.model.Evidence;
import com.example.demo.model.Storage;
import com.example.demo.repo.jpa.EvidenceRepo;
import com.example.demo.service.EvidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service

public class EvidenceServiceImpl implements EvidenceService {
    @Autowired
    private EvidenceRepo evidenceRepo;
    public List<Evidence> findByCriminalCase(CriminalCase criminalCase) {
        List<Evidence> evidenceList= evidenceRepo.findAll().stream().
                filter(e->criminalCase.getId().equals(e.getCriminalCase())).collect(Collectors.toList());
        return evidenceList;
    }

    @Override
    public Optional<Evidence> findByNumber(String evidenceNumber) {
        Optional<Evidence> evidence= evidenceRepo.findAll().stream().
                filter(e->evidenceNumber.equals(e.getNumber())).findFirst();
        if(evidence.isPresent()) return evidence;
        throw new NotFoundException("not found");
    }

    @Override
    public boolean isInStorage(Storage storage) {
        Optional<Evidence> evidence= evidenceRepo.findAll().stream().
                filter(e->storage.getId().equals(e.getStorage())).findFirst();
        if (evidence.isPresent()) return  true;
        return false;
    }
}
