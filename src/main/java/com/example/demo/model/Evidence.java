package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "evidence")
public class Evidence extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name="case_id", nullable = false)
    private CriminalCase criminalCase;
    @ManyToOne
    @JoinColumn(name = "storage_id", nullable = false)
    private Storage storage;
    @Column(name = "number", unique = true)
    private String number;
    @Column(name = "item")
    private String itemName;
    @Column(name = "notes")
    private String notes;
    @Column(name = "archived")
    private boolean archived;
    @OneToMany(mappedBy = "evidence")
    private Set<TrackEntry> trackEntries = new HashSet<>();

    public CriminalCase getCriminalCase() {
        return criminalCase;
    }

    public void setCriminalCase(CriminalCase criminalCase) {
        this.criminalCase = criminalCase;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    private void setTrackEntries(Set<TrackEntry> trackEntries) {
        this.trackEntries = trackEntries;
    }

    public boolean addTrackEntry(TrackEntry trackEntry){
        trackEntry.setEvidence(this);
        return trackEntries.add(trackEntry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Evidence evidence = (Evidence) o;
        return Objects.equals(criminalCase, evidence.criminalCase) &&
                Objects.equals(number, evidence.number) &&
                Objects.equals(itemName, evidence.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), criminalCase, number, itemName);
    }
}
