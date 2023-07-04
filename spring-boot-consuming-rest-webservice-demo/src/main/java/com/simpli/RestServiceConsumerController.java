package com.simpli;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.simpli.entity.Todo;

@Controller

public class RestServiceConsumerController {

	@GetMapping("/todo/{id}")
	public String todo(@PathVariable("id") int id, Model model) {

		// Web service we are consuming is at: https://jsonplaceholder.typicode.com/
		// It provides todo data in the form:
//				{
//					  "userId": 1,
//					  "id": 3,
//					  "title": "fugiat veniam minus",
//					  "completed": false
//					}
//				 when we hit https://jsonplaceholder.typicode.com/todos/3
		RestTemplate restTemplate = new RestTemplate();
		Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + id, Todo.class);

		model.addAttribute("todo", todo);

		return "todo-details"; // todo-details.jsp
	}

}