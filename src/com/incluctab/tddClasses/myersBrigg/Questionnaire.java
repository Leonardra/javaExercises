package com.incluctab.tddClasses.myersBrigg;

import java.util.ArrayList;
import java.util.List;

public class Questionnaire {
    private List<Question> questionList;
    private List<Responses> responseList;
    private final char [][] types = {
            {'E','I'},
            {'S','N'},
            {'T','F'},
            {'J','P'}
    };



    public Questionnaire() {
        questionList = new ArrayList<>();
        responseList = new ArrayList<>();
        Question questionOne = new Question("Expend energy, enjoy groups","Conserve energy, enjoy one-on-one");
        questionList.add(questionOne);
        questionList.add(new Question("Interpret literally", "Look for meaning and possibilities"));
        questionList.add(new Question("Logical, thinking, questioning", "Empathetic, feeling, accommodating"));
        questionList.add(new Question("Organized, orderly", "Flexible, adaptable"));
        questionList.add(new Question("More outgoing, think out loud", "More reserved, think to yourself"));
        questionList.add(new Question("Practical, realistic, experiential", "Imaginative, innovative, theoretical"));
        questionList.add(new Question("Candid, straight forward, frank", "Tactful, kind, encouraging"));
        questionList.add(new Question("Plan, schedule", "Unplanned, spontaneous"));
        questionList.add(new Question("Seek many tasks, public activities, interaction with others",
                                "Seek private, solitary activities with quiet to concentrate"));
        questionList.add(new Question("Standard, usual, conventional", "Different, novel, unique"));
        questionList.add(new Question("Firm, tend to criticize, hold the line", "Gentle, tend to appreciate, conciliate"));
        questionList.add(new Question("Regulated, structured", "Easygoing, “live” and “let live”"));
        questionList.add(new Question("External, communicative, express yourself", "Internal, reticent, keep to yourself"));
        questionList.add(new Question("Focus on here-and-now", "Look to the future, global perspective, “big picture”"));
        questionList.add(new Question("Tough-minded, just", " Tender-hearted, merciful"));
        questionList.add(new Question("Preparation, plan ahead", "Go with the flow, adapt as you go"));
        questionList.add(new Question("Active, initiate", "Reflective, deliberate"));
        questionList.add(new Question("Facts, things, “what is”", "Ideas, dreams, “what could be,” philosophical"));
        questionList.add(new Question("Matter of fact, issue-oriented", "Sensitive, people-oriented, compassionate"));
        questionList.add(new Question("Control, govern", "Latitude, freedom"));

    }

    public List<Question> getQuestion() {
        return questionList;
    }

    public List<Responses> getResponse() {
        return responseList;
    }


    public Responses[] processResponse() {
        Responses[] sums = new Responses[4];
        for (int i = 0; i < responseList.size()/5; i++) {
        sums[i] = new Responses();
            for (int j = i; j < responseList.size(); j+=4) {
                if(responseList.get(j).getResponse()[0]== 1){
                    sums[i].getResponse()[0]++;
                }else{
                    sums[i].getResponse()[1]++;
                }
            }
        }
        return sums;
    }

    public String getPersonalityType() {
        Responses [] sums = processResponse();
        StringBuilder personalityType = new StringBuilder();
        for (int i = 0; i < sums.length; i++) {
            char letter;
            if(sums[i].getResponse()[0] > sums[i].getResponse()[1]){
            letter = types[i][0];
            }else{
            letter = types[i][1];
            }
            personalityType.append(letter);
        }
        return personalityType.toString();
    }
}
