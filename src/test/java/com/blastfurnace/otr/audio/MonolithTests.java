package com.blastfurnace.otr.audio;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.blastfurnace.otr.AppConfigTest;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.assertTrue;

import java.util.Map;

/**
 * Integration Tests for Audio Services
 *
 * @author Jim Blackson
 */
public class MonolithTests extends AppConfigTest {
	
	private static final Logger log = LoggerFactory.getLogger(MonolithTests.class); 
	
	@Test
	public void shouldPerformAudioAPIRestTests() throws Exception {
		log.info("Monolith Tests - Start");
		
		
		log.info("Monolith Tests - End");
	}
	
}
