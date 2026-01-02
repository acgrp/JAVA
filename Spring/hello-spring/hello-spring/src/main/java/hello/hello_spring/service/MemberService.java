package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRespository;
import hello.hello_spring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRespository memberRespository;

    public MemberService(MemberRespository memberRespository) {
        this.memberRespository = memberRespository;
    }

    /**
     * 회원가입
     */
    public Long join(Member member) {
        validateDuplicateMember(member);//중복회원 검증
        memberRespository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRespository.findByName(member.getName())
                        .ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });//한번더 물어보기
    }

    public List<Member> findMembers() {
        return memberRespository.findAll(); //만약 반환타입이 달랏다면?
    };

    public Optional<Member> findOne(Long memberid) {
        return memberRespository.findById(memberid);
    }
}
