package com.sgic.internal.defecttracker.project.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestClientException;

import com.sgic.internal.defecttracker.project.ProjectApplicationTest;
import com.sgic.internal.defecttracker.project.entities.Project;

public class ProjectUpdateTest extends ProjectApplicationTest{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Before
	public void setup() {
		
	}
		
	@Test
	public void updateProjectupdateTest() throws IOException, RestClientException {
		
		int projectid =1;
		ResponseEntity<Project> project = testRestTemplate.getForEntity("http://localhost:8081/project_service" + "/getProjectById/" + projectid,Project.class);
		assertNotNull(project);
		Project project2 = new Project();
		Date endDate=new Date(2018, 07, 12);
		Date startDate=new Date(2019, 02, 13);
		project2.setConfigId("1");
		project2.setDuration("1");
//		project2.setEndDate(startDate);
		project2.setProjectName("xx");
//		project2.setStartDate(endDate);
		project2.setStatus("dd");
		project2.setType("oo");
		testRestTemplate.put("http://localhost:8081/project_service/"+"updateProject/"+projectid, project2, Project.class);
		
	}
	
	@After
	public void tearDown() {

	}

	public final class ProjectupdateTestSuccessfullConstant {

		public ProjectupdateTestSuccessfullConstant() {
		}

		private static final String PROJECT_DEVELOPMENT_TEST_RESPONSE = "[ { \\\"projectId\\\": 1, \\\"projectName\\\": \\\"jakee\\\", \\\"type\\\": \\\"fytvh\\\", \\\"startDate\\\": \\\"2018-07-12\\\", \\\"endDate\\\": \\\"2018-02-16\\\", \\\"duration\\\": \\\"2 year\\\", \\\"status\\\": \\\"open\\\", \\\"configId\\\": \\\"011\\\" } ]";
	}

	}


