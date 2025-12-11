package com.example.academy;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teachers")   // 공통 URL prefix
public class TeacherController {
	
	private final List<Teacher> teachers = new ArrayList<>();
	private Long nextId = 1L;  // auto-increment 역할
	
	// ⭐ CREATE — POST /teachers
	@PostMapping
	public Teacher createTeacher(@RequestBody Teacher teacher) {
		teacher.setId(nextId++);
		teachers.add(teacher);
		return teacher;
	}
	
	// ⭐ READ — GET /teachers
	@GetMapping
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	// ⭐ READ ONE — GET /teachers/{id}
	@GetMapping("/{id}")
	public Teacher getTeacher(@PathVariable Long id) {
		return teachers.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
	
	// ⭐ UPDATE — PUT /teachers/{id}
	@PutMapping("/{id}")
	public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher updatedTeacher) {
		for (Teacher teacher : teachers) {
			if (teacher.getId().equals(id)) {
				teacher.setName(updatedTeacher.getName());
				teacher.setAge(updatedTeacher.getAge());
				teacher.setSubject(updatedTeacher.getSubject());
				return teacher;
			}
		}
		return null;  // 없으면 null 리턴 (원하면 404 처리 가능)
	}
	
	// ⭐ DELETE — DELETE /teachers/{id}
	@DeleteMapping("/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		boolean removed = teachers.removeIf(t -> t.getId().equals(id));
		
		if (removed) {
			return "삭제되었습니다.";
		} else {
			return "해당 ID의 선생님이 존재하지 않습니다.";
		}
	}
}