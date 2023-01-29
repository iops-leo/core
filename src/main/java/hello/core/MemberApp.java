package hello.core;

import hello.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); //AppConfig의 환경설정 호출
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);//bean

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);

        System.out.println("memberA = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
