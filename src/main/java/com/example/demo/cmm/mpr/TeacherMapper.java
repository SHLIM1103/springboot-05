package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
	public int insert(TeacherDto teacher);
	public List<TeacherDto> selectAll();
	public TeacherDto selectByName(String name);
	public int update(TeacherDto teacher);
	public int delete(TeacherDto teacher);
}
