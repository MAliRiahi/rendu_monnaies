package com.example.RenduMonnaies;

public class ChangeSolution {
    static Change optimalChange(long s) {
        Change change = new Change();
        if(s%2==0){
            change.setBillet10(s/10);
            change.setPiece2((s%10)/2);
        }else if(s%2!=0 && s>4){
            change.setBillet5(1);
            change.setBillet10((s-5)/10);
            change.setPiece2(((s-5)%10)/2);
        }


        return change;
        }

}
