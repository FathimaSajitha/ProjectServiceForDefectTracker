package com.sgic.internal.defecttracker.project.controller;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.ApiResponse;
import com.sgic.internal.defecttracker.project.controller.dto.ProjectData;
import com.sgic.internal.defecttracker.project.controller.dtomapper.ProjectDtoMapper;

import com.sgic.internal.defecttracker.project.services.ProjectService;
import com.sgic.internal.defecttracker.project.services.impl.ProjectServiceImpl;

@RestController
public class ProjectController {
	

	private static Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
	
	@Autowired
	public ProjectDtoMapper projectDtoMapper;
	
//	@PostMapping(value="/project")
//	public ResponseEntity<Object>createProject(@RequestBody   )

	// Post Mapping For Create a Project by sajitha
	@PostMapping(value = "/createproject")
	public ResponseEntity<Object> createProject(@RequestBody ProjectData projectData) {
		projectDtoMapper.saveProjectforMapper(projectData);
		logger.info("Project created");
		return new ResponseEntity<>(new ApiResponse(RestApiResponseStatus.OK), HttpStatus.OK);
	}

	// Get Mapping For Get All Project by Mercy
	@GetMapping(value = "/GetAllproject")
	public ResponseEntity<List<ProjectData>> listEmployeeInfo() {
		logger.info("Project are listed ");
		return new ResponseEntity<>(projectDtoMapper.getAllProjectForMapper(), HttpStatus.OK);
	}

	// Get Mapping For Get Project By Id Jakki
	@GetMapping("/getProjectById/{id}")
	public ResponseEntity<ProjectData> getProjectById(@PathVariable Long id) {
		logger.info("Projects are get by id ");
		return new ResponseEntity<>(projectDtoMapper.getByProjectId(id), HttpStatus.OK);
	}

	// Delete Mapping For Project By thadsha
	@DeleteMapping("deleteById/{projectId}")
	public ResponseEntity<ProjectData> deleteById(@PathVariable Long projectId) {
		logger.info("Projects are delete by id ");
		return new ResponseEntity<>(projectDtoMapper.deleteById(projectId), HttpStatus.OK);
	}

	// Put Mapping For Project By Arany
	@PutMapping("/updateProject/{projectid}")
	public ResponseEntity<String> updateProject(@PathVariable(name = "projectid") Long projectid,
			@RequestBody ProjectData projectData) {
		projectDtoMapper.UpdateProject(projectid, projectData);
		return new ResponseEntity<>("user updated succesfully", HttpStatus.OK);
	}

	// Get Mapping For Project Name By Sujanthan
	@GetMapping("/getName/{name}")
	public List<ProjectData> getByprojectName(@PathVariable String name) {
		logger.info("Projects are get by name ");
		return projectDtoMapper.getByprojectNameForMapper(name);
	}

	// Get Mapping For Project Type By Sajitha
	@GetMapping("/gettype/{type}")
	public List<ProjectData> getBytype(@PathVariable String type) {
		logger.info("Projects are get by type");
		return projectDtoMapper.getByProjecttype(type);
	}

	// Get Mapping For Project Start Date By thatsha
	@GetMapping("/getDate/{date}")
	public List<ProjectData> getBystartDate(@PathVariable String date) {
		logger.info("Projects are get by date ");
		return projectDtoMapper.getBystartDateformapper(date);

	}

	// Get Mapping For Project duration By Aarany
	@GetMapping("/getduration/{duration}")
	public List<ProjectData> getByduration(@PathVariable String duration) {
		logger.info("Projects are get by duration");
		return projectDtoMapper.getBydurationformapper(duration);
	}

	// Get Mapping For Project Start Date By Mercy
	@GetMapping("/getstatus/{status}")
	public List<ProjectData> getBystatus(@PathVariable String status) {
		logger.info("Projects are get by status");
		return projectDtoMapper.getBystatusformapper(status);
	}

}
