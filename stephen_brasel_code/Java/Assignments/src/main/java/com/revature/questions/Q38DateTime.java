package com.revature.questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Q38DateTime {
	private LocalDateTime localDateTime = LocalDateTime.now();;
	private LocalDate localDate = LocalDate.now();;
	private LocalTime localTime = LocalTime.now();

	public Q38DateTime() {
	}

	public Q38DateTime(LocalDateTime localDateTime, LocalDate localDate, LocalTime localTime) {

		this.localDateTime = localDateTime;
		this.localDate = localDate;
		this.localTime = localTime;
	}

	public LocalDateTime getLocalDateTime() {

		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public void setLocalDateTime(LocalDate localDate, LocalTime localTime) {
		this.localDateTime = localDateTime.of(localDate, localTime);
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public void setLocalDateAndTime(LocalDateTime localDateAndTime){
		localDate = localDateAndTime.toLocalDate();
		localTime = localDateAndTime.toLocalTime();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Q38DateTime that = (Q38DateTime) o;
		return Objects.equals(localDateTime, that.localDateTime) &&
				Objects.equals(localDate, that.localDate) &&
				Objects.equals(localTime, that.localTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(localDateTime, localDate, localTime);
	}

	@Override
	public String toString() {
		return "Q38DateTime{" +
				"localDateTime=" + localDateTime +
				", localDate=" + localDate +
				", localTime=" + localTime +
				'}';
	}
}
