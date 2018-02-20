package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign.equals("paper")) {
            return "scissor";
        } else if (handSign.equals("paper")) {
            return "scissor";
        } else if (handSign.equals("rock")) {
            return "paper";
        }

        return handSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equals("paper")) {
            return "rock";
        } else if (handSign.equals("scissors")) {
            return "paper";
        } else if (handSign.equals("rock")) {
            return "scissors";
        }
        return handSign;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "tie";
        }
        else if(handSignOfPlayer1.equals("rock")) {
                if (handSignOfPlayer2.equals("scissors")) {
                    return "rock";
                } else if (handSignOfPlayer2.equals("paper")) {
                    return "paper";
                }
        }
        else if (handSignOfPlayer1.equals("scissors")) {
                if (handSignOfPlayer2.equals("rock")) {
                    return "rock";
                } else if (handSignOfPlayer2.equals("paper")) {
                    return "scissors";
                }
        }
        else if (handSignOfPlayer1.equals("paper")) {
            if (handSignOfPlayer2.equals("rock")) {
                return "paper";
            } else if (handSignOfPlayer2.equals("scissors")) {
                return "scissors";
            }
        }
        return "What";
        }
    }

