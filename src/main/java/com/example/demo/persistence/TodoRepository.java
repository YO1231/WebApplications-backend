package com.example.demo.persistence;

import com.example.demo.domain.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    // save,findById, delete() 기본 메소드가 자동으로 구현됨

    // 새로운 메소드 추가
    @Query("select t from TodoEntity t where t.userId = ?1")
    List<TodoEntity> findByUserId(String userId); // 이 메소드 실행 시 위 쿼리 실행
    List<TodoEntity> findByUserIdAndTitle(String userId, String title);
}
