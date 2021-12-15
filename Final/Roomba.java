package Final;


public class Roomba implements iRobot{
    final static int UNCLEANED = 0;
    final static int BLOCKED = -1;
    final static int CLEANED = 1;
    int [][] rob;
    Direction currentDirection;
    position currentLocation;

    Roomba (Direction direction,position position,int[][] rob){
        currentDirection =direction;
        currentLocation =position;
        this.rob = rob;
    }

    static class position{
        int x,y;
        position(int x, int y){
            this.x =x;
            this.y =y;
        }
    }

    @Override
    public boolean move() {
        int x = currentLocation.x;
        int y = currentLocation.y;
        if(currentDirection==Direction.DOWN){
            if(y+1<= rob.length-1 && rob[x+1][y]!=-1){
                currentLocation.y= y+1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.UP){

            if(y-1>=0 && rob[x-1][y]!=-1){
                currentLocation.y= y-1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.RIGHT){

            if(x+1<= rob[0].length-1 && rob[x][y+1]!=-1){
                currentLocation.x= x+1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.LEFT){

            if(x-1>=0 && rob[x][y-1]!=-1){
                currentLocation.x= x-1;
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(currentDirection==Direction.UP)currentDirection=Direction.LEFT;
        else if(currentDirection==Direction.LEFT)currentDirection=Direction.DOWN;
        else if(currentDirection==Direction.DOWN)currentDirection=Direction.RIGHT;
        else if(currentDirection==Direction.RIGHT)currentDirection=Direction.UP;
    }

    @Override
    public void turnRight() {
        if(currentDirection==Direction.UP)currentDirection=Direction.RIGHT;
        else if(currentDirection==Direction.RIGHT)currentDirection=Direction.DOWN;
        else if(currentDirection==Direction.DOWN)currentDirection=Direction.LEFT;
        else if(currentDirection==Direction.LEFT)currentDirection=Direction.UP;
    }

    @Override
    public void clean() {
        if(rob !=null){
            rob[currentLocation.x][currentLocation.y]=1;
        }

    }
}