package hello.core.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId); //회원Id로 회원찾기


}
