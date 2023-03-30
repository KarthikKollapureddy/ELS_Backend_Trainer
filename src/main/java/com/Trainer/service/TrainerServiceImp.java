package com.Trainer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainer.Dao.GroupDao;
import com.Trainer.Exceptions.GroupAlreadyExists;
import com.Trainer.Exceptions.GroupNotFound;
import com.Trainer.model.GroupBean;

@Service
public class TrainerServiceImp implements TrainerService {

	@Autowired GroupDao groupDao;
	@Override
	public GroupBean insertGroup(GroupBean gr) throws Exception {
		// TODO Auto-generated method stub
		GroupBean group=groupDao.findByGroupNameAndTrainerId(gr.getGroupName(),gr.getTrainerId());
		if(group == null) {
			return groupDao.save(gr);
		}
		throw new GroupAlreadyExists();
		
	}
	@Override
	public List<GroupBean> getGroups(Integer id) throws GroupNotFound {
		// TODO Auto-generated method stub
		List<GroupBean> res=groupDao.findByTrainerId(id);
		if(res!=null) {
			return res;
		}
		throw new GroupNotFound();
	}
	@Override
	public GroupBean getClass(Integer groupId) throws GroupNotFound {
		// TODO Auto-generated method stub
		GroupBean gr=groupDao.findByGroupId(groupId);
		if(gr!=null) {
			return gr;
		}
		throw new GroupNotFound();
	}
	
	@Override
	public GroupBean editGroup(GroupBean gr, Integer id) {
		// TODO Auto-generated method stub
		GroupBean res=groupDao.findByGroupId(id);
		res.setGroupName(gr.getGroupName());
		res.setGroupDesc(gr.getGroupDesc());
		res.setGroupSub(gr.getGroupSub());
		res.setGroupGrad(gr.getGroupGrad());
		res.setGroupLimit(gr.getGroupLimit());
		return groupDao.saveAndFlush(res);
		
	}
	@Override
	public void deleteGroup(int id) throws GroupNotFound {
		// TODO Auto-generated method stub
		GroupBean res=groupDao.findByGroupId(id);
		if(res==null) {
			throw new GroupNotFound();
			
		}
		
		groupDao.deleteById(id);
			
		
		
	}
	@Override
	public List<GroupBean> getAllClass() {
		// TODO Auto-generated method stub
		return groupDao.findAll();
	}

}
