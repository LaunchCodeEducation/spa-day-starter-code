package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class SpaDayController {

    @GetMapping
    public String customerForm (Model model, String username) {
        if (username != null){
            model.addAttribute("username", username);
            return "serviceSelection";
        } else {
            return "redirect:user/add";
        }
    }

    @PostMapping
    public String spaMenu(@RequestParam String username, @RequestParam String skintype, @RequestParam String manipedi, Model model) {
        model.addAttribute("username", username);
        Client newClient = new Client(skintype, manipedi);
        newClient.setAppropriateFacials(skintype);
        model.addAttribute("client" , newClient);

        return "menu";
    }
}
