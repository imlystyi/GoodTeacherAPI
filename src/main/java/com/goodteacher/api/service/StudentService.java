package com.goodteacher.api.service;

import com.goodteacher.api.dto.NameDto;
import com.goodteacher.api.dto.StudentDto;
import com.goodteacher.api.dto.UserDto;
import com.goodteacher.api.entity.Student;

import java.time.LocalDate;
import java.util.Set;

/**
 * Service interface for working with {@link Student} entities.
 */
public interface StudentService {
    /**
     * Finds {@link Student} by their ID.
     *
     * @param id ID to search by.
     * @return {@link StudentDto} with specified ID.
     */
    StudentDto findById(Long id);

    // TODO: Provide signing in
    StudentDto findByNickname(String nickname);

    Set<StudentDto> findAllByName(NameDto nameDto);

    StudentDto save(final UserDto userDto);

    void updateEmail(Long id, String email);

    void updatePassword(Long id, String password);

    StudentDto updateName(Long id, NameDto nameDto);

    StudentDto updateBirthDate(Long id, LocalDate birthDate);

    void delete(Long id);
}
