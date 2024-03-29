package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.persistence.TemporalType.DATE;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.TemporalType.TIMESTAMP;


@Entity
public class Board implements Serializable {
	

/**
	 * 
	 */
	private static final long serialVersionUID = -8524375921741447222L;
@Id
@GeneratedValue(strategy = IDENTITY)
private Integer idBoard;
private String boardName;
private String boardStorie;
private String boardStatus;
@Temporal(TIMESTAMP)
private Date startDate_board= new Date();
@Temporal(TIMESTAMP)
private Date endDate_board =  new Date();
@OneToMany(cascade = ALL, mappedBy = "board_taskList")
private List<TaskList>taskList_board= new ArrayList<>();


public Board() {
	super();
}



public Board(Integer idBoard, String boardName, String boardStorie, String boardStatus, Date startDate_board,
		Date endDate_board) {
	super();
	this.idBoard = idBoard;
	this.boardName = boardName;
	this.boardStorie = boardStorie;
	this.boardStatus = boardStatus;
	this.startDate_board = startDate_board;
	this.endDate_board = endDate_board;
}



public Board(String boardName, String boardStorie, String boardStatus, Date startDate_board, Date endDate_board,
		List<TaskList> taskList_board) {
	super();
	this.boardName = boardName;
	this.boardStorie = boardStorie;
	this.boardStatus = boardStatus;
	this.startDate_board = startDate_board;
	this.endDate_board = endDate_board;
	this.taskList_board = taskList_board;
}




@XmlElement
public Integer getIdBoard() {
	return idBoard;
}


public void setIdBoard(Integer idBoard) {
	this.idBoard = idBoard;
}

@XmlElement
public String getBoardName() {
	return boardName;
}


public void setBoardName(String boardName) {
	this.boardName = boardName;
}

@XmlElement
public String getBoardStatus() {
	return boardStatus;
}


public void setBoardStatus(String boardStatus) {
	this.boardStatus = boardStatus;
}

@XmlElement
public Date getStartDate_board() {
	return startDate_board;
}


public void setStartDate_board(Date startDate_board) {
	this.startDate_board = startDate_board;
}

@XmlElement
public Date getEndDate_board() {
	return endDate_board;
}


public void setEndDate_board(Date endDate_board) {
	this.endDate_board = endDate_board;
}

@XmlElementWrapper(name = "TaskLists")      @XmlElement(name = "taskList")
public List<TaskList> getTaskList_board() {
	return taskList_board;
}


public void setTaskList_board(List<TaskList> taskList_board) {
	this.taskList_board = taskList_board;
}

@XmlElement
public String getBoardStorie() {
	return boardStorie;
}





public void setBoardStorie(String boardStorie) {
	this.boardStorie = boardStorie;
}





@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idBoard == null) ? 0 : idBoard.hashCode());
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
	Board other = (Board) obj;
	if (idBoard == null) {
		if (other.idBoard != null)
			return false;
	} else if (!idBoard.equals(other.idBoard))
		return false;
	return true;
}





@Override
public String toString() {
	return "Board [idBoard=" + idBoard + ", boardName=" + boardName + ", boardStorie=" + boardStorie + ", boardStatus="
			+ boardStatus + ", startDate_board=" + startDate_board + ", endDate_board=" + endDate_board + "]";
}









}
