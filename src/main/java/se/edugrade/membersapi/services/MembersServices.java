package se.edugrade.membersapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.edugrade.membersapi.enteties.Members;
import se.edugrade.membersapi.exceptions.ResourceNotFoundException;
import se.edugrade.membersapi.repositories.MembersRepository;

import java.util.List;

@Service
public class MembersServices {

    private final MembersRepository membersRepository;

    @Autowired
    public MembersServices(MembersRepository membersRepository) {
        this.membersRepository = membersRepository;
    }

    public List<Members> getAllMembers() {
        return membersRepository.findAll();
    }

    public Members getMemberById(Long id) {
        return membersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member with id: " + id + " not found."));
    }

    public Members updateMember(Long id, Members updatedMember) {
        Members existingMember = membersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member with id: " + id + " not found."));

        existingMember.setFirstName(updatedMember.getFirstName());
        existingMember.setLastName(updatedMember.getLastName());
        existingMember.setEmail(updatedMember.getEmail());
        existingMember.setPhone(updatedMember.getPhone());
        existingMember.setAddress(updatedMember.getAddress());
        existingMember.setDateOfBirth(updatedMember.getDateOfBirth());
        return membersRepository.save(existingMember);
    }

    public Members addMember(Members member) {
        return membersRepository.save(member);
    }

    public void deleteMember(Long id) {
        Members deletedMember = membersRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member with id: " + id + " not found."));
        membersRepository.delete(deletedMember);
    }
}
