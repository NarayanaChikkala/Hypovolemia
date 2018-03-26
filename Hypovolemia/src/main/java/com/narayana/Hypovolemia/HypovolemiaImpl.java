package com.narayana.Hypovolemia;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class HypovolemiaImpl implements HypovolemiaRepository {
	protected Logger logger = Logger
			.getLogger(HypovolemiaImpl.class.getName());



	@Override
	public String gethypovolemia(String hypovolemicSymptoms) {
		if(Integer.parseInt(hypovolemicSymptoms)==1){
			return "hypovolemia";
			
		}
		else {
			return "notHypovolemia";
		}
	}

}
