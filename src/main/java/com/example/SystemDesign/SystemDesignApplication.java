package com.example.SystemDesign;

import com.example.SystemDesign.StrategyDesignPattern.Issue.StrategyIssueRunnerImpl;
import com.example.SystemDesign.StrategyDesignPattern.Solution.StrategySolutionRunnerImpl;


public class SystemDesignApplication {

	public static void main(String[] args) {
		IssueRunner strategyIssueRunner = new StrategyIssueRunnerImpl();
		strategyIssueRunner.run();
		System.out.println(".......................................................................................");
		SolutionRunner strategySolutionRunner = new StrategySolutionRunnerImpl();
		strategySolutionRunner.run();
	}

}
