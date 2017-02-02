package kam.jar.radek.hibernate.com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kam.jar.radek.hibernate.com.model.User;

@Entity
@Table(name = "USERS_JOB")
public class Job {
	@Id
	@Column(name = "JOB_ID")
	private int jobId;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "JOB_DESCRIPTION")
	private String jobDesc;
	@JoinColumn(name =  "USER_ID", updatable = false, insertable = false)
	@ManyToOne
	private User us;
	public Job() {
			}
	public Job(int jobId, Date date, String jobDesc) {
		super();
		this.jobId = jobId;
		this.date = date;
		this.jobDesc = jobDesc;
	}
	protected int getJobId() {
		return jobId;
	}
	protected void setJobId(int jobId) {
		this.jobId = jobId;
	}
	protected Date getDate() {
		return date;
	}
	protected void setDate(Date date) {
		this.date = date;
	}
	protected String getJobDesc() {
		return jobDesc;
	}
	protected void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	protected User getU() {
		return us;
	}
	protected void setU(User u) {
		this.us = u;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", date=" + date + ", jobDesc=" + jobDesc + ", u=" + us + "]";
	}
	

}
