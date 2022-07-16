package net.psentaur.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.psentaur.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
