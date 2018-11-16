package api.server.conf;



import api.server.service.impl.UserDetailsServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

@Configuration

public class AppConfig {

   @Bean
   public ModelMapper modelMapper(){
       return new ModelMapper();
   }



}
