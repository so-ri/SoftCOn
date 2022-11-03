package org.example.ships;

public class coordinate {
    private final positionY CY;
    private final positionX CX;
    private state State;

    public coordinate(positionX v1, positionY v2, state v3){
        this.CX = v1;
        this.CY = v2;
        this.State = v3;
    }

    public positionX getX(){
        //can be returned because its final
        return this.CX;
    }

    public positionY getY(){
        //can be returned because its final
        return this.CY;
    }

    public void hit(){
        this.State = state.STRIKED;
    }

    public Boolean ishit(){
        if(this.State == state.STRIKED){
            return true;
        }
        else{return false;}
    }

}
