package team.loha.coursemanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.loha.coursemanage.entity.Question;
import team.loha.coursemanage.mapper.UserMapper;

import java.security.Principal;

@Controller
public class WebSocketController {

    @Autowired
    UserMapper userMapper;

    @MessageMapping("/question")
    @SendTo("/topic/seminar")
    public Question raiseQuestion(Question question)
    {
        return question;
    }
}
