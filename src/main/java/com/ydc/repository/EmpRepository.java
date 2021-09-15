package com.ydc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ydc.model.Emp;

/**
 * 
 * PagingAndSortingRepository는 페이징과 정렬을 위한 기능을 제공하는데
 * CrudRepository를 상속받았으며 CrudRepository는
 * Repository 인터페이스를 상속 받았는데
 * 엔티티(테이블)를 다룰 수 있는 다양한 CRUD 메소드들이 구현되어 있습니다.
 *
 * Spring Data REST는 PagingAndSortingRepository
 * 인터페이스의 구현을 자동으로 생성해 줍니다.
 * 즉 기본적인 CRUD는 제공되므로 구현하지 않아도 됩니다.
 * 
 * (예를들면 findAll, findById, save, deleteById, count 등등)
 * 
 * 아래의 findByEname 메소드 역시 개발자가 구현을 하지 않았으며 JPA에서
 * 메소드 이름을 가지고 내부적으로 자동으로 SELECT 쿼리를 만들어 줍니다.
 *
 * @RepositoryRestResource 어노테이션은 Spring MVC가 “/emp” 형태로 RESTful End-Point를 생성하도록 지시.
 * 
 */

@RepositoryRestResource(collectionResourceRel = "emp", path = "emp")
public interface EmpRepository extends JpaRepository<Emp, Long> {

	List<Emp> findByEname(@Param("ename") String ename);

}
