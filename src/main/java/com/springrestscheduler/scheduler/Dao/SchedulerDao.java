package com.springrestscheduler.scheduler.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrestscheduler.scheduler.entities.Students;
public interface SchedulerDao extends JpaRepository<Students, Long>{

}
