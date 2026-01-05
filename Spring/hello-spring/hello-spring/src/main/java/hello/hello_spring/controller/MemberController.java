package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired//3번 방법 setter 주입법(단점: public으로 노출됨)
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    //1번 직접주입(이거나 생성자 주입이 제일 좋음)
//    @Autowired// memberService와 SpringContainer가 연결
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }

    //2번 필드에 @Autowired 하는 필드주입법(별로임)


}
