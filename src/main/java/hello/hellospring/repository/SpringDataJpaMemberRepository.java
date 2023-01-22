package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// * Querydsl - 복잡한 동적 쿼리 작성을 위한 라이브러리 (추후 받아서 사용해보기)
// JpaRepository에서 기본적인 공통화 함수를 제공함 (+ 페이징 기능 자동 제공)
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL (쿼리 자동 생성 인터페이스 - SPRING 데이터 JPA의 기술) : select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}

