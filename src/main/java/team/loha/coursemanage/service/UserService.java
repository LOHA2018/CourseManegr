package team.loha.coursemanage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.loha.coursemanage.entity.User;
import team.loha.coursemanage.mapper.UserMapper;

@Service
public class UserService {
@Autowired
    UserMapper userMapper;

}
