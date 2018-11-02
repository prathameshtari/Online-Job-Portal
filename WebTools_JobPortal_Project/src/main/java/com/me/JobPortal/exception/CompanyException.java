package com.me.JobPortal.exception;

public class CompanyException extends Exception {


		public CompanyException(String message)
		{
			super("CompanyException-"+message);
		}
		
		public CompanyException(String message, Throwable cause)
		{
			super("CompanyException-"+message,cause);
		}
		
	}


