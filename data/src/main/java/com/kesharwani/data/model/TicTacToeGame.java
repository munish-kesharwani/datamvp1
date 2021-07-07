package com.kesharwani.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TicTacToeGame {
    /**
     * this is the game-id. for every game user plays - it will be a unique game-id.
     * User can retrieve a game to resume.
     */
    @Id
    @Column
    private long gameID;

    /**
     * holds the status of the game. which is :
     * Draw
     * In Progress
     * Computer Won
     * User Won
     * //TODO Later on - for enhancements - we can make it Tic won or Tac won.
     */
    @Column
    private String gameStatus;

    /**
     * these are different cells of 3x3 grid.
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * // TODO should it be separate table with 3 rows (representing each row of the grid?)
     * // TODO design decision - which design is better - 9 values or rows, ?
     * // with document database - if the whole thing is stored as JSON - would it matter ?
     */
    @Column
    private int cell1;
    @Column
    private int cell2;
    @Column
    private int cell3;
    @Column
    private int cell4;
    @Column
    private int cell5;
    @Column
    private int cell6;
    @Column
    private int cell7;
    @Column
    private int cell8;
    @Column
    private int cell9;

    /**
     * this stores - who has to play next.
     * 0 - Computer
     * 1 - User
     * 2 - no-body - usually if game has hit end-status
     */
    @Column
    private int whoseTurnToPlay;


    public long getGameID() {
        return gameID;
    }

    public void setGameID(long gameID) {
        this.gameID = gameID;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getCell1() {
        return cell1;
    }

    public void setCell1(int cell1) {
        this.cell1 = cell1;
    }

    public int getCell2() {
        return cell2;
    }

    public void setCell2(int cell2) {
        this.cell2 = cell2;
    }

    public int getCell3() {
        return cell3;
    }

    public void setCell3(int cell3) {
        this.cell3 = cell3;
    }

    public int getCell4() {
        return cell4;
    }

    public void setCell4(int cell4) {
        this.cell4 = cell4;
    }

    public int getCell5() {
        return cell5;
    }

    public void setCell5(int cell5) {
        this.cell5 = cell5;
    }

    public int getCell6() {
        return cell6;
    }

    public void setCell6(int cell6) {
        this.cell6 = cell6;
    }

    public int getCell7() {
        return cell7;
    }

    public void setCell7(int cell7) {
        this.cell7 = cell7;
    }

    public int getCell8() {
        return cell8;
    }

    public void setCell8(int cell8) {
        this.cell8 = cell8;
    }

    public int getCell9() {
        return cell9;
    }

    public void setCell9(int cell9) {
        this.cell9 = cell9;
    }

    public int getWhoseTurnToPlay() {
        return whoseTurnToPlay;
    }

    public void setWhoseTurnToPlay(int whoseTurnToPlay) {
        this.whoseTurnToPlay = whoseTurnToPlay;
    }
}
