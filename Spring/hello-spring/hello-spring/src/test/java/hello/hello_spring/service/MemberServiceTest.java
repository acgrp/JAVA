package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();//저장소 제작
        memberService = new MemberService(memberRepository);//저장소 연결
    }

    @AfterEach//저장소 초기화, 독립성보장, 순서바뀌어도 결과동일
    public void afterEach() {
        memberRepository.clearStore();//순서가 상관없어진다? 왜? -> AfterEach
    }

    @Test
    void 회원가입() { //test는 한글로 바꾸는게 가능(실제 코드에 추가되는게 아니기 때문에)
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());//스태틱 임포트가 뭐야?

    }

    @Test
    public void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));//assertThrows(A, B) : B를 실행했을때, A가 터져야 테스트 성공 / 이후 e로 터진 객체 확인가능

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");//이것도 뭐야
//        try {
//            memberService.join(member2);
//            fail();
//        }catch (IllegalStateException e) {
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원");
//        }


        //then
    }

    @Test
    void findOne() {

    }
}