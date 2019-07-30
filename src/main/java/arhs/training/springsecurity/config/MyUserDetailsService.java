package arhs.training.springsecurity.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import arhs.training.springsecurity.domain.User;
import arhs.training.springsecurity.repository.UserRepository;

@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException(
                    "No user found with username: " + email);
        }
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        return new org.springframework.security.core.userdetails.User
                (user.getEmail(),
                 user.getPassword(), enabled, accountNonExpired,
                 credentialsNonExpired, accountNonLocked,
                 getAuthorities(user)
                );
    }

    private static List<GrantedAuthority> getAuthorities(User user) {
        List<GrantedAuthority> authorities = new ArrayList<>();

        List<String> roles = Arrays.asList(user.getRole());
        List<String> permissions = Arrays.asList(user.getPermission());

        for(String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        for(String permission : permissions) {
            authorities.add(new SimpleGrantedAuthority(permission));
        }
        return authorities;
    }
}