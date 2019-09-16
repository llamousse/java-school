package com.lambdaschool.school.model;

import org.springframework.boot.context.properties.bind.validation.ValidationErrors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail
{
	private String title;
	private int status;
	private String detail;
	private String timestamp;
	private String developerMessage;
	private Map<String, List<ValidationErrors>> errors = new HashMap<>();

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getDetail()
	{
		return detail;
	}

	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	public String getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(Long timestamp)
	{
		this.timestamp = new SimpleDateFormat("MMM dd yyyy HH:mm:ss:SSS Z").format(new Date(timestamp));
	}

	public String getDeveloperMessage()
	{
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage)
	{
		this.developerMessage = developerMessage;
	}

	public Map<String, List<ValidationErrors>> getErrors()
	{
		return errors;
	}

	public void setErrors(Map<String, List<ValidationErrors>> errors)
	{
		this.errors = errors;
	}
}

