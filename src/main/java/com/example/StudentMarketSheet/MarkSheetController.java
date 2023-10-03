package com.example.StudentMarketSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;

	@PostMapping(value = "/mark")
	public String setMark(@RequestBody List<MarkSheet> m) {
		return ms.setMark(m);
	}
	@GetMapping(value="getAllMark")
	public List<MarkSheet> getAll() {
		return ms.getAll();
	}

}