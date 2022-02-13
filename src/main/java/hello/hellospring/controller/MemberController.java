package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //자동연결 (의존관계를 주입함)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
