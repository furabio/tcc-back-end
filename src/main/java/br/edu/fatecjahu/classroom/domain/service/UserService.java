package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.domain.model.enums.AuthorityEnum;
import br.edu.fatecjahu.classroom.domain.model.User;
import br.edu.fatecjahu.classroom.infra.persistence.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserService extends AbstractService<User, UserRepository>  {

//    @Override
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//
//        User user = getRepository().findByUsername(login);
//        Collection<GrantedAuthority> authorities = Arrays.stream(AuthorityEnum.values())
//                .map(x -> new SimpleGrantedAuthority(x.getDescricao())).collect(Collectors.toList());
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
//    }

}
