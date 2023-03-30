package com.Trainer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/elearning/api/trainer")
@CrossOrigin(origins="*")
public class TrainerController {
	
	@Autowired TrainerService trainerService;
	
	@PostMapping("create/{id}")
	public ResponseEntity<GroupBean> addGroup(@RequestBody GroupBean gr,@PathVariable Integer id) throws Exception {
		return new ResponseEntity<GroupBean>(trainerService.insertGroup(gr),HttpStatus.OK);
	}
	
	@GetMapping("getGroups/{id}")
	public ResponseEntity<List<GroupBean>> getGroupInfo(@PathVariable Integer id) throws GroupNotFound{
		return new ResponseEntity<List<GroupBean>>(trainerService.getGroups(id),HttpStatus.OK);
	}
	
	@GetMapping("getClass/{groupId}")
	public ResponseEntity<GroupBean> getClassInfo(@PathVariable Integer groupId) throws GroupNotFound{
		return new ResponseEntity<GroupBean>(trainerService.getClass(groupId),HttpStatus.OK);
	}
	
	@PutMapping("edit/{id}")
	public ResponseEntity<GroupBean> editClass(@RequestBody GroupBean gr,@PathVariable Integer id) {
		return new ResponseEntity<GroupBean>( trainerService.editGroup(gr,id),HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Map<String, String>> deleteClass(@PathVariable Integer id) throws GroupNotFound {
		trainerService.deleteGroup(id);
		Map<String,String> message = new HashMap<>();
		message.put("message", "group with id "+id+" deleted.");
		return new ResponseEntity<Map<String,String>>(message,HttpStatus.OK);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<GroupBean>> getAllGroups(){
		return new ResponseEntity<List<GroupBean>>(trainerService.getAllClass(),HttpStatus.OK);
	}
	

}
