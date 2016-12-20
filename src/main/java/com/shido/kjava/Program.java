package com.shido.kjava;

import com.shido.kotlin.Meeting;

/**
 * Created by Teste2 on 19/12/2016.
 */
public class Program {

    public static void main(String[] args) {
        Meeting board = new Meeting("New meeting");
        board.setLocation("London");
        System.out.println(board.getLocation() + " Board wil be");
        board.getTitle(); //Como title é uma val dentro do construtor de Meeting nao tem setTitle
        board.description = "Descrição";
       int version = Meeting.APP_VERSION ;//variavel static dentro do companion object, como é uma val nao tem setter mas tem getter, a nao ser que tenha o @JVMField
        int version2 = Meeting.getAppVersion();

        try {
            board.addAttendee("");
        }catch(Meeting.MeetingException e){
            e.printStackTrace();
        }

    }
}
