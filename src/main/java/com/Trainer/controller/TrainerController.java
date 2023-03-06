package com.Trainer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Trainer.Exceptions.GroupNotFound;
import com.Trainer.model.GroupBean;
import com.Trainer.service.TrainerService;

@RestController
@RequestMapping("elearning/api/trainer/")
@CrossOrigin(origins="*")
public class TrainerController {
	
	@Autowired TrainerService ts;
	
	@PostMapping("create/{id}")
	public GroupBean addGroup(@RequestBody GroupBean gr,@PathVariable Integer id) throws Exception {
		return ts.insertGroup(gr);
	}
	
	@GetMapping("getGroups/{id}")
	public List<GroupBean> getGroupInfo(@PathVariable Integer id) throws GroupNotFound{
		return ts.getGroups(id);
	}
	
	@GetMapping("getClass/{groupId}")
	public GroupBean getClassInfo(@PathVariable Integer groupId) throws GroupNotFound{
		return ts.getClass(groupId);
	}
	
	@PutMapping("edit/{id}")
	public GroupBean editClass(@RequestBody GroupBean gr,@PathVariable Integer id) {
		return ts.editGroup(gr,id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteClass(@PathVariable Integer id) throws GroupNotFound {
		return ts.deleteGroup(id);
	}
	
	@GetMapping("getAll")
	public List<GroupBean> getAllGroups(){
		return ts.getAllClass();
	}
	

}
