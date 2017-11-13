package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class HomeController {

	private Calculator ti = new Calculator();

	@RequestMapping("/")
	public ModelAndView defaultPage() {
		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}

	@RequestMapping("/calculate")
	public ModelAndView calculate(int firstNumber, String operator, int secondNumber) {
		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("calculator");

		if (operator.equals("+")) {
			ti.add(firstNumber, secondNumber);
		}
		if (operator.equals("-")) {
			ti.subtract(firstNumber, secondNumber);
		}
		if (operator.equals("*")) {
			ti.multiply(firstNumber, secondNumber);
		}
		if (operator.equals("/")) {
			ti.divide(firstNumber, secondNumber);
		}
		if (operator.equals("^")) {
			ti.exponent(firstNumber, secondNumber);
		}

		mv.addObject("calculator", ti);
		return mv;

	}
}