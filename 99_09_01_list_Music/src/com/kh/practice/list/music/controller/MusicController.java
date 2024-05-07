package com.kh.practice.list.music.controller;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController  {
	//음악 목록
	public List<Music> list = new ArrayList<>();
	
	//음악 추가
	public int addList(String title, String singer) {
		// Music 객체에 넣어줘야함
		// DB추가에 성공하면 1 실패하면 0
		//                         만약에 추가성공이 ? true : false
		return list.add(new Music(title,singer)) ? 1 : 0;
	}
	
	public int addAtZero(String title, String singer) {
		// 목록에 추가하는데 맨 앞에다가 다시 새로 자리값을 만들고
		// 내가 추가하는 값이 무조건 0 자리가 될 수 있도록 추가
		list.add(new Music(title,singer)); // ? 1:0;
		return 1;
	}
	//모든 음악 출력
	public List<Music> printAll() {
		return list;
	}
	
	//음악 검색
	public Music searchMusic(String title) {
		//for-each 문 사용해서
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	
	}
	
	// 음악 삭제
	public Music removeMusic(String title) {
		for(int i=0; i<list.size(); i++) {
			//만약에 내가 생각한 제목과
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
				
			}
		}
		return null;
		
		
	}
	
	// 음악 수정
	public Music setMusic(String title, String singer) {
		//for-each 내가 원하는 제목과 가수가 있는지 확인!
		for(Music music : list) {
			if(music.getTitle().equals(singer));
			return music;
		}
		
		return null;
	}
	
	// 오름차순
	public void ascTitle() {
		Collections.sort(list);
	}
	
	// 내림차순
	public void descSinger() {
		Collections.sort(list,new AscTitle());
	}
		

}
	
	
	
	

