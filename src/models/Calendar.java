package models;

import java.time.MonthDay;
import java.util.ArrayList;

public class Calendar {
	public int id;
	public MonthDay monthDay;
	public ArrayList<Task> tasksToday;
	public ArrayList<Teamtask> teamTaskToday;
}
