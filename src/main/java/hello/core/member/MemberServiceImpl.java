package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private static MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }



    //@Bean memberService -> new MemoryMemberRepository()
    //@Bean orderService -> new MemoryMemberRepository()
    //-> MemoryMemberRepository()가 두번 호출됨
    //객체 인스턴스 2번 생성
    //-> 싱클톤 깨짐!
    //싱글톤 방식 : 객체 인스턴스를 하나만 생성해서 공유하는 방식

    //테스트 용도 <- 위를 테스트하기 위함
    public static MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
