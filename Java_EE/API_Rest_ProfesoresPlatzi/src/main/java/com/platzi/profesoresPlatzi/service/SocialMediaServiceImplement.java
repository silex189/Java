package com.platzi.profesoresPlatzi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.profesoresPlatzi.dao.SocialMediaDao;
import com.platzi.profesoresPlatzi.model.SocialMedia;
import com.platzi.profesoresPlatzi.model.TeacherSocialMedia;

@Service("socialMediaService")
@Transactional
public class SocialMediaServiceImplement implements SocialMediaService{

	@Autowired
	private SocialMediaDao socialMediaDao;
	
	@Override
	public void saveSocialMedia(SocialMedia socialMedia) {
		socialMediaDao.saveSocialMedia(socialMedia);
		
	}

	@Override
	public void deleteSocialMediaById(Long idSocialMedia) {
		socialMediaDao.deleteSocialMediaById(idSocialMedia);
		
	}

	@Override
	public void updateSocialMedia(SocialMedia socialMedia) {
		socialMediaDao.updateSocialMedia(socialMedia);
		
	}

	@Override
	public List<SocialMedia> findAllSocialMedias() {
		return socialMediaDao.findAllSocialMedias();
	}

	@Override
	public SocialMedia findById(Long idSocialMedia) {
		return socialMediaDao.findById(idSocialMedia);
	}

	@Override
	public SocialMedia findByName(String name) {
		return socialMediaDao.findByName(name);
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
		return socialMediaDao.findSocialMediaByIdAndName(idSocialMedia, nickname);
	}

	@Override
	public TeacherSocialMedia findSocialMediaByIdTeacherAndIdSocialMedia(Long idTeacher, Long idSocialMedia) {
		return socialMediaDao.findSocialMediaByIdTeacherAndIdSocialMedia(idTeacher, idSocialMedia);
	}

}
