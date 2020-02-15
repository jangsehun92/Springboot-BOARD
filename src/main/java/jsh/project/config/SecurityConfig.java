package jsh.project.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configurable
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/js/**");
    }
    
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        //권한 설정
		http.authorizeRequests()
            .antMatchers("/").hasRole("ADMIN");

        //로그인 설정
        http.formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/")
            .permitAll();
            
        //로그아웃 설정
        http.logout()
            .invalidateHttpSession(true)
            .clearAuthentication(true)
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/")
            .permitAll();
	}

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }


}