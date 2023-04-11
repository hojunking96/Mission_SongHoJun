package com.ll.gramgram.boundedContext.likeablePerson.repository;

import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LikeablePersonRepository extends JpaRepository<LikeablePerson, Long> {
    List<LikeablePerson> findByFromInstaMemberId(Long fromInstaMemberId);

    LikeablePerson findByFromInstaMemberIdAndToInstaMemberId(Long fromInstaMemberId, Long toInstaMemberId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE likeable_person L SET L.attractive_type_code = :attractiveTypeCode WHERE L.id=:id", nativeQuery = true)
    void update(@Param("id")Long id, @Param("attractiveTypeCode")int attractiveTypeCode);
}
