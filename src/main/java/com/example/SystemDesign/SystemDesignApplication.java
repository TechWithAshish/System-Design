package com.example.SystemDesign;

import com.example.SystemDesign.DecoratorDesignPattern.DecoratorSolutionRunner;
import com.example.SystemDesign.ObserverDesignPattern.ObserverSolutionRunner;
import com.example.SystemDesign.StrategyDesignPattern.Issue.StrategyIssueRunnerImpl;
import com.example.SystemDesign.StrategyDesignPattern.Solution.StrategySolutionRunnerImpl;
import com.example.SystemDesign.TicTacToeGame.GameSolutionRunner;


public class SystemDesignApplication {

	public static void main(String[] args) {
		System.out.println("......................................Strategy Design Pattern..............................");
		IssueRunner strategyIssueRunner = new StrategyIssueRunnerImpl();
		strategyIssueRunner.run();
		System.out.println("............................................................................................");
		SolutionRunner strategySolutionRunner = new StrategySolutionRunnerImpl();
		strategySolutionRunner.run();

		System.out.println("......................................Observer Design Pattern..............................");
		SolutionRunner observerSolutionRunner = new ObserverSolutionRunner();
		observerSolutionRunner.run();
		System.out.println("......................................Decorator Design Pattern..............................");
		SolutionRunner decorator = new DecoratorSolutionRunner();
		decorator.run();
		System.out.println("............................................................................................");
		System.out.println("..........................................Tic Tac Toe Game...................................");
		SolutionRunner solutionRunner = new GameSolutionRunner();
		solutionRunner.run();
	}

}
