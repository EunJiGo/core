package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository ;
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy;


//    //p107 생성자주입을 선택해라 -> 프레임워크 없이 순수한 자바 코드로 테스트(수정자 의존관게인 경우!)
//    private  MemberRepository memberRepository ;
//    private  DiscountPolicy discountPolicy;
//    @Autowired
//    public void setMemberRepository(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//    @Autowired
//    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
//        this.discountPolicy = discountPolicy;
//    }


    @Autowired
    public  OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
   public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
