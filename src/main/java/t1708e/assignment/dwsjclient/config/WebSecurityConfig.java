package t1708e.assignment.dwsjclient.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import t1708e.assignment.dwsjclient.entity.User;
import t1708e.assignment.dwsjclient.service.user.UserService;

import java.rmi.RemoteException;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserService userService;

    @Bean
    public UserDetailsService userDetailsService() {
       return username -> {
           try {
               User user = userService.findByUsername(username);
               if (user == null){
                   throw new UsernameNotFoundException("User not found");
               }
               return org.springframework.security.core.userdetails.User.builder()
                       .username(user.getUsername())
                       .password(user.getPassword())
                       .roles(user.getRole())
                       .build();
           } catch (RemoteException e) {
               e.printStackTrace();
           }
           return null;
       };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/users/register").permitAll()
//                .antMatchers("/admin/**").hasAnyRole(StringConst.ROLE_ADMIN)
//                .and()
//                .formLogin()
//                .loginPage("/users/login")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutUrl("/users/logout")
//                .logoutSuccessUrl("/")
//                .permitAll();
//

        // trien khai chuc nang cho nhanh!
        http.authorizeRequests().anyRequest().permitAll();
    }
}
