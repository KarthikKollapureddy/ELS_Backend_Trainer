package com.Trainer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity

@Table(name="group_info")
public class GroupBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int groupId;
	private String groupName;
	private String groupDesc;
	private int groupGrad;
	private int groupSub;
	private int groupLimit;
	private int trainerId;
	private int rating;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	public int getGroupGrad() {
		return groupGrad;
	}
	public void setGroupGrad(int groupGrad) {
		this.groupGrad = groupGrad;
	}
	public int getGroupSub() {
		return groupSub;
	}
	public void setGroupSub(int groupSub) {
		this.groupSub = groupSub;
	}
	public int getGroupLimit() {
		return groupLimit;
	}
	public void setGroupLimit(int groupLimit) {
		this.groupLimit = groupLimit;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public GroupBean(String groupName, String groupDesc, int groupGrad, int groupSub, int groupLimit, int trainerId) {
		super();
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.groupGrad = groupGrad;
		this.groupSub = groupSub;
		this.groupLimit = groupLimit;
		this.trainerId = trainerId;
}
	public GroupBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupBean(int groupId, String groupName, String groupDesc, int groupGrad, int groupSub, int groupLimit,
			int trainerId) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.groupGrad = groupGrad;
		this.groupSub = groupSub;
		this.groupLimit = groupLimit;
		this.trainerId = trainerId;
	}
	
	public GroupBean(int groupId, String groupName, String groupDesc, int groupGrad, int groupSub, int groupLimit,
			int trainerId,int rating) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.groupGrad = groupGrad;
		this.groupSub = groupSub;
		this.groupLimit = groupLimit;
		this.trainerId = trainerId;
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	

}
