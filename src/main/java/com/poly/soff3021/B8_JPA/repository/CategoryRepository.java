package com.poly.soff3021.B8_JPA.repository;

import com.poly.soff3021.B8_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category1, Long> {
    // CRUD trong 1 bang => K can phai viet : getAll, add, update, delete...
    // load toan bo du lieu table => findAll
    // add/update: save(Doi tuong)
    // delete => deleteByID
    // Custom Query
    // C1: Query creation
    // C2: raw SQL
//    // C1: https://techmaster.vn/posts/37540/tim-hieu-ve-cac-method-query-co-san-trong-spring-data-jpa
//    Category1 findCategory1ByIdAndCategoryCode(Long id, String categoryCode);
//    // => ten dai
//    // C2.1: JPQL => truy van tren thuc the
//    @Query(" SELECT c FROM Category1 c WHERE c.id1 =:id2 AND c.categoryCode =:code")
//    Category1 search(@Param("id2") Long id, @Param("code") String categoryCode);
//    // C2.2 : native query => truy van tren SQL : SELECT * From
//
//    @Query(value = " select * from category where id =:id2 and category_code =:code",nativeQuery = true)
//    Category1 search1(@Param("id2") Long id, @Param("code") String categoryCode); // interface

}
