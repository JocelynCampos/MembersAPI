package se.edugrade.membersapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.edugrade.membersapi.services.MembersServices;

@Controller
public class ViewController {
    private final MembersServices membersServices;

    @Autowired
    public ViewController(MembersServices membersServices) {
        this.membersServices = membersServices;
    }

    @GetMapping("/members-list")
    public String getMembersPage(Model model) {
        model.addAttribute("members", membersServices.getAllMembers());
        return "deleteMembers";
    }

}
