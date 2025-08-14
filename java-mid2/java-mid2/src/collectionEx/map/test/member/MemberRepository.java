package collectionEx.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        memberMap.put(member.getId(), member);
        // 코드 작성
    }

    public void remove(String id) {
        memberMap.remove(id);
        // 코드 작성
    }

    public Member findById(String id) {
        Member member = memberMap.get(id);
        return member;
        // 코드 작성
    }

    public Member findByName(String name) {
        Collection<Member> values = memberMap.values();
        for (Member member : values) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
        // 코드 작성
    }

}