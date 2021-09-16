package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void 회원가입() {
        //Given : 데이터 준비
        Member member = new Member();
        member.setName("hello");
        //When : 실행
        Long saveId = memberService.join(member);
        //Then : 결과 확인
        Member findMember = memberService.findOne(saveId).get();
        assertEquals(member.getName(), findMember.getName()); // assertEquals (A,B) 결과가 같은가?
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}