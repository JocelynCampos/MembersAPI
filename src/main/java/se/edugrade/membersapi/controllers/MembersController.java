package se.edugrade.membersapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.edugrade.membersapi.enteties.Members;
import se.edugrade.membersapi.services.MembersServices;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class MembersController {

    private final MembersServices membersServices;

    @Autowired
    public MembersController(MembersServices membersServices) {
        this.membersServices = membersServices;
    }

    @GetMapping("/members")
    public List<Members> getAllMembers() {
        return membersServices.getAllMembers();
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<Members> getMemberById(@PathVariable Long id) {
        Members members = membersServices.getMemberById(id);
        return ResponseEntity.ok(members);
    }

    @PutMapping("/updatemember/{id}")
    public ResponseEntity<Members> updateMember(@PathVariable Long id, @RequestBody Members members) {
        Members updateMember = membersServices.updateMember(id, members);
        return ResponseEntity.ok(updateMember);
    }

    @PostMapping("/addmember")
    public ResponseEntity<Members> addMember(@RequestBody Members member) {
        Members newMember = membersServices.addMember(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMember);
    }

    @DeleteMapping("deletemember/{id}")
    public ResponseEntity <String> deleteMember(@PathVariable Long id) {
        membersServices.deleteMember(id);
        return ResponseEntity.ok("Member with id: " + id + " deleted.");
    }
}
