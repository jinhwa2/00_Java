package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	@Override
	public int compare(Music ����1, Music ����2) {
		return ����2.getTitle().compareTo(����1.getTitle());
	}
	
}
