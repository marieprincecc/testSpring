package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageController {

    private List<Message> messageList = new ArrayList<>();

    @GetMapping("/msg")
    public String showMessage(Model model) {
        model.addAttribute("msgList", messageList);
        model.addAttribute("newMessage", new Message());
        return "MesgPage";
    }

    @PostMapping(value = "/msg")
    public String postMessage(@ModelAttribute Message newMessage) {
        messageList.add(newMessage);

        return "redirect:msg";
    }

}
