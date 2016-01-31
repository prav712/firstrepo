package com.websystique.springbatch;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class CustomListener implements StepExecutionListener{

	public void beforeStep(StepExecution stepExecution) {
		System.out.println("hi");
		
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("bye");
		return ExitStatus.COMPLETED;
	}

}
