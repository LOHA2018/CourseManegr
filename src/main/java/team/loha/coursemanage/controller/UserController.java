package team.loha.coursemanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import team.loha.coursemanage.entity.Course;
import team.loha.coursemanage.entity.User;
import team.loha.coursemanage.mapper.CourseMapper;
import team.loha.coursemanage.mapper.SeminarMapper;
import team.loha.coursemanage.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("curUser")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    SeminarMapper seminarMapper;

    public String getUsername()
    {
        org.springframework.security.core.userdetails.User user=
                (org.springframework.security.core.userdetails.User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user.getUsername();
    }

    @RequestMapping("/zou")
    public String login(Model model) {
        String username=getUsername();
        User user=userMapper.getUserByAccount(username);
        List<Course> courses=courseMapper.getAllCourseByUserId(user.getId());
        model.addAttribute("user",user);
        model.addAttribute("courses",courses);
        model.addAttribute("curUser",username);
        return "MainPage";
    }

    @RequestMapping(value = "/zou/{id}")
    public String getAllSeminar(@PathVariable long id, Model model)
    {
        model.addAttribute("seminar",seminarMapper.getSeminarById(id));
        return "SeminarPage";
    }

    @RequestMapping(value="/ws")
    public String testWS()
    {
        return "WebSocket";
    }

}
