package se.edugrade.membersapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.edugrade.membersapi.enteties.Members;

import java.util.List;

public interface MembersRepository extends JpaRepository<Members, Long> {
    List<Members> id(Long id);
}
