package com.example.StudentMarketSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;

	public String setMark(List<MarkSheet> m) {
		for (MarkSheet t : m) {
			int tot1 = t.getSem1Theory() + t.getSem1Practicals();
			t.setSem1Total(tot1);
			int tot2 = t.getSem2Theory() + t.getSem2Practicals();
			t.setSem2Total(tot2);
		}
		return md.setMark(m);

	}
	public List<MarkSheet> getAll() {
		return md.getAll();
		
	}
}
