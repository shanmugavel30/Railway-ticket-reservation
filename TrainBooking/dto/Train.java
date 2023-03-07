package com.TrainBooking.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Train {
	private int trainId;
	private String source;
	private String destination;
	private String date;
	private int noOfTicket;
	private int upperSeats;
	private int middleSeats;
	private int lowerSeats;
	private int rac;
	private int waitingList;
	private List<Integer> lowerBerthsPositions;
	private List<Integer> middleBerthsPositions;
	private List<Integer> upperBerthsPositions;
	private List<Integer> racPositions;
	private List<Integer> waitingListPositions;
	private List<Integer> thakkalSeats;
	private int thakkal;
	private int thakkalAmount;
	private int amount;

	public Train(int trainId, String Source, String Destination, String Date, int noOfTicket, int amount,
			int thakkalAmount) {
		this.setTrainId(trainId);
		this.setsource(source);
		this.setdestination(destination);
		this.setdate(date);
		this.noOfTicket = noOfTicket;
		this.amount = amount;
		this.thakkalAmount = thakkalAmount;
		this.upperSeats = noOfTicket / 3;
		this.middleSeats = noOfTicket / 3;
		this.lowerSeats = noOfTicket / 3;
		this.rac = 10;
		this.waitingList = 5;
		this.lowerBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.middleBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.upperBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.racPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		this.waitingListPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	}

	public Train(int trainId) {
		this.setTrainId(trainId);
		this.setsource(source);
		this.setdestination(destination);
		this.setdate(date);
		this.upperSeats = noOfTicket / 3;
		this.middleSeats = noOfTicket / 3;
		this.lowerSeats = noOfTicket / 3;
		this.rac = 10;
		this.waitingList = 5;
		this.lowerBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.middleBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.upperBerthsPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		this.racPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		this.waitingListPositions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getsource() {
		return source;
	}

	public void setsource(String source) {
		this.source = source;
	}

	public String getdestination() {
		return destination;
	}

	public void setdestination(String destination) {
		this.destination = destination;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public int getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public int getUpperSeats() {
		return upperSeats;
	}

	public void setUpperSeats(int upperSeats) {
		this.upperSeats = upperSeats;
	}

	public int getMiddleSeats() {
		return middleSeats;
	}

	public void setMiddleSeats(int middleSeats) {
		this.middleSeats = middleSeats;
	}

	public int getLowerSeats() {
		return lowerSeats;
	}

	public void setLowerSeats(int lowerSeats) {
		this.lowerSeats = lowerSeats;
	}

	public int getRac() {
		return rac;
	}

	public void setRac(int rac) {
		this.rac = rac;
	}

	public int getWaitingList() {
		return waitingList;
	}

	public void setWaitingList(int waitingList) {
		this.waitingList = waitingList;
	}

	public List<Integer> getLowerBerthsPositions() {
		return lowerBerthsPositions;
	}

	public void setLowerBerthsPositions(List<Integer> lowerBerthsPositions) {
		this.lowerBerthsPositions = lowerBerthsPositions;
	}

	public List<Integer> getMiddleBerthsPositions() {
		return middleBerthsPositions;
	}

	public void setMiddleBerthsPositions(List<Integer> middleBerthsPositions) {
		this.middleBerthsPositions = middleBerthsPositions;
	}

	public List<Integer> getUpperBerthsPositions() {
		return upperBerthsPositions;
	}

	public void setUpperBerthsPositions(List<Integer> upperBerthsPositions) {
		this.upperBerthsPositions = upperBerthsPositions;
	}

	public List<Integer> getRacPositions() {
		return racPositions;
	}

	public void setRacPositions(List<Integer> racPositions) {
		this.racPositions = racPositions;
	}

	public List<Integer> getWaitingListPositions() {
		return waitingListPositions;
	}

	public void setWaitingListPositions(List<Integer> waitingListPositions) {
		this.waitingListPositions = waitingListPositions;
	}

	public int getThakkal() {
		return thakkal;
	}

	public void setThakkal(int thakkal) {
		this.thakkal = thakkal;
	}

	public List<Integer> getThakkalSeats() {
		return thakkalSeats;
	}

	public void setThakkalSeats(List<Integer> thakkalSeats) {
		this.thakkalSeats = thakkalSeats;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getThakkalAmount() {
		return thakkalAmount;
	}

	public void setThakkalAmount(int thakkalAmount) {
		this.thakkalAmount = thakkalAmount;
	}
}
