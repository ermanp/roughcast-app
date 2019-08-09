package com.sakulta.roughcastapp.repository;


import com.sakulta.roughcastapp.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by temelt on 3.02.2019.
 */
public interface IssueRepository extends JpaRepository<Issue, Long> {

}
