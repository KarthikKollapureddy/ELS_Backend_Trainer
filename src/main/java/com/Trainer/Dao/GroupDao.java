package com.Trainer.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Trainer.model.GroupBean;

@Repository
public interface GroupDao extends JpaRepository<GroupBean, Integer> {

	GroupBean findByGroupNameAndTrainerId(String groupName, int trainerId);

	List<GroupBean> findByTrainerId(Integer id);

	GroupBean findByGroupId(Integer groupId);

}
