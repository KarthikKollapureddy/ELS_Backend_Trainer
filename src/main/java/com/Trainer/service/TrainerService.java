package com.Trainer.service;

import java.util.List;

import com.Trainer.Exceptions.GroupNotFound;
import com.Trainer.model.GroupBean;

public interface TrainerService {
	
	public GroupBean insertGroup(GroupBean gr) throws Exception;

	public List<GroupBean> getGroups(Integer id) throws GroupNotFound;

	public GroupBean getClass(Integer groupId) throws GroupNotFound;

	public GroupBean editGroup(GroupBean gr, Integer id);

	public void deleteGroup(int id) throws GroupNotFound;

	public List<GroupBean> getAllClass();

}
