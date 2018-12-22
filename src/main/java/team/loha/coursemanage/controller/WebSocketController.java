package team.loha.coursemanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import team.loha.coursemanage.entity.Question;
import team.loha.coursemanage.mapper.UserMapper;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WebSocketController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SimpMessagingTemplate messagingTemplate;

    /**
     * @Author: birden
     * @Description: 广播，改路径字符串
     * @Date: 2018/12/22 22:17
     */
    @MessageMapping("/question")
    public void raiseQuestion(String a)
    {
        System.out.println("in");
        messagingTemplate.convertAndSend("/topic"+"/123","hello");
    }

    /**
     * @Author: birden
     * @Description: 点对点
     * @Date: 2018/12/22 22:17
     */
    @MessageMapping("/choose")
    public void handleRequest(Principal principal,String account){
        System.out.println(principal.getName());
        messagingTemplate.convertAndSendToUser(account,"/topic/seminar",principal.getName()+" call you");
        }


}
