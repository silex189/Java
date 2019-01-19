package com.platzi.profesoresPlatzi.service;

import java.util.List;

import com.platzi.profesoresPlatzi.model.SocialMedia;
import com.platzi.profesoresPlatzi.model.TeacherSocialMedia;

public interface SocialMediaService {

	void saveSocialMedia(SocialMedia socialMedia);

	void deleteSocialMediaById(Long idSocialMedia);

	void updateSocialMedia(SocialMedia socialMedia);

	List<SocialMedia> findAllSocialMedias();

	SocialMedia findById(Long idSocialMedia);

	SocialMedia findByName(String name);

	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
	
	TeacherSocialMedia findSocialMediaByIdTeacherAndIdSocialMedia(Long idTeacher, Long idSocialMedia);
}
