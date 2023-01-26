package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {


    /**
     * Discount int.
     *
     * @param member the member
     * @param price  the price
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
