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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import com.sgic.internal.defecttracker.project.ProjectApplicationTest;
import com.sgic.internal.defecttracker.project.entities.Project;

public class ProjectDeleteTest extends  ProjectApplicationTest {
	
	@Autowired
	JdbcTemplate  jdbcTemplate;
	
	@Before
	public void setup() {

}
	//Delete By Thadsha
	private String getRootUrl() {
		// TODO Auto-generated method stub
		return "http://localhost:8080/project_service";
	}
	 @Test
	    public void DeleteProjectTest() throws IOException,RestClientException {
	         int id = 1;
	         Project project = testRestTemplate.getForObject(getRootUrl() + "/deleteById/" + id, Project.class);
	         assertNotNull(project);
	         testRestTemplate.delete(getRootUrl() + "/project/" + id);
	         try {
	              project = testRestTemplate.getForObject(getRootUrl() + "/deleteById/" + id, Project.class);
	         } catch (final HttpClientErrorException e) {
	              assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
	         }
	    }
	
	}