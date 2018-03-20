package com.skilldistillery.history;

import java.time.LocalDate;
import java.time.Period;

public class President implements Comparable<President> {
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int electionsWon;
	private String whyLeftOffice;
	private String party;
	private LocalDate termBegin;
	private LocalDate termEnd;

	public President(int termNumber, String firstName, String middleName, String lastName, LocalDate termBegin,
			LocalDate termEnd, int electionsWon, String reasonLeftOffice, String party) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.termBegin = termBegin;
		if (termEnd != LocalDate.now()) 
		this.termEnd = termEnd;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.party = party;
	}

	public LocalDate getTermBegin() {
		return termBegin;
	}

	public void setTermBegin(LocalDate termBegin) {
		this.termBegin = termBegin;
	}

	public LocalDate getTermEnd() {
		return termEnd;
	}

	public void setTermEnd(LocalDate termEnd) {
		this.termEnd = termEnd;
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
		builder.append(lastName + " ");
		builder.append(", termBegin=");
		builder.append(termBegin + " ");
		builder.append(", termEnd=");
		builder.append(termEnd + " ");		
		builder.append(" (" + party + ")");
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", whyLeftOffice=");
		builder.append(whyLeftOffice);
		builder.append(", timeInOffice=");
		builder.append(getLengthInOffice() + " months");
		
		return builder.toString();
	}

	public long getLengthInOffice() {
		Period lengthInOffice;
		lengthInOffice = Period.between(this.termBegin, this.termEnd);
		return lengthInOffice.toTotalMonths();
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

}