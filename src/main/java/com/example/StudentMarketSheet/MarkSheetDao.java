package com.example.StudentMarketSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepo mr;

	public String setMark(List<MarkSheet> m) {
		mr.saveAll(m);
		return "Data saved";
	}
	public List<MarkSheet> getAll() {
		return mr.findAll();
	}
}
