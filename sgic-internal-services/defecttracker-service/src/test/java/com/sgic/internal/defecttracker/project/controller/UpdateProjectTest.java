<<<<<<< HEAD
//package com.sgic.internal.defecttracker.project.controller;
//
//import java.io.IOException;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.client.RestClientException;
//
//import com.sgic.internal.defecttracker.project.ProjectApplicationTest;
//import com.sgic.internal.defecttracker.project.controller.dto.ProjectData;
//
//public class UpdateProjectTest extends ProjectApplicationTest {
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	
//	@SuppressWarnings("unused")
//	private ProjectData projectData = new ProjectData();
//	private String BASE_URL = "localhost:8080/project_servicet";
//	private String ADD_API_URL = "/createprojec";
//	private String GET_API_URL = "/GetAllproject";
//	private String PUT_API_URL = "/updateProject";
//	private String projectId = "2";
//
//	private static final String ADD_PROJECT_RESPONSE = "[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
//	private static final String GET_PROJECT_RESPONSE = "[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
//	private static final String PUT_EMPLOYEE_RESPONSE ="[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
//	
//	@Test
//	public void addProject() throws IOException, RestClientException {
//		ProjectData projectData = new ProjectData ("1", "Aarany", "Sweet", "2017-05-06", "2017-05-05", "week 7month","sweetheart","003");
//		HttpEntity<ProjectData> request = new HttpEntity<ProjectData>(projectData, httpHeaders);
//		ResponseEntity<String> postResponse = testRestTemplate.postForEntity(BASE_URL + ADD_API_URL, request,
//				String.class);
//		assertEquals(http)
//	}
//	}
=======
package com.sgic.internal.defecttracker.project.controller;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestClientException;

import com.sgic.internal.defecttracker.project.ProjectApplicationTest;
import com.sgic.internal.defecttracker.project.controller.dto.ProjectData;

public class UpdateProjectTest extends ProjectApplicationTest {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@SuppressWarnings("unused")
	private ProjectData projectData = new ProjectData();
	private String BASE_URL = "localhost:8080/project_servicet";
	private String ADD_API_URL = "/createprojec";
	private String GET_API_URL = "/GetAllproject";
	private String PUT_API_URL = "/updateProject";
	private String projectId = "2";

	private static final String ADD_PROJECT_RESPONSE = "[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
	private static final String GET_PROJECT_RESPONSE = "[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
	private static final String PUT_EMPLOYEE_RESPONSE ="[{\"projectId\":\"1\",\"projectName\": \"mm\", \"type\": \"Sweet 1\", \"startDate\": \"2017-05-06\",\"endDate\":\"2017-05-05\",\"duration\": \"week 7month\",\"status\":\"sweetheart\",\"configId\":\"03\" }]";
	
	@Test
	public void addProject() throws IOException, RestClientException {
		ProjectData projectData = new ProjectData ("1", "Aarany", "Sweet", "2017-05-06", "2017-05-05", "week 7month","sweetheart","003");
		HttpEntity<ProjectData> request = new HttpEntity<ProjectData>(projectData, httpHeaders);
		ResponseEntity<String> postResponse = testRestTemplate.postForEntity(BASE_URL + ADD_API_URL, request,
				String.class);
		assertEquals(http)
	}
	}
>>>>>>> 52e9b162a31ea3d70d117cf20100f3ce516bb500
