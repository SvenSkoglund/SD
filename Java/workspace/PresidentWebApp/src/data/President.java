package data;

public class President {
	private String term;
	private String first_name;
	private String last_name;
	private String inauguration_date;
	private String elections_won;
	private String reason_left_office;
	private String party;

	public President() {
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getInauguration_date() {
		return inauguration_date;
	}

	public void setInauguration_date(String inauguration_date) {
		this.inauguration_date = inauguration_date;
	}

	public String getElections_won() {
		return elections_won;
	}

	public void setElections_won(String elections_won) {
		this.elections_won = elections_won;
	}

	public String getReason_left_office() {
		return reason_left_office;
	}

	public void setReason_left_office(String reason_left_office) {
		this.reason_left_office = reason_left_office;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "President [term=" + term + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", inauguration_date=" + inauguration_date + ", elections_won=" + elections_won
				+ ", reason_left_office=" + reason_left_office + ", party=" + party + "]";
	}

	public President(String term, String first_name, String last_name, String inauguration_date, String elections_won,
			String reason_left_office, String party) {
		this.term = term;
		this.first_name = first_name;
		this.last_name = last_name;
		this.inauguration_date = inauguration_date;
		this.elections_won = elections_won;
		this.reason_left_office = reason_left_office;
		this.party = party;
	}


	

}
