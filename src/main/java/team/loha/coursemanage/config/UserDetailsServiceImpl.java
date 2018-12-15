package team.loha.coursemanage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import team.loha.coursemanage.mapper.UserMapper;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username)
    {
        team.loha.coursemanage.entity.User user=userMapper.getUserByAccount(username);
        if (null==user)
        {
            throw new UsernameNotFoundException(username+" not found");
        }
        List<GrantedAuthority> auths=new ArrayList<>();
        auths.add(new SimpleGrantedAuthority("ROLE_"+user.getRole()));
        return new User(username,passwordEncoder.encode(user.getPassword()),true,true,true,true,auths);
    }

}
