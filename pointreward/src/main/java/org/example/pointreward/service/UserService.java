package org.example.pointreward.service;

import lombok.RequiredArgsConstructor;
import org.example.pointreward.entity.User;
import org.example.pointreward.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    // 조회, 검증, 가공, 저장, 반환
    @Transactional
    //  1. 회원가입 시 동일한 username이 존재하는지 조회한다. existsByUsername(username)
    public User join(String username, String password, String email, String name){
        boolean exists = userRepository.existsByUsername(username);
    //  2. 이미 존재하면 회원가입을 실패시킨다. if
        if (exists) {
            throw new IllegalArgumentException("중복된 username이 있습니다.");
        }
    }
}





//  2. 이미 존재하면 회원가입을 실패시킨다. if

//  3. 비밀번호를 암호화한다. passwordEncoder.encode(password)


//  4. ROLE_USER 권한을 부여한다. new User 또는 User.builder()
//
//  5. 회원 정보를 저장한다. userRepository.save(user)
//
//  6. 회원가입 성공 결과를 반환한다. return
