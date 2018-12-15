package team.loha.coursemanage.mapper;

import org.springframework.stereotype.Repository;
import team.loha.coursemanage.entity.User;

@Repository
public interface UserMapper {
    public User getUserByAccount(String account);
}
