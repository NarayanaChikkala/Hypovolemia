package com.narayana.Hypovolemia;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HypovolemaController {
	@Autowired
	HypovolemiaRepository hypotermiarepository;
	
	protected Logger logger = Logger
			.getLogger(HypovolemaController.class.getName());
	
	@RequestMapping("/hypovolemia/{hypovolemicSymptoms}")
	public String hypovolemia(@PathVariable("hypovolemicSymptoms") String hypovolemicSymptoms) {
		logger.info("accounts-changed byId() invoked: " + hypovolemicSymptoms);
		String retVal = hypotermiarepository.gethypovolemia(hypovolemicSymptoms);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
