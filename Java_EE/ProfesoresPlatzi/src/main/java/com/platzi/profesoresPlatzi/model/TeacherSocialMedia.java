package com.platzi.profesoresPlatzi.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="teacher_social_media")
public class TeacherSocialMedia implements Serializable {
	
	@Id
	@Column(name="")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	@Column(name="nickname")
	private String nickname;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_social_media")
	private SocialMedia socialMedia;
	
	
	
	public TeacherSocialMedia() {
	}
	
	public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia, String nickname) {
		super();
		this.teacher = teacher;
		this.socialMedia = socialMedia;
		this.nickname = nickname;
	}

	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}
	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
