package com.company;

import java.util.ArrayList;

public class VotingSystem {
    //list of voting
    private ArrayList <Voting> votingList = new ArrayList<>();

    /**
     * constructor
     */
    public VotingSystem(){ }

    /**
     * this method create new voting and add that to list of voting
     * @param type of new voting
     * @param question of new voting
     */
    public void createVoting(int type , String question){
        Voting newVoting = new Voting(type,question);
        votingList.add(newVoting);
    }

    /**
     * this method print voting question
     */
    public void printListOfVotings(){
        int m=0;
        for (Voting voting : votingList){
            System.out.println(m+". "+voting.getQuestion());
            m+=1;}
    }

    /**
     * this method print the question and choices of voting that this index is "index"
     * @param index of voting that we want to see thats information
     */
    public void printVoting(int index){
        votingList.get(index).printQuestionAndChoices();
    }

    /**
     * this method add person choices to voting(index)
     * @param index of voting
     * @param person is who want to vote
     * @param personChoices votes of person
     */
    public void vote(int index,Person person,ArrayList<String> personChoices){
        votingList.get(index).vote(person,personChoices);
    }

    /**
     * this method printing result of voting(index)
     * @param index of voting
     */
    public void printResult(int index){
        votingList.get(index).printResult();
    }

    /**
     * this method add choice to voting(index)
     * @param index of voting we want to add choice to that
     * @param choise (new choice)
     */
    public void addChoiceToVoting(int index , String choise){
        votingList.get(index).createChoice(choise);
    }




}
