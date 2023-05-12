package com.ll.gramgram.base.initData;

import com.ll.gramgram.boundedContext.instaMember.service.InstaMemberService;
import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import com.ll.gramgram.boundedContext.likeablePerson.service.LikeablePersonService;
import com.ll.gramgram.boundedContext.member.entity.Member;
import com.ll.gramgram.boundedContext.member.service.MemberService;
import com.ll.gramgram.standard.util.Ut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Configuration
@Profile({"dev", "test"})
public class NotProd {
    @Value("${custom.security.oauth2.client.registration.kakao.devUserOauthId}")
    private String kakaoDevUserOAuthId;

    @Value("${custom.security.oauth2.client.registration.naver.devUserOauthId}")
    private String naverDevUserOAuthId;

    @Value("${custom.security.oauth2.client.registration.google.devUserOauthId}")
    private String googleDevUserOAuthId;

    @Value("${custom.security.oauth2.client.registration.facebook.devUserOauthId}")
    private String facebookDevUserOAuthId;

    @Bean
    CommandLineRunner initData(
            MemberService memberService,
            InstaMemberService instaMemberService,
            LikeablePersonService likeablePersonService
    ) {
        return new CommandLineRunner() {
            @Override
            @Transactional
            public void run(String... args) throws Exception {
                Member memberAdmin = memberService.join("admin", "1234").getData();
                Member memberUser1 = memberService.join("user1", "1234").getData();
                Member memberUser2 = memberService.join("user2", "1234").getData();
                Member memberUser3 = memberService.join("user3", "1234").getData();
                Member memberUser4 = memberService.join("user4", "1234").getData();
                Member memberUser5 = memberService.join("user5", "1234").getData();

                //테스트 위해서 추가
                Member memberUser91 = memberService.join("user91", "1234").getData();
                Member memberUser92 = memberService.join("user92", "1234").getData();
                Member memberUser93 = memberService.join("user93", "1234").getData();
                Member memberUser94 = memberService.join("user94", "1234").getData();
                Member memberUser95 = memberService.join("user95", "1234").getData();
                Member memberUser96 = memberService.join("user96", "1234").getData();

                Member memberUser6ByKakao = memberService.whenSocialLogin("KAKAO", "KAKAO__%s".formatted(kakaoDevUserOAuthId)).getData();
                Member memberUser7ByGoogle = memberService.whenSocialLogin("GOOGLE", "GOOGLE__%s".formatted(googleDevUserOAuthId)).getData();
                Member memberUser8ByNaver = memberService.whenSocialLogin("NAVER", "NAVER__%s".formatted(naverDevUserOAuthId)).getData();
                Member memberUser9ByFacebook = memberService.whenSocialLogin("FACEBOOK", "FACEBOOK__%s".formatted(facebookDevUserOAuthId)).getData();

                instaMemberService.connect(memberUser2, "insta_user2", "M");
                instaMemberService.connect(memberUser3, "insta_user3", "W");
                instaMemberService.connect(memberUser4, "insta_user4", "M");
                instaMemberService.connect(memberUser5, "insta_user5", "W");

                //테스트 위해서 추가
                instaMemberService.connect(memberUser91, "insta_user91", "M");
                instaMemberService.connect(memberUser92, "insta_user92", "W");
                instaMemberService.connect(memberUser93, "insta_user93", "M");
                instaMemberService.connect(memberUser94, "insta_user94", "W");
                instaMemberService.connect(memberUser95, "insta_user95", "M");
                instaMemberService.connect(memberUser96, "insta_user96", "W");


                // 원활한 테스트와 개발을 위해서 자동으로 만들어지는 호감이 삭제, 수정이 가능하도록 쿨타임해제
                LikeablePerson likeablePersonToInstaUser4 = likeablePersonService.like(memberUser3, "insta_user4", 1).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser4, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser100 = likeablePersonService.like(memberUser3, "insta_user100", 2).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser100, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUserAbcd = likeablePersonService.like(memberUser3, "insta_user_abcd", 2).getData();

                //테스트 위해서 추가
                LikeablePerson likeablePersonToInstaUser4_2 = likeablePersonService.like(memberUser91, "insta_user4", 2).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser4_2, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser4_3 = likeablePersonService.like(memberUser92, "insta_user4", 1).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser4_3, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser4_4 = likeablePersonService.like(memberUser93, "insta_user4", 3).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser4_4, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser4_5 = likeablePersonService.like(memberUser94, "insta_user4", 1).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser4_5, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser93 = likeablePersonService.like(memberUser91, "insta_user93", 2).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser93, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser93_2 = likeablePersonService.like(memberUser92, "insta_user93", 3).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser93_2, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));
                LikeablePerson likeablePersonToInstaUser92 = likeablePersonService.like(memberUser93, "insta_user92", 2).getData();
                Ut.reflection.setFieldValue(likeablePersonToInstaUser92, "modifyUnlockDate", LocalDateTime.now().minusSeconds(1));




            }
        };
    }
}