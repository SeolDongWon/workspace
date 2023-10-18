package sqlProject;

import java.util.Objects;

public class StudentGrade {
	private int student_id;
	private String student_name;
	private int programing;
	private int application_SW;
	private int database_design;
	private int network_design;
	private int sql_java_design;

	public StudentGrade(int student_id, String student_name, int programing, int application_SW, int database_design,
			int network_design, int sql_java_design) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.programing = programing;
		this.application_SW = application_SW;
		this.database_design = database_design;
		this.network_design = network_design;
		this.sql_java_design = sql_java_design;
	}

	public int getStudent_id() {
		return student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public int getPrograming() {
		return programing;
	}

	public int getApplication_SW() {
		return application_SW;
	}

	public int getDatabase_design() {
		return database_design;
	}

	public int getNetwork_design() {
		return network_design;
	}

	public int getSql_java_design() {
		return sql_java_design;
	}

	@Override
	public int hashCode() {
		return Objects.hash(student_id);
	}

	@Override
	public boolean equals(Object obj) {
		StudentGrade studentGrade = null;
		if (!(obj instanceof StudentGrade)) {
			return false;
		}
		studentGrade = (StudentGrade) obj;
		return this.student_id == studentGrade.student_id;
	}

	@Override
	public String toString() {
		return String.format("%3d \t %10s \t %3d \t %3d \t %3d \t %3d \t %3d \n", student_id, student_name, programing,
				application_SW, database_design, network_design, sql_java_design);
	}

}
