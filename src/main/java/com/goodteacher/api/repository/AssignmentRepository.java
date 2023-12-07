package com.goodteacher.api.repository;

import com.goodteacher.api.entity.Assignment;
import com.goodteacher.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Repository to manage {@link Student} instances.
 */
@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    Set<Assignment> findAllByTitle(String title);
}
