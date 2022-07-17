package com.example.assignment_ls10.repository;

import com.example.assignment_ls10.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
//    @Query(value = "call GetAllRoleByUserName(:username)", nativeQuery = true)
//    List<Map<String, ?>> getRoleNameByUserName(@Param("username") String username);

}
