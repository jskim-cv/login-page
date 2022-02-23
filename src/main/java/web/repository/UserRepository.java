package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import web.model.UserEntity;
import java.util.*;

@Repository
public interface UserRepository extends  CrudRepository<UserEntity, Integer> {
    @Query(value = "SELECT * FROM usercd", nativeQuery = true)
    Collection<UserEntity> findAllUserCustom();

    @Query(value = "SELECT * FROM usercd", nativeQuery = true)
    Collection<UserEntity> deleteUser();

    @Query(value = "SELECT * FROM usercd", nativeQuery = true)
    Collection<UserEntity> updateUser();

    @Query(value = "SELECT * FROM usercd", nativeQuery = true)
    Collection<UserEntity> getUser();

}