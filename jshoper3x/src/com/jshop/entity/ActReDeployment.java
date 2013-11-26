package com.jshop.entity;

// Generated 2013-11-26 21:02:17 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActReDeployment generated by hbm2java
 */
@Entity
@Table(name = "act_re_deployment", catalog = "jshoper3")
public class ActReDeployment implements java.io.Serializable {

	private String id;
	private String name;
	private String category;
	private Date deployTime;
	private Set<ActGeBytearray> actGeBytearraies = new HashSet<ActGeBytearray>(
			0);
	private Set<ActReModel> actReModels = new HashSet<ActReModel>(0);

	public ActReDeployment() {
	}

	public ActReDeployment(String id, Date deployTime) {
		this.id = id;
		this.deployTime = deployTime;
	}

	public ActReDeployment(String id, String name, String category,
			Date deployTime, Set<ActGeBytearray> actGeBytearraies,
			Set<ActReModel> actReModels) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.deployTime = deployTime;
		this.actGeBytearraies = actGeBytearraies;
		this.actReModels = actReModels;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CATEGORY_")
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEPLOY_TIME_", nullable = false, length = 0)
	public Date getDeployTime() {
		return this.deployTime;
	}

	public void setDeployTime(Date deployTime) {
		this.deployTime = deployTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actReDeployment")
	public Set<ActGeBytearray> getActGeBytearraies() {
		return this.actGeBytearraies;
	}

	public void setActGeBytearraies(Set<ActGeBytearray> actGeBytearraies) {
		this.actGeBytearraies = actGeBytearraies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actReDeployment")
	public Set<ActReModel> getActReModels() {
		return this.actReModels;
	}

	public void setActReModels(Set<ActReModel> actReModels) {
		this.actReModels = actReModels;
	}

}
