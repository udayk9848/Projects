package com.uday;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uday.StudentService.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	/* , "command", new Student() */
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("command") Student student) {
		System.out.println("in add student");
		studentService.addStudent(student);

		System.out.println(student.getName() + "  " + student.getPhone());
		/* this.StudentD.addPerson(p); */
		/*
		 * ModelAndView model = new ModelAndView("result");
		 * model.addObject("Phno", student.getPhone());
		 */

		return "redirect:/studentDetails";

	}

	@RequestMapping("/studentDetails")
	public String listContacts(Map<String, Object> map) {
		map.put("command", new Student());
		map.put("contactList", studentService.listStudent());

		return "result";
	}

	@RequestMapping("/delete/{commandid}")
	public String deleteContact(@PathVariable("commandid") Integer commandid) {
		System.out.println("in delete controller " + commandid);
		studentService.removeStudent(commandid);

		return "redirect:/studentDetails";
	}

	@RequestMapping(value="/edit/{commandid}" ,method=RequestMethod.GET)
	public ModelAndView editContact(@PathVariable("commandid") Integer commandid) {
		System.out.println("in edit controller " + commandid);
		studentService.getStudent(commandid);
		ModelAndView model = new ModelAndView("editform");
		Student student = studentService.getStudent(commandid);
		model.addObject("command", student);

		return model;
	}

	@RequestMapping(value = "/edit/{commandid}", method = RequestMethod.POST)
	public String edditingTeam(@ModelAttribute("command") Student student, @PathVariable Integer commandid) {
		System.out.println("in editing" +student.getName());
		studentService.updateStudent(student);
		String message = "student was successfully edited.";
		System.out.println(message);
		return "redirect:/studentDetails";

	}

}