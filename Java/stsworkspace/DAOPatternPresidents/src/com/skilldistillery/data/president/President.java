package com.skilldistillery.data.president;

import java.time.LocalDate;
import java.time.Period;

public class President implements Comparable<President> {
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	// private String termStart; // New String field
	// private String termEnd; // New String field
	private LocalDate termStart; // Replace Strings with LocalDates
	private LocalDate termEnd;
	private int electionsWon;
	private String whyLeftOffice;
	private String party;

	// Getter for termLength property
	public Period getTermLength() {
		return Period.between(termStart, termEnd != null ? termEnd : LocalDate.now());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + electionsWon;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((party == null) ? 0 : party.hashCode());
		result = prime * result + ((termEnd == null) ? 0 : termEnd.hashCode());
		result = prime * result + termNumber;
		result = prime * result + ((termStart == null) ? 0 : termStart.hashCode());
		result = prime * result + ((whyLeftOffice == null) ? 0 : whyLeftOffice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		President other = (President) obj;
		if (electionsWon != other.electionsWon)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		}
		else if (!middleName.equals(other.middleName))
			return false;
		if (party == null) {
			if (other.party != null)
				return false;
		}
		else if (!party.equals(other.party))
			return false;
		if (termEnd == null) {
			if (other.termEnd != null)
				return false;
		}
		else if (!termEnd.equals(other.termEnd))
			return false;
		if (termNumber != other.termNumber)
			return false;
		if (termStart == null) {
			if (other.termStart != null)
				return false;
		}
		else if (!termStart.equals(other.termStart))
			return false;
		if (whyLeftOffice == null) {
			if (other.whyLeftOffice != null)
				return false;
		}
		else if (!whyLeftOffice.equals(other.whyLeftOffice))
			return false;
		return true;
	}

	public President(int termNumber, String firstName, String middleName, String lastName, int electionsWon,
			String reasonLeftOffice, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.party = party;
	}

	public int getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getElectionsWon() {
		return electionsWon;
	}

	public void setElectionsWon(int electionsWon) {
		this.electionsWon = electionsWon;
	}

	public String getWhyLeftOffice() {
		return whyLeftOffice;
	}

	public void setWhyLeftOffice(String reasonLeftOffice) {
		this.whyLeftOffice = reasonLeftOffice;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(termNumber + ": ");
		builder.append(firstName + " ");
		if (middleName.length() > 0) {
			builder.append(middleName + " ");
		}
		builder.append(lastName);
		// builder.append(", " + termStart);
		// builder.append(" - " + termEnd + " (");
		//// builder.append(getTermLength());
		// builder.append(");");
		builder.append(" (" + party + ")");
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", whyLeftOffice=");
		builder.append(whyLeftOffice);
		return builder.toString();
	}

	@Override
	public int compareTo(President other) {
		if (this.termNumber > other.termNumber) {
			return 1;
		}
		else if (this.termNumber < other.termNumber) {
			return -1;
		}
		return 0;
	}

	// public String getTermEnd() {
	public LocalDate getTermEnd() {
		return termEnd;
	}

	// public void setTermEnd(String termEnd) {
	public void setTermEnd(LocalDate termEnd) {
		this.termEnd = termEnd;
	}

	// public String getTermStart() {
	public LocalDate getTermStart() {
		return termStart;
	}

	// public void setTermStart(String termStart) {
	public void setTermStart(LocalDate termStart) {
		this.termStart = termStart;
	}

	// public President(int termNumber, String firstName, String middleName, String
	// lastName, String termStart, String termEnd, int electionsWon, String
	// whyLeftOffice, String party) {
	public President(int termNumber, String firstName, String middleName, String lastName, LocalDate termStart,
			LocalDate termEnd, int electionsWon, String whyLeftOffice, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.termStart = termStart;
		this.termEnd = termEnd;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = whyLeftOffice;
		this.party = party;
	}

}