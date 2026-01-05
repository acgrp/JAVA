package hello.hello_spring;

import hello.hello_spring.repository.MemberRespository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean//스프링 빈에 등록하라는 뜻
    public MemberService memberService() {
        return new MemberService(memberRespository());
    }

    @Bean
    public MemberRespository memberRespository() {
        return new MemoryMemberRepository();
    }
}
