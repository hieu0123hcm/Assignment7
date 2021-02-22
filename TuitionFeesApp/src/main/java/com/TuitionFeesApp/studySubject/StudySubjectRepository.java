package com.TuitionFeesApp.studySubject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudySubjectRepository extends JpaRepository<StudySubject, Integer> {



}
