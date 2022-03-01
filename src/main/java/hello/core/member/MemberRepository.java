package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId); // 회원Id로 회원 찾기
}
