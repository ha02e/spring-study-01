package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        //회원 저장 테스트
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        //검증
        Member result = repository.findById(member.getId()).get();
        //System.out.println("result = " + (result == member));
        Assertions.assertEquals(member, result);
        //Assertions.assertThat(member).isEqualTo(result);
    }

}
